package Producto;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juant
 */
public class ServicioProductos {
    private DefaultTableModel model;

    public ServicioProductos(DefaultTableModel model) {
        this.model = model;
    }

    public void guardarProducto(int codigo, String nombre, int cantidad, double precio, int numeroHab, int stock, String categoria) {
        // Verificar que todos los campos estén llenos
        if (nombre.isEmpty() || cantidad == 0 || precio == 0 || numeroHab == 0 || stock == 0 || categoria.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Agregar los datos a la tabla
        Object[] row = { codigo, nombre, cantidad, precio, numeroHab, stock, categoria };
        model.addRow(row);
    }
}
