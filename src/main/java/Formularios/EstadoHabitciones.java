
package Formularios;

import Clientes.Cliente;
import Clientes.ManejoDatos;
import Codigo.Conexion;
import Habitacion.HabitacionManager;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.beans.Customizer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class EstadoHabitciones extends javax.swing.JFrame {
       
        
    public EstadoHabitciones() {
        initComponents();
        setLocationRelativeTo(null);
         HabitacionManager.actualizarTabla(tablaHabitacion, "PorDefecto");
         int selectedRow = tablaHabitacion.getSelectedRow();
        if (selectedRow == -1) {
            habilitarCampos(false);
        }
         DefaultListSelectionModel selectionModel = new DefaultListSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tablaHabitacion.setSelectionModel(selectionModel);        

        if (selectedRow == -1) {
            // No se ha seleccionado ninguna fila, deshabilitar el botón guardar y los campos
            habilitarCampos(false);
            habilitarBotonGuardar(false);
        } else {
            // Hay una fila seleccionada, habilitar los campos solo si el estado es "Disponible"
            String estadoSeleccionado = (String) tablaHabitacion.getValueAt(selectedRow, 2);
            if ("Disponible".equals(estadoSeleccionado)) {
                habilitarCampos(true);
                habilitarBotonGuardar(true);
            } else {
                habilitarCampos(false);
                habilitarBotonGuardar(false);
            }
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtNumeroDoc = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        cbDocumento = new javax.swing.JComboBox<>();
        DtFechaEntrada = new com.toedter.calendar.JDateChooser();
        DtFechaSalida = new com.toedter.calendar.JDateChooser();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHabitacion = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnDisponible = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnReservado = new javax.swing.JButton();
        BtnMantenimiento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\juant\\Documents\\NetBeansProjects\\ProyectoPOO\\src\\resources\\habitacion.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 580));

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESERVA DE CLIENTES");

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cerrar");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 940, 40));

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Registro de Huespedes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setText("Nombres: ");

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setText("Apellido Paterno:");

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setText("Tipo de Documento:");

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setText("Apellido Materno:");

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setText("N° Documento:");

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setText("Fecha Ingreso:");

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setText("Fecha Salida:");

        txtApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaternoActionPerformed(evt);
            }
        });
        txtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyTyped(evt);
            }
        });

        txtNumeroDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroDocActionPerformed(evt);
            }
        });
        txtNumeroDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroDocKeyTyped(evt);
            }
        });

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtApellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPaternoActionPerformed(evt);
            }
        });
        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyTyped(evt);
            }
        });

        cbDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "RUC" }));
        cbDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDocumentoActionPerformed(evt);
            }
        });

        DtFechaEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DtFechaEntradaKeyTyped(evt);
            }
        });

        DtFechaSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DtFechaSalidaKeyTyped(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Nuevo");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DtFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNumeroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(DtFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 390, 520));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Habitaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 3, 14))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        tablaHabitacion.setBackground(new java.awt.Color(255, 255, 204));
        tablaHabitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdHabitacion", "Numero Habitacion", "Estado ", "Tipo Habitacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaHabitacion.getTableHeader().setReorderingAllowed(false);
        tablaHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaHabitacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaHabitacion);

        btnActualizar.setText("Ver todo");
        btnActualizar.setBorderPainted(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnDisponible.setBackground(new java.awt.Color(153, 255, 153));
        btnDisponible.setText("Disponible");
        btnDisponible.setBorderPainted(false);
        btnDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisponibleActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setText("Ordenar");

        BtnReservado.setBackground(new java.awt.Color(255, 51, 51));
        BtnReservado.setText("Reservado");
        BtnReservado.setBorderPainted(false);
        BtnReservado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReservadoActionPerformed(evt);
            }
        });

        BtnMantenimiento.setBackground(new java.awt.Color(153, 153, 255));
        BtnMantenimiento.setText("Mantenimiento");
        BtnMantenimiento.setBorderPainted(false);
        BtnMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMantenimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDisponible)
                .addGap(32, 32, 32)
                .addComponent(BtnReservado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnMantenimiento)
                .addGap(55, 55, 55))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnActualizar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisponible)
                    .addComponent(jLabel3)
                    .addComponent(BtnReservado)
                    .addComponent(BtnMantenimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 490, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose(); 
        PaginaPrincipal principal = new PaginaPrincipal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
         HabitacionManager.actualizarTabla(tablaHabitacion, "PorDefecto");

    }//GEN-LAST:event_btnActualizarActionPerformed
        private void habilitarBotonGuardar(boolean habilitar) {
            btnGuardar.setEnabled(habilitar);
        }
        private void habilitarCampos(boolean habilitar) {
        txtNombres.setEnabled(habilitar);
        txtApellidoPaterno.setEnabled(habilitar);
        txtApellidoMaterno.setEnabled(habilitar);
        cbDocumento.setEnabled(habilitar);
        DtFechaEntrada.setEnabled(habilitar);
        DtFechaSalida.setEnabled(habilitar);
        txtNumeroDoc.setEnabled(habilitar);
     }

    private void tablaHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHabitacionMouseClicked
         int selectedRow = tablaHabitacion.getSelectedRow();

        if (selectedRow == -1) {
            // No se ha seleccionado ninguna fila, deshabilitar los campos y el botón guardar
            habilitarCampos(false);
            habilitarBotonGuardar(false);
        } else {
            // Hay una fila seleccionada, habilitar los campos solo si el estado es "Disponible"
            String estadoSeleccionado = (String) tablaHabitacion.getValueAt(selectedRow, 2);
            if ("Disponible".equals(estadoSeleccionado)) {
                habilitarCampos(true);
                habilitarBotonGuardar(true);
            } else {
                habilitarCampos(false);
                habilitarBotonGuardar(false);
            }
        }
    }//GEN-LAST:event_tablaHabitacionMouseClicked
    public int obtenerIdReserva() {
    try {
        Connection conn = Conexion.obtenerConexion();

        // Consulta para obtener el último ID de reserva
        String sql = "SELECT TOP 1 IdReserva FROM Reserva ORDER BY IdReserva DESC";

        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            if (rs.next()) {
                int idReserva = rs.getInt("IdReserva");
                return idReserva + 1; // Devuelve el siguiente ID de reserva
            }

            return 1; // Si no hay reservas, devuelve 1 como primer ID
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return -1; // En caso de error
    }
}


    private void btnDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisponibleActionPerformed
    HabitacionManager.actualizarTabla(tablaHabitacion, "Disponible");
    habilitarCampos(false);
    habilitarBotonGuardar(false);
    }//GEN-LAST:event_btnDisponibleActionPerformed

    private void BtnMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMantenimientoActionPerformed
    HabitacionManager.actualizarTabla(tablaHabitacion, "Mantenimiento");
    habilitarCampos(false);
    habilitarBotonGuardar(false);
    }//GEN-LAST:event_BtnMantenimientoActionPerformed

    private void BtnReservadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReservadoActionPerformed
    HabitacionManager.actualizarTabla(tablaHabitacion, "Reservado");
    habilitarCampos(false);
    habilitarBotonGuardar(false);
    }//GEN-LAST:event_BtnReservadoActionPerformed

    private void txtApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaternoActionPerformed

    }//GEN-LAST:event_txtApellidoMaternoActionPerformed

    private void txtApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyTyped
        char c = evt.getKeyChar();

        // Verificar si el carácter ingresado no es una letra
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            // Consumir el evento, lo que evita que el carácter se muestre en el JTextField
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoMaternoKeyTyped

    private void txtNumeroDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroDocActionPerformed

    }//GEN-LAST:event_txtNumeroDocActionPerformed

    private void txtNumeroDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDocKeyTyped
        char c = evt.getKeyChar();

        // Verificar si el carácter ingresado no es un dígito o si es el punto decimal
        if (!Character.isDigit(c)) {
            // Consumir el evento, lo que evita que el carácter se muestre en el JTextField
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroDocKeyTyped

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed

    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char c = evt.getKeyChar();

        // Verificar si el carácter ingresado no es una letra
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            // Consumir el evento, lo que evita que el carácter se muestre en el JTextField
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPaternoActionPerformed

    }//GEN-LAST:event_txtApellidoPaternoActionPerformed

    private void txtApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyTyped
        char c = evt.getKeyChar();

        // Verificar si el carácter ingresado no es una letra
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            // Consumir el evento, lo que evita que el carácter se muestre en el JTextField
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoPaternoKeyTyped

    private void cbDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDocumentoActionPerformed

    }//GEN-LAST:event_cbDocumentoActionPerformed

    private void DtFechaEntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DtFechaEntradaKeyTyped

    }//GEN-LAST:event_DtFechaEntradaKeyTyped

    private void DtFechaSalidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DtFechaSalidaKeyTyped

    }//GEN-LAST:event_DtFechaSalidaKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      try {
        // Verificar si los campos están habilitados
        if (!camposHabilitados()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una habitación disponible antes de guardar.", "Campos deshabilitados", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtener los datos del formulario
        String nombre = txtNombres.getText();
        String apellidoPat = txtApellidoPaterno.getText();
        String apellidoMat = txtApellidoMaterno.getText();
        String tipoDoc = cbDocumento.getSelectedItem().toString();
        String numeroDoc = txtNumeroDoc.getText();
        Date fechaIngreso = DtFechaEntrada.getDate();
        Date fechaSalida = DtFechaSalida.getDate();

        // Verificar si algún campo está vacío
        if (nombre.isEmpty() || apellidoPat.isEmpty() || apellidoMat.isEmpty() || tipoDoc.isEmpty() || numeroDoc.isEmpty() || fechaIngreso == null || fechaSalida == null) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos antes de guardar.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Crear un objeto Cliente con los datos del formulario
        Cliente cliente = new Cliente(nombre, apellidoPat, apellidoMat, tipoDoc, numeroDoc, null, fechaIngreso, fechaSalida, 0);
        btnGuardar.setEnabled(false);

        // Guardar los datos en la base de datos
        ManejoDatos manejoDatos = new ManejoDatos(tablaHabitacion);

        manejoDatos.guardarDatosClienteReserva(cliente);

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al procesar los datos", "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        // Activar el botón nuevamente
        btnGuardar.setEnabled(true);
    }
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    
        private boolean camposHabilitados() {
        return btnGuardar.isEnabled();
    }
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
          // Limpiar los campos de texto
        txtApellidoMaterno.setText("");
        txtApellidoPaterno.setText("");
        txtNombres.setText("");
        txtNumeroDoc.setText("");

        // Establecer la fecha actual en los JDateChooser
        DtFechaEntrada.setDate(new Date(System.currentTimeMillis()));  
        DtFechaSalida.setDate(null);   
    }//GEN-LAST:event_btnLimpiarActionPerformed


  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMantenimiento;
    private javax.swing.JButton BtnReservado;
    private com.toedter.calendar.JDateChooser DtFechaEntrada;
    private com.toedter.calendar.JDateChooser DtFechaSalida;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnDisponible;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbDocumento;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaHabitacion;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroDoc;
    // End of variables declaration//GEN-END:variables
}
