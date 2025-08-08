package Producto;

/**
 *
 * @author juant
 */

import Codigo.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProductoDAO {

    public static String obtenerNombre(String codigo) {
        String nombre = null;
        String query = "{CALL sp_obtenerNombre(?)}";
        try (Connection connection = Conexion.obtenerConexion();
             CallableStatement cs = connection.prepareCall(query)) {
            cs.setString(1, codigo);
            ResultSet rs = cs.executeQuery();
            if (rs.next()) {
                nombre = rs.getString("Nombre");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nombre;
    }
    public static double obtenerPrecio(String codigo) {
           double precio = 0.0;
           String query = "{CALL sp_obtenerPrecio(?)}";
           try (Connection connection = Conexion.obtenerConexion();
                CallableStatement cs = connection.prepareCall(query)) {
               cs.setString(1, codigo);
               ResultSet rs = cs.executeQuery();
               if (rs.next()) {
                   precio = rs.getDouble("Precio");
               }
           } catch (SQLException e) {
               e.printStackTrace();
           }
           return precio;
       }

        public static String obtenerCategoria(String codigo) {
            String categoria = null;
            String query = "{CALL sp_obtenerCategoria(?)}";
            try (Connection connection = Conexion.obtenerConexion();
                 CallableStatement cs = connection.prepareCall(query)) {
                cs.setString(1, codigo);
                ResultSet rs = cs.executeQuery();
                if (rs.next()) {
                    categoria = rs.getString("Categoria");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return categoria;
        }
    
    public static void guardarProducto(String nombre, double precio, String habitacion, double stock) {
        String query = "{CALL sp_guardarProducto(?, ?, ?, ?)}";

        try (Connection conexion = Conexion.obtenerConexion();
             CallableStatement cs = conexion.prepareCall(query)) {

            cs.setString(1, nombre);
            cs.setDouble(2, precio);
            cs.setString(3, habitacion);
            cs.setDouble(4, stock);

            ResultSet rs = cs.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, rs.getString("Mensaje"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el producto: " + e.getMessage());
            e.printStackTrace();
        }
    }


}

