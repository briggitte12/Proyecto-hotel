
package Producto;

/**
 *
 * @author juant
 */
import Codigo.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReservaProductoDAO {

        public static void guardarReservaProducto(String idReserva, int idProducto, String nombre, double cantidad, double precioTotal) {
        try (Connection conexion = Conexion.obtenerConexion()) {
            String sql = "INSERT INTO Reserva_Producto (IdReserva_producto, IdProducto, Nombre_Prod, Cantidad_Prod, PrecioTotal_Prod) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, idReserva);
                statement.setInt(2, idProducto);
                statement.setString(3, nombre);
                statement.setDouble(4, cantidad);
                statement.setDouble(5, precioTotal);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}

