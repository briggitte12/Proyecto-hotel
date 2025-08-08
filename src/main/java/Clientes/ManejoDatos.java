package Clientes;

import Codigo.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ManejoDatos {

    private ClienteDAO clienteDAO;
    private Conexion conexion;
    private JTable tablaHabitacion;

    
    
    public ManejoDatos(JTable tablaHabitacion) {
        clienteDAO = new ClienteDAO();
        this.conexion = new Conexion();
        this.tablaHabitacion = tablaHabitacion;
    }

  

 public void guardarDatosClienteReserva(Cliente cliente) {
    try (Connection conn = conexion.obtenerConexion()) {
        // Insertar datos en la tabla Cliente
        String sqlInsertCliente = "INSERT INTO Cliente (NombreCli, ApellidoPat_Cli, ApellidoMat_Cli, TipoDocumento, NumeroDoc) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmtCliente = conn.prepareStatement(sqlInsertCliente, PreparedStatement.RETURN_GENERATED_KEYS)) {
            pstmtCliente.setString(1, cliente.getNombres());
            pstmtCliente.setString(2, cliente.getApellidoPat());
            pstmtCliente.setString(3, cliente.getApellidoMat());
            pstmtCliente.setString(4, cliente.getTipoDocumento());
            pstmtCliente.setString(5, cliente.getNumeroDoc());
            pstmtCliente.executeUpdate();

            // Obtener el ID de cliente recién insertado
            int idCliente;
            try (ResultSet generatedKeys = pstmtCliente.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    idCliente = generatedKeys.getInt(1);

                    // Insertar datos en la tabla Reserva, utilizando IdCliente
                    String sqlInsertReserva = "INSERT INTO Reserva (IdCliente, Fecha_Ingreso, Fecha_Salida) VALUES (?, ?, ?)";
                    try (PreparedStatement pstmtReserva = conn.prepareStatement(sqlInsertReserva, PreparedStatement.RETURN_GENERATED_KEYS)) {
                        pstmtReserva.setInt(1, idCliente);
                        pstmtReserva.setDate(2, new java.sql.Date(cliente.getFechaIngreso().getTime()));
                        pstmtReserva.setDate(3, new java.sql.Date(cliente.getFechaSalida().getTime()));
                        pstmtReserva.executeUpdate();

                        // Obtener el ID de la reserva recién insertada
                        int idReserva;
                        try (ResultSet generatedReservaKeys = pstmtReserva.getGeneratedKeys()) {
                            if (generatedReservaKeys.next()) {
                                idReserva = generatedReservaKeys.getInt(1);

                                // Asignar la reserva a una habitación disponible
                                int idHabitacionSeleccionada = obtenerIdHabitacionSeleccionada();

                                if (idHabitacionSeleccionada != -1) {
                                    // Asignar la reserva a la habitación seleccionada
                                    asignarReservaAHabitacion(conn, idReserva, idHabitacionSeleccionada);

                                    // Actualizar el estado de la habitación a "Reservado"
                                    actualizarEstadoHabitacion(conn, idHabitacionSeleccionada);

                                    // Notificar al usuario que los datos se han guardado correctamente
                                    JOptionPane.showMessageDialog(null, "Los datos se han guardado correctamente en la base de datos", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    // Manejar el caso en el que no se ha seleccionado una habitación
                                    JOptionPane.showMessageDialog(null, "No se ha seleccionado una habitación", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    }
                }
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error SQL: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error al guardar datos en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
    }
}







    // Método de ejemplo para obtener el Id de la habitación seleccionada desde tu JTable
    private int obtenerIdHabitacionSeleccionada() {
           int filaSeleccionada = tablaHabitacion.getSelectedRow();

           // Verificar si hay una fila seleccionada
           if (filaSeleccionada != -1) {
               // Obtener el valor de la primera columna (columna 0) que contiene el ID de la habitación
               Object valor = tablaHabitacion.getValueAt(filaSeleccionada, 0);

               // Verificar si el valor es un entero
               if (valor instanceof Integer) {
                   return (int) valor;
               } else {
                   // Manejar el caso en el que el valor no sea un entero
                   System.out.println("El valor de la primera columna no es un entero.");
               }
           } else {
               // Manejar el caso en el que no hay una fila seleccionada
               System.out.println("No hay una fila seleccionada.");
           }

           // Valor predeterminado en caso de error
           return -1;
       }


    public static int insertarReserva(int idCliente, Date fechaIngreso, Date fechaSalida) {
        String sql = "{CALL sp_insertarReserva(?, ?, ?)}";

        try (Connection conn = Conexion.obtenerConexion();
             CallableStatement cs = conn.prepareCall(sql)) {

            cs.setInt(1, idCliente);
            cs.setDate(2, new java.sql.Date(fechaIngreso.getTime()));
            cs.setDate(3, new java.sql.Date(fechaSalida.getTime()));

            ResultSet rs = cs.executeQuery();
            if (rs.next()) {
                return rs.getInt("IdReserva"); // Obtener el ID generado
            }

            return -1; // En caso de que no se haya generado el ID
        } catch (SQLException e) {
            e.printStackTrace();
            return -1; // En caso de error
        }
    }

    
    private void actualizarEstadoHabitacion(Connection conn, int idReserva) {
        String sql = "{CALL sp_actualizarEstadoHabitacion(?)}";

        try (CallableStatement cs = conn.prepareCall(sql)) {
            cs.setInt(1, idReserva);
            cs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error SQL: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al actualizar el estado de la habitación", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
 private void asignarReservaAHabitacion(Connection conn, int idReserva, int idHabitacionSeleccionada) {
        String sql = "{CALL sp_asignarReservaAHabitacion(?, ?)}";

        try (CallableStatement cs = conn.prepareCall(sql)) {
            cs.setInt(1, idReserva);
            cs.setInt(2, idHabitacionSeleccionada);
            cs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error SQL: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al asignar reserva a habitación", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    public DefaultTableModel obtenerDatosClientesReservas() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Apellido Paterno");
        model.addColumn("Apellido Materno");
        model.addColumn("Tipo Documento");
        model.addColumn("Número Documento");
        model.addColumn("Fecha Ingreso");
        model.addColumn("Fecha Salida");

        try (Connection conn = conexion.obtenerConexion();
             PreparedStatement pstmt = conn.prepareCall("{CALL sp_obtenerDatosClientesReservas}");
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Object[] row = {
                        rs.getString("NombreCli"),
                        rs.getString("ApellidoPat_Cli"),
                        rs.getString("ApellidoMat_Cli"),
                        rs.getString("TipoDocumento"),
                        rs.getString("NumeroDoc"),
                        rs.getDate("Fecha_Ingreso"),
                        rs.getDate("Fecha_Salida")
                };
                model.addRow(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error SQL: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al obtener datos de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return model;
    }
    
     public void eliminarClienteYReserva(int idCliente) {
        String sql = "{CALL sp_eliminarClienteYReserva(?)}";

        try (Connection conn = conexion.obtenerConexion();
             CallableStatement cs = conn.prepareCall(sql)) {

            cs.setInt(1, idCliente);
            cs.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cliente y reserva eliminados correctamente",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error SQL: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al eliminar cliente y reserva",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
  
}
