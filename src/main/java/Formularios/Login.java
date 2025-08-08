
package Formularios;

import Codigo.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\LoginHotel.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 212, 552));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\Logo_kingPNG-removebg-preview.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 280, 200));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\Contraseña40-removebg-preview.png")); // NOI18N
        jLabel4.setText("  Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 240, 40));

        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText("Ingrese usuario...");
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 240, 40));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\Usuario-removebg-preview.png")); // NOI18N
        jLabel5.setText("  Usuario:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 250, 40));

        txtContrasena.setForeground(new java.awt.Color(153, 153, 153));
        txtContrasena.setText("jPasswordField1");
        txtContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContrasenaMouseClicked(evt);
            }
        });
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 240, 40));

        btnEntrar.setBackground(new java.awt.Color(255, 0, 153));
        btnEntrar.setFont(new java.awt.Font("Roboto Medium", 2, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Iniciar Sesion");
        btnEntrar.setBorderPainted(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, 30));

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

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
         String usuario = txtUsuario.getText();
    String pass = txtContrasena.getText();

    if (!pass.isEmpty() && !usuario.isEmpty()) {
        Connection connection = Conexion.obtenerConexion();

        if (connection != null) {
            try {
                // Llamada al procedimiento almacenado
                String sql = "{CALL sp_ValidarCredenciales(?, ?)}";
                try (CallableStatement callableStatement = connection.prepareCall(sql)) {
                    callableStatement.setString(1, usuario);
                    callableStatement.setString(2, pass);

                    try (ResultSet resultSet = callableStatement.executeQuery()) {
                        if (resultSet.next()) {
                            // Las credenciales son correctas, puedes permitir el acceso al sistema.
                            this.dispose();
                            String nombreEmpleado = resultSet.getString("Nombre_Emp");
                            JOptionPane.showMessageDialog(null, "¡Bienvenido, " + nombreEmpleado + "!");
                            this.dispose();
                            PaginaPrincipal principal = new PaginaPrincipal();
                            principal.setVisible(true);
                            principal.setLocationRelativeTo(null);
                        } else {
                            // Credenciales incorrectas, muestra un mensaje de error.
                            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
                        }
                    }
                }
            } catch (SQLException e) {
                throw new RuntimeException("Error al ejecutar el procedimiento almacenado: " + e.getMessage());
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        } else {
            System.out.println("No se pudo establecer la conexión a la base de datos.");
        }
    }

    }//GEN-LAST:event_btnEntrarActionPerformed
      

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtContrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContrasenaMouseClicked
        txtContrasena.setText("");
    }//GEN-LAST:event_txtContrasenaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
