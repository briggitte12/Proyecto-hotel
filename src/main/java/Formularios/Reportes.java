package Formularios;

import QuejasReclamos.QuejasReclamosCRUD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juant
 */
public class Reportes extends javax.swing.JFrame {


    public Reportes() {
        initComponents();
        cbEstado.setSelectedItem("Activo");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaReporte = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Quejas y Reclamos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Descripcion:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txaDescripcion.setColumns(20);
        txaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txaDescripcion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 241, 63));

        jLabel3.setText("Estado:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 60, 30));

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "En progreso", "Finalizado" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });
        jPanel2.add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 173, -1));

        tablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N° Reporte", "Descripcion", "Estado", "Tipo de Reporte"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaReporte);
        if (tablaReporte.getColumnModel().getColumnCount() > 0) {
            tablaReporte.getColumnModel().getColumn(0).setResizable(false);
            tablaReporte.getColumnModel().getColumn(1).setResizable(false);
            tablaReporte.getColumnModel().getColumn(2).setResizable(false);
            tablaReporte.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 293, 450, 230));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Salir");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 20, 80, 32));

        jLabel4.setText("Tipo de reporte:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 97, -1));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reporte de pago ", "Reporte del cliente", "Reporte de productos", "Reporte por habitacion" }));
        jPanel2.add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 240, -1));

        btnGuardar.setText("Generar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 90, 30));

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel2.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 80, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        PaginaPrincipal principal = new PaginaPrincipal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String tipoReporte = cbTipo.getSelectedItem().toString();
    String descripcion = txaDescripcion.getText();
    String estado = cbEstado.getSelectedItem().toString();

    QuejasReclamosCRUD crud = new QuejasReclamosCRUD();
    if (crud.insertarReporte(tipoReporte, descripcion, estado)) {
        JOptionPane.showMessageDialog(this, "Reporte generado correctamente");
    } else {
        JOptionPane.showMessageDialog(this, "Error al generar el reporte");
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
         QuejasReclamosCRUD crud = new QuejasReclamosCRUD();
    DefaultTableModel modelo = crud.listarReportes();

    if (modelo != null) {
        tablaReporte.setModel(modelo);
    } else {
        JOptionPane.showMessageDialog(this, "Error al listar reportes");
    }
    }//GEN-LAST:event_btnListarActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaReporte;
    private javax.swing.JTextArea txaDescripcion;
    // End of variables declaration//GEN-END:variables
}
