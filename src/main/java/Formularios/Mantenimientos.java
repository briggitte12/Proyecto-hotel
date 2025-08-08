
package Formularios;

import Codigo.Conexion;
import Mantenimiento.ConexionMantenimento;
import Trabajador.EmpleadoDAO;
import Trabajador.Trabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juant
 */
public class Mantenimientos extends javax.swing.JFrame {
    private final EmpleadoDAO empleadoDAO;
  
    public Mantenimientos() {
        initComponents();
        llenarTabla();
        empleadoDAO = new EmpleadoDAO();
        actualizarTabla();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMantenimiento = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaEmpleado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Estado habitaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        TablaMantenimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdHabitacion", "Numero Habitacion", "Fecha Ingreso", "Fecha Salida", "Estado Habitacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMantenimientoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaMantenimiento);
        if (TablaMantenimiento.getColumnModel().getColumnCount() > 0) {
            TablaMantenimiento.getColumnModel().getColumn(0).setResizable(false);
            TablaMantenimiento.getColumnModel().getColumn(1).setResizable(false);
            TablaMantenimiento.getColumnModel().getColumn(2).setResizable(false);
            TablaMantenimiento.getColumnModel().getColumn(3).setResizable(false);
            TablaMantenimiento.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Estado Empleados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        TablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdEmpleado", "Nombre", "Apellido_Pat", "Apellido_Mat", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaEmpleado.getTableHeader().setReorderingAllowed(false);
        TablaEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaEmpleado);
        if (TablaEmpleado.getColumnModel().getColumnCount() > 0) {
            TablaEmpleado.getColumnModel().getColumn(0).setResizable(false);
            TablaEmpleado.getColumnModel().getColumn(1).setResizable(false);
            TablaEmpleado.getColumnModel().getColumn(2).setResizable(false);
            TablaEmpleado.getColumnModel().getColumn(3).setResizable(false);
            TablaEmpleado.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void actualizarTabla() {
     DefaultTableModel model = (DefaultTableModel) TablaEmpleado.getModel();
     model.setRowCount(0);

     List<Trabajador> listaEmpleados = empleadoDAO.obtenerEmpleadosDesdeBaseDeDatos();

     for (Trabajador empleado : listaEmpleados) {
         model.addRow(new Object[]{
                 empleado.getIdEmpleado(),
                 empleado.getNombre(),
                 empleado.getApellidoPat(),
                 empleado.getApellidoMat(),
                 empleado.getEstado()
         });
     }
 }

    private void TablaMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMantenimientoMouseClicked
      int selectedRow = TablaMantenimiento.getSelectedRow();
    if (selectedRow != -1) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea realizar mantenimiento a la habitación?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            int idHabitacion = (int) TablaMantenimiento.getValueAt(selectedRow, 0);
            actualizarEstadoMantenimiento(idHabitacion);
            llenarTabla();
        }
    }
    }//GEN-LAST:event_TablaMantenimientoMouseClicked

    private void TablaEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEmpleadoMouseClicked
          int filaSeleccionada = TablaEmpleado.getSelectedRow();
        int columnaEstado = TablaEmpleado.getColumn("Estado").getModelIndex(); // Ajusta esto según tu JTable

        if (filaSeleccionada != -1 && evt.getClickCount() == 1) {
            String estadoActual = (String) TablaEmpleado.getValueAt(filaSeleccionada, columnaEstado);

            // Definir las opciones para el nuevo estado
            Object[] opciones = {"Activo", "Vacaciones", "Despedido"};

            // Mostrar el cuadro de diálogo de selección
            Object seleccion = JOptionPane.showInputDialog(
                    null,
                    "Seleccione el nuevo estado:",
                    "Cambiar estado de empleado",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    estadoActual);

            if (seleccion != null && !seleccion.equals(estadoActual)) {
                // Actualizar el estado en la base de datos
                int idEmpleado = (int) TablaEmpleado.getValueAt(filaSeleccionada, 0); // Ajusta esto según la posición de la columna IdEmpleado
                actualizarEstadoEmpleadoEnBaseDeDatos(idEmpleado, seleccion.toString());

                // Actualizar el estado en el JTable
                TablaEmpleado.setValueAt(seleccion, filaSeleccionada, columnaEstado);
            }
        }
    }//GEN-LAST:event_TablaEmpleadoMouseClicked
    public void actualizarEstadoEmpleadoEnBaseDeDatos(int idEmpleado, String nuevoEstado) {
     String sql = "UPDATE Empleado SET Estado_Emp = ? WHERE IdEmpleado = ?";

     try (Connection conn = Conexion.obtenerConexion();
          PreparedStatement pstmt = conn.prepareStatement(sql)) {

         pstmt.setString(1, nuevoEstado);
         pstmt.setInt(2, idEmpleado);
         pstmt.executeUpdate();

     } catch (SQLException e) {
         e.printStackTrace();
         JOptionPane.showMessageDialog(null, "Error al actualizar el estado del empleado", "Error", JOptionPane.ERROR_MESSAGE);
     }
 }

    
    
    
    private void llenarTabla() {
      DefaultTableModel modelo = ConexionMantenimento.obtenerDatosReservas();

      // Oculta la columna "IdHabitacion" si se encuentra
      ocultarColumna("IdHabitacion", TablaMantenimiento);

      TablaMantenimiento.setModel(modelo);
  }

    private void ocultarColumna(String nombreColumna, JTable tabla) {
    int columnIndex = -1;
    for (int i = 0; i < tabla.getColumnCount(); i++) {
        if (tabla.getColumnName(i).equals(nombreColumna)) {
            columnIndex = i;
            break;
        }
    }

    if (columnIndex != -1) {
        tabla.getColumnModel().getColumn(columnIndex).setMinWidth(0);
        tabla.getColumnModel().getColumn(columnIndex).setMaxWidth(0);
        tabla.getColumnModel().getColumn(columnIndex).setWidth(0);
    } else {
        System.out.println("La columna '" + nombreColumna + "' no se encuentra en la tabla.");
    }
}

// Dentro de la clase Mantenimientos
private void actualizarEstadoMantenimiento(int idHabitacion) {
    try (Connection conexion = Conexion.obtenerConexion();
         PreparedStatement statement = conexion.prepareStatement("UPDATE Habitacion SET IdEstado = 2 WHERE IdHabitacion = ?")) {

        // Establece el parámetro en la sentencia SQL
        statement.setInt(1, idHabitacion);

        // Ejecuta la actualización
        int filasActualizadas = statement.executeUpdate();

        if (filasActualizadas > 0) {
            JOptionPane.showMessageDialog(null, "CAMBIO DE ESTADO A MANTENIMIENTO EXITOSO.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al realizar el mantenimiento.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error de base de datos al realizar el mantenimiento.");
    }
}



   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEmpleado;
    private javax.swing.JTable TablaMantenimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
