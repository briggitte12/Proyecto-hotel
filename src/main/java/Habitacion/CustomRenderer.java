/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Habitacion;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomRenderer extends DefaultTableCellRenderer {
    int columnaEstadoHabitacion = 3; // Cambia esto al índice correcto de la columna "Estado Habitación"

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Obtener el valor de la columna "Estado Habitación" para la fila actual
        String estadoHabitacion = (String) table.getValueAt(row, columnaEstadoHabitacion);

        // Cambiar el color de fondo de la fila dependiendo del valor de "Estado Habitación"
        if ("Disponible".equals(estadoHabitacion)) {
            c.setBackground(Color.GREEN);
        } else if ("Ocupado".equals(estadoHabitacion)) {
            c.setBackground(Color.RED);
        } else if ("Mantenimiento".equals(estadoHabitacion)) {
            c.setBackground(Color.BLUE);
        } else {
            c.setBackground(table.getBackground());
        }

        return c;
    }
    
    
   
}

