package Formularios;

import Codigo.Conexion;
import Trabajador.EmpleadoDAO;
import Trabajador.Trabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Trabajadores extends javax.swing.JFrame {


    public Trabajadores() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPat = new javax.swing.JTextField();
        txtApellidoMat = new javax.swing.JTextField();
        dtFechaNac = new com.toedter.calendar.JDateChooser();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        cbAcceso = new javax.swing.JComboBox<>();
        txtlogin = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        cbEstado = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRegistro = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Datos del Trabajador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Estado:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 70, -1));

        jLabel3.setText("Apellido Paterno:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, -1));

        jLabel4.setText("Apellido Materno:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, -1));

        jLabel5.setText("Nombre:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, -1));

        jLabel7.setText("Tipo Acceso: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 70, -1));

        jLabel8.setText("Login:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 70, -1));

        jLabel9.setText("Password:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 70, -1));

        jLabel11.setText("Fecha Nacimiento:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, -1));

        jLabel13.setText("Direccion:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 100, -1));

        jLabel14.setText("Telefono:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 70, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 180, -1));
        jPanel2.add(txtApellidoPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 180, -1));
        jPanel2.add(txtApellidoMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 180, -1));
        jPanel2.add(dtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 180, -1));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 200, -1));
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 180, -1));

        cbAcceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Administrador" }));
        cbAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAccesoActionPerformed(evt);
            }
        });
        jPanel2.add(cbAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 200, -1));
        jPanel2.add(txtlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 200, -1));

        txtContrasena.setText("jPasswordField1");
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        jPanel2.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 200, -1));

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo ", "Vacaciones", "Despedido" }));
        jPanel2.add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 200, -1));

        jButton2.setText("Nuevo");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 70, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 650, 320));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE TRABAJADORES");

        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                .addGap(79, 79, 79)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 40));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Lista de Registro de Trabajadores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 0, 14))); // NOI18N

        TablaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido Pat.", "Apellido Mat.", "Fecha Nac.", "Direccion", "Login", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaRegistro);
        if (TablaRegistro.getColumnModel().getColumnCount() > 0) {
            TablaRegistro.getColumnModel().getColumn(0).setResizable(false);
            TablaRegistro.getColumnModel().getColumn(1).setResizable(false);
            TablaRegistro.getColumnModel().getColumn(2).setResizable(false);
            TablaRegistro.getColumnModel().getColumn(3).setResizable(false);
            TablaRegistro.getColumnModel().getColumn(4).setResizable(false);
            TablaRegistro.getColumnModel().getColumn(5).setResizable(false);
            TablaRegistro.getColumnModel().getColumn(6).setResizable(false);
        }

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnActualizar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 920, 180));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\Logo_kingPNG-removebg-preview_1.png")); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 180));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\trabajadores1-removebg-preview.png")); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        PaginaPrincipal principal = new PaginaPrincipal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalirActionPerformed
    
   
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     if (txtNombre.getText().isEmpty() || txtApellidoPat.getText().isEmpty() || txtApellidoMat.getText().isEmpty() ||
        dtFechaNac.getDate() == null || txtDireccion.getText().isEmpty() || cbEstado.getSelectedItem() == null ||
        txtTelefono.getText().isEmpty() || txtlogin.getText().isEmpty() || txtContrasena.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas guardar los datos?", "Confirmación", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        try {
            // Crear una instancia de Trabajador
            Trabajador empleado = new Trabajador();
            empleado.setNombre(txtNombre.getText());
            empleado.setApellidoPat(txtApellidoPat.getText());
            empleado.setApellidoMat(txtApellidoMat.getText());
            empleado.setFechaNac(dtFechaNac.getDate());
            empleado.setDireccion(txtDireccion.getText());
            empleado.setEstado(cbEstado.getSelectedItem().toString());
            empleado.setLogin(txtlogin.getText());
            empleado.setContrasena(txtContrasena.getText());
            empleado.setTelefono(txtTelefono.getText());

            EmpleadoDAO.guardarEmpleado(empleado);

            JOptionPane.showMessageDialog(null, "Se guardaron los datos correctamente.");
            limpiarCampos();
            EmpleadoDAO.actualizarTabla(TablaRegistro);

        } catch (SQLException e) {
            // Manejar la excepción
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrió un error al guardar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAccesoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        EmpleadoDAO.actualizarTabla(TablaRegistro);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jButton2ActionPerformed
   


  private void limpiarCampos() {
    txtApellidoMat.setText("");
    txtApellidoPat.setText("");
    txtContrasena.setText("");
    txtDireccion.setText("");
    txtNombre.setText("");
    txtTelefono.setText("");
    txtlogin.setText("");
    dtFechaNac.setDate(null);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaRegistro;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbAcceso;
    private javax.swing.JComboBox<String> cbEstado;
    private com.toedter.calendar.JDateChooser dtFechaNac;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidoMat;
    private javax.swing.JTextField txtApellidoPat;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtlogin;
    // End of variables declaration//GEN-END:variables
}
