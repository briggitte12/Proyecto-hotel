
package Habitacion;

import Clientes.Cliente;
import Clientes.ManejoDatos;
import Codigo.Conexion;
import java.awt.Color;
import java.awt.Component;
import java.sql.CallableStatement;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class HabitacionManager {

   public static void actualizarTabla(JTable tablaHabitacion, String tipoOrden) {
    try {
        Connection connection = Conexion.obtenerConexion();
        String sql = "{CALL sp_actualizarTabla(?)}";  // Llamada al procedimiento almacenado en SQL SERVER

        CallableStatement cs = connection.prepareCall(sql);
        cs.setString(1, tipoOrden);

        ResultSet rs = cs.executeQuery();

        DefaultTableModel modelo = (DefaultTableModel) tablaHabitacion.getModel();
        modelo.setRowCount(0);
        while (rs.next()) {
            // Asegúrate de seleccionar los datos correctos de la consulta
            int idHabitacion = rs.getInt("IdHabitacion");
            String numeroHabitacion = rs.getString("Numero_Habitacion");
            String nombreEstado = rs.getString("Nombre_Est");
            String nombreTipoHabitacion = rs.getString("Nombre_Hab");
            modelo.addRow(new Object[]{idHabitacion, numeroHabitacion, nombreEstado, nombreTipoHabitacion});
        }

        // Aplicar el renderizador a la tabla
        tablaHabitacion.setDefaultRenderer(Object.class, new CustomRenderer());

        // Actualizar la visualización de la tabla
        tablaHabitacion.repaint();
        
        int indiceColumnaId = tablaHabitacion.getColumnModel().getColumnIndex("IdHabitacion");
        tablaHabitacion.getColumnModel().getColumn(indiceColumnaId).setWidth(0);
        tablaHabitacion.getColumnModel().getColumn(indiceColumnaId).setMinWidth(0);
        tablaHabitacion.getColumnModel().getColumn(indiceColumnaId).setMaxWidth(0);
        tablaHabitacion.getColumnModel().getColumn(indiceColumnaId).setPreferredWidth(0);

    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    private static class CustomRenderer extends DefaultTableCellRenderer {
        int columnaEstadoHabitacion = 2; // Cambia esto al índice correcto de la columna "Estado Habitación"

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            // Obtener el valor de la columna "Estado Habitación" para la fila actual
            String estadoHabitacion = (String) table.getValueAt(row, columnaEstadoHabitacion);

            // Cambiar el color de fondo de la fila dependiendo del valor de "Estado Habitación"
            if ("Disponible".equals(estadoHabitacion)) {
                c.setBackground(Color.GREEN);
            } else if ("Reservado".equals(estadoHabitacion)) {
                c.setBackground(Color.RED);
            } else if ("Mantenimiento".equals(estadoHabitacion)) {
                c.setBackground(Color.CYAN);
            } else {
                c.setBackground(table.getBackground());
            }

            return c;
        }
    }
    
    public static void llenarDatosEnModelo(DefaultTableModel modelo) {
     try {
         Connection connection = Conexion.obtenerConexion();
         String sql = "{CALL sp_llenarDatosEnModelo}";

         CallableStatement cs = connection.prepareCall(sql);
         ResultSet rs = cs.executeQuery();

         modelo.setRowCount(0); // Limpiar la tabla

         while (rs.next()) {
             String numeroHabitacion = rs.getString("Numero_Habitacion");
             String nombreEstado = rs.getString("Nombre_Est");
             String nombreTipoHabitacion = rs.getString("Nombre_Hab");
             modelo.addRow(new Object[]{numeroHabitacion, nombreEstado, nombreTipoHabitacion});
         }

         // Cierra la conexión y otros recursos

     } catch (SQLException e) {
         e.printStackTrace();
     }
 }

    
}



