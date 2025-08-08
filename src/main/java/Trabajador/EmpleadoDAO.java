
package Trabajador;

import Codigo.Conexion;
import java.sql.CallableStatement;

import javax.swing.JTable;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import javax.swing.table.DefaultTableModel;


public class EmpleadoDAO {

   public static void actualizarTabla(JTable TablaRegistro) {
        String sql = "{CALL sp_actualizarTablaEmpleado}";

        try (Connection c = Conexion.obtenerConexion();
             CallableStatement cs = c.prepareCall(sql);
             ResultSet rs = cs.executeQuery()) {

            DefaultTableModel model = (DefaultTableModel) TablaRegistro.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                String nombre = rs.getString("Nombre");
                String apellidoPat = rs.getString("Apellido Pat.");
                String apellidoMat = rs.getString("Apellido Mat.");
                java.sql.Date fechaNac = rs.getDate("Fecha Nac.");
                String direccion = rs.getString("Direccion");
                String login = rs.getString("Login");
                String estado = rs.getString("Estado");

                model.addRow(new Object[]{nombre, apellidoPat, apellidoMat, fechaNac, direccion, login, estado});
            }
        } catch (SQLException e) {
            // Manejar la excepción
            System.out.println("Ocurrió un error al actualizar la tabla: " + e.getMessage());
        }
    }
    
      public static void guardarEmpleado(Trabajador empleado) throws SQLException {
       try (Connection c = Conexion.obtenerConexion()) {
           String sql = "{call uds_GuardarEmpleado(?, ?, ?, ?, ?, ?, ?, ?, ?)}";
           try (CallableStatement cstmt = c.prepareCall(sql)) {
               cstmt.setString(1, empleado.getNombre());
               cstmt.setString(2, empleado.getApellidoPat());
               cstmt.setString(3, empleado.getApellidoMat());
               cstmt.setDate(4, new java.sql.Date(empleado.getFechaNac().getTime()));
               cstmt.setString(5, empleado.getDireccion());
               cstmt.setString(6, empleado.getEstado());
               cstmt.setString(7, empleado.getLogin());
               cstmt.setString(8, empleado.getContrasena());
               cstmt.setString(9, empleado.getTelefono());

               cstmt.execute();
           }
       }
   }
      
       public static void eliminarEmpleado(int idEmpleado) {
        try (Connection c = Conexion.obtenerConexion()) {
            String sql = "{call sp_eliminarEmpleado(?)}";
            try (CallableStatement cstmt = c.prepareCall(sql)) {
                cstmt.setInt(1, idEmpleado);
                cstmt.execute();
            }
        } catch (SQLException e) {
            // Manejar la excepción
            System.out.println("Ocurrió un error al eliminar el empleado: " + e.getMessage());
        }
    }
       
        public List<Trabajador> obtenerEmpleadosDesdeBaseDeDatos() {
        List<Trabajador> listaEmpleados = new ArrayList<>();
        String query = "SELECT idEmpleado, Nombre_Emp, Apellido_Pat_Emp, Apellido_Mat_Emp, Estado_Emp FROM Empleado";

        try (Connection conn = Conexion.obtenerConexion();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Trabajador empleado = new Trabajador();
                empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                empleado.setNombre(rs.getString("Nombre_Emp"));
                empleado.setApellidoPat(rs.getString("Apellido_Pat_Emp"));
                empleado.setApellidoMat(rs.getString("Apellido_Mat_Emp"));
                empleado.setEstado(rs.getString("Estado_Emp"));

                listaEmpleados.add(empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaEmpleados;
    }
}

