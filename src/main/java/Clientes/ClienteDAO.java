
package Clientes;


import Codigo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import java.sql.ResultSet;

import java.sql.SQLException;


public class ClienteDAO {

    public static boolean insertarCliente(
            String nombres,
            String apellidoPat,
            String apellidoMat,
            String tipoDocumento,
            String numeroDoc,
            String tipoHabitacion,
            Date fechaIngreso,
            Date fechaSalida
    ) {
        String sqlInsertCliente = "INSERT INTO Cliente (NombreCli, ApellidoPat_Cli, ApellidoMat_Cli, TipoDoc, NumeroDocumento) VALUES (?, ?, ?, ?, ?)";
        String sqlInsertReserva = "INSERT INTO Reserva (TipoHabitacion, Fecha_Ingreso, Fecha_Salida) VALUES (?, ?, ?)";
        String sqlAsignarReserva = "UPDATE Habitacion SET IdReserva = ? WHERE Tipo_Hab = ? AND IdReserva IS NULL";

        try (Connection conn = Conexion.obtenerConexion();
             PreparedStatement pstmtInsertCliente = conn.prepareStatement(sqlInsertCliente, PreparedStatement.RETURN_GENERATED_KEYS);
             PreparedStatement pstmtInsertReserva = conn.prepareStatement(sqlInsertReserva, PreparedStatement.RETURN_GENERATED_KEYS);
             PreparedStatement pstmtAsignarReserva = conn.prepareStatement(sqlAsignarReserva)) {

            conn.setAutoCommit(false); // Desactivar la confirmación automática para gestionar manualmente la transacción

            // Insertar cliente
            pstmtInsertCliente.setString(1, nombres);
            pstmtInsertCliente.setString(2, apellidoPat);
            pstmtInsertCliente.setString(3, apellidoMat);
            pstmtInsertCliente.setString(4, tipoDocumento);
            pstmtInsertCliente.setString(5, numeroDoc);
            int filasAfectadasCliente = pstmtInsertCliente.executeUpdate();

            if (filasAfectadasCliente > 0) {
                // Obtener el ID del cliente recién insertado
                ResultSet generatedKeysCliente = pstmtInsertCliente.getGeneratedKeys();
                int idClienteInsertado = -1;
                if (generatedKeysCliente.next()) {
                    idClienteInsertado = generatedKeysCliente.getInt(1);
                }
                generatedKeysCliente.close();

                // Insertar reserva
                pstmtInsertReserva.setString(1, tipoHabitacion);
                pstmtInsertReserva.setDate(2, new java.sql.Date(fechaIngreso.getTime()));
                pstmtInsertReserva.setDate(3, new java.sql.Date(fechaSalida.getTime()));
                int filasAfectadasReserva = pstmtInsertReserva.executeUpdate();

                if (filasAfectadasReserva > 0) {
                    // Obtener el ID de la reserva recién insertada
                    ResultSet generatedKeysReserva = pstmtInsertReserva.getGeneratedKeys();
                    int idReservaInsertada = -1;
                    if (generatedKeysReserva.next()) {
                        idReservaInsertada = generatedKeysReserva.getInt(1);
                    }
                    generatedKeysReserva.close();

                    // Asignar reserva a la habitación
                    pstmtAsignarReserva.setInt(1, idReservaInsertada);
                    pstmtAsignarReserva.setString(2, tipoHabitacion);
                    int filasAfectadasAsignacion = pstmtAsignarReserva.executeUpdate();

                    if (filasAfectadasAsignacion > 0) {
                        conn.commit(); // Confirmar la transacción
                        return true;
                    }
                }
            }

            conn.rollback(); // Deshacer la transacción si algo falla
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}

