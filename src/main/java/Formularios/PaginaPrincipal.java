
package Formularios;

import javax.swing.JOptionPane;


public class PaginaPrincipal extends javax.swing.JFrame {
    private String nombreUsuario;
 
   public PaginaPrincipal() {
       initComponents();
   }
   
    public PaginaPrincipal(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        btnReserva = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnHabitaciones = new javax.swing.JButton();
        btnHabitaciones1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTrabajadores = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbImagen5 = new javax.swing.JLabel();
        lbImagen4 = new javax.swing.JLabel();
        lbImagen3 = new javax.swing.JLabel();
        lbImagen2 = new javax.swing.JLabel();
        lbImagen1 = new javax.swing.JLabel();
        lbImagen0 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(206, 206, 208));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\logoBLanco.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        btnProductos.setBackground(new java.awt.Color(255, 153, 0));
        btnProductos.setText("Productos");
        btnProductos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        btnProductos.setBorderPainted(false);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 100, 30));

        btnReserva.setBackground(new java.awt.Color(204, 102, 255));
        btnReserva.setText("Reserva");
        btnReserva.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        btnReserva.setBorderPainted(false);
        btnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 100, 30));

        btnCerrarSesion.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 100, 30));

        btnHabitaciones.setBackground(new java.awt.Color(102, 255, 102));
        btnHabitaciones.setText("Gestion Hotel");
        btnHabitaciones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 0)));
        btnHabitaciones.setBorderPainted(false);
        btnHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 100, 30));

        btnHabitaciones1.setBackground(new java.awt.Color(153, 255, 255));
        btnHabitaciones1.setText("Reportes");
        btnHabitaciones1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 204)));
        btnHabitaciones1.setBorderPainted(false);
        btnHabitaciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitaciones1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHabitaciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 100, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Version 1.0");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("© Derechos Reservados 2023");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Hotel  King");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, -1));

        btnTrabajadores.setBackground(new java.awt.Color(255, 255, 51));
        btnTrabajadores.setText("Trabajadores");
        btnTrabajadores.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));
        btnTrabajadores.setBorderPainted(false);
        btnTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajadoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 100, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 580));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Roboto Light", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Configuracion");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 550, 100, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\desenfoque1.png")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 720, 450));

        jPanel3.setBackground(new java.awt.Color(206, 206, 208));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbImagen5.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\Imagen10.jpg")); // NOI18N
        lbImagen5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 0)));
        jPanel3.add(lbImagen5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 70));

        lbImagen4.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\Imagen30.jpg")); // NOI18N
        lbImagen4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        jPanel3.add(lbImagen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 110, 70));

        lbImagen3.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\imagen40.jpg")); // NOI18N
        lbImagen3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        jPanel3.add(lbImagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 110, 70));

        lbImagen2.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\Imagen50.jpg")); // NOI18N
        lbImagen2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        jPanel3.add(lbImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 110, 70));

        lbImagen1.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\Imagen20.jpg")); // NOI18N
        lbImagen1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        jPanel3.add(lbImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 110, 70));

        lbImagen0.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\imagen60.jpg")); // NOI18N
        lbImagen0.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        jPanel3.add(lbImagen0, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 100, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\imagen70.jpg")); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 110, 70));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 720, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "¿Desea cerrar sesión?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            this.dispose();
            Login login = new Login();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaActionPerformed
           this.dispose(); 
        EstadoHabitciones habitaciones = new EstadoHabitciones();
        habitaciones.setVisible(true);
        habitaciones.setLocationRelativeTo(null); 
    }//GEN-LAST:event_btnReservaActionPerformed

    private void btnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionesActionPerformed
        this.dispose();
        Mantenimientos mantenimientos = new Mantenimientos(); 
        mantenimientos.setVisible(true);
        mantenimientos.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnHabitacionesActionPerformed

    private void btnHabitaciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitaciones1ActionPerformed
        this.dispose();
        Reportes reporte = new Reportes();
        reporte.setVisible(true);
        reporte.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnHabitaciones1ActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        this.dispose();
        ServiciosProductos producto = new ServiciosProductos();
        producto.setVisible(true);
        producto.setLocationRelativeTo(null);    
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajadoresActionPerformed
        this.dispose();
        Trabajadores trabajador = new Trabajadores();
        trabajador.setVisible(true);
        trabajador.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnTrabajadoresActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose(); 
       Configuracion configuracion = new Configuracion();
       configuracion.setVisible(true);
       configuracion.setLocationRelativeTo(null);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnHabitaciones1;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnReserva;
    private javax.swing.JButton btnTrabajadores;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbImagen0;
    private javax.swing.JLabel lbImagen1;
    private javax.swing.JLabel lbImagen2;
    private javax.swing.JLabel lbImagen3;
    private javax.swing.JLabel lbImagen4;
    private javax.swing.JLabel lbImagen5;
    // End of variables declaration//GEN-END:variables
}
