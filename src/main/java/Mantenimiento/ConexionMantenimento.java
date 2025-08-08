/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mantenimiento;

import Codigo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juant
 */
public class ConexionMantenimento {
      public static DefaultTableModel obtenerDatosReservas() {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0; 
            }
        };

        modelo.addColumn("IdHabitacion");
        modelo.addColumn("Numero_Habitacion");
        modelo.addColumn("Fecha_Ingreso");
        modelo.addColumn("Fecha_Salida");
        modelo.addColumn("Nombre_Est");

        try (Connection conexion = Conexion.obtenerConexion();
             PreparedStatement statement = conexion.prepareStatement("SELECT H.IdHabitacion, H.Numero_Habitacion, R.Fecha_Ingreso, R.Fecha_Salida, EH.Nombre_Est " +
                     "FROM Reserva as R INNER JOIN Habitacion as H ON R.IdReserva = H.IdReserva " +
                     "INNER JOIN Estado_Hab as EH ON H.IdEstado = EH.IdEstado_Hab");
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Object[] fila = new Object[5];
                fila[0] = resultSet.getInt("IdHabitacion");
                fila[1] = resultSet.getString("Numero_Habitacion");
                fila[2] = resultSet.getDate("Fecha_Ingreso");
                fila[3] = resultSet.getDate("Fecha_Salida");
                fila[4] = resultSet.getString("Nombre_Est");
                modelo.addRow(fila);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return modelo;
    }
}
