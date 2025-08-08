
package QuejasReclamos;

import Codigo.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;

public class QuejasReclamosCRUD {
    private Conexion conexion;

    public QuejasReclamosCRUD() {
        conexion = new Conexion();
    }

    public DefaultTableModel listarReportes() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("IdReporte");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Estado");
        modelo.addColumn("TipoReporte");

        try (Statement stmt = conexion.obtenerConexion().createStatement();
             ResultSet rs = stmt.executeQuery("{CALL sp_listarReportes}")) {

            while (rs.next()) {
                Object[] fila = new Object[4];
                fila[0] = rs.getInt("IdReporte");
                fila[1] = rs.getString("Descripcion");
                fila[2] = rs.getString("Estado_Reporte");
                fila[3] = rs.getString("Tipo_Reporte");
                modelo.addRow(fila);
            }
            return modelo;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al listar reportes: " + e);
            return null;
        }
    }

    public boolean insertarReporte(String tipoReporte, String descripcion, String estado) {
        String sql = "{CALL sp_insertarReporte(?, ?, ?)}";

        try (CallableStatement cs = conexion.obtenerConexion().prepareCall(sql)) {
            cs.setString(1, tipoReporte);
            cs.setString(2, descripcion);
            cs.setString(3, estado);

            cs.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar reporte: " + e);
            return false;
        }
    }
}