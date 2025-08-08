
package Formularios;

import Codigo.Conexion;
import Habitacion.HabitacionManager;
import Producto.ProductoDAO;
import Producto.ProductosManager;
import Producto.ReservaProductoDAO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author juant
 */
public class ServiciosProductos extends javax.swing.JFrame {


    public ServiciosProductos() {
        initComponents();
         HabitacionManager.actualizarTabla(tablaHabitacion, "Reservado");
        DefaultTableModel modelo = (DefaultTableModel) TablaCodigos.getModel();
        ProductosManager manager = new ProductosManager(modelo);
        manager.cargarProductos();
        
         // Deshabilita todos los campos y botones al inicio del formulario
        habilitarCampos(false);

       ListSelectionModel selectionModel = tablaHabitacion.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                // Cuando se selecciona una fila, actualiza txtHabitacion y habilita los campos
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = tablaHabitacion.getSelectedRow();

                    if (selectedRow != -1) {
                        Object valorCelda = tablaHabitacion.getValueAt(selectedRow, 1);

                        if (valorCelda != null) {
                            txtHabitacion.setText(valorCelda.toString());
                            habilitarCampos(true); // Método para habilitar campos
                        }
                    }
                }
            }
        });


        
          txtCantidad.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarTotal();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarTotal();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                actualizarTotal();
            }
        });

        txtPrecio.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarTotal();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarTotal();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                actualizarTotal();
            }
        });

      
    }
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtHabitacion = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtCategoria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCodigos = new javax.swing.JTable();
        btnCodigos = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaHabitacion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de Productos para Ventas");

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));

        jLabel2.setText("Codigo:");

        jLabel3.setText("Nombre:");

        jLabel5.setText("Cantidad");

        jLabel6.setText("Precio");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        txtCodigo.setEditable(false);
        txtCodigo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtCodigoCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtNombre.setEditable(false);

        txtPrecio.setEditable(false);

        jLabel7.setText("N° Habitacion");

        jLabel8.setText("Stock");

        jLabel10.setText("Categoria:");

        txtHabitacion.setEditable(false);
        txtHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabitacionActionPerformed(evt);
            }
        });

        txtStock.setEditable(false);

        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.setBorderPainted(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        txtCategoria.setEditable(false);

        jLabel4.setText("Total:");

        txtTotal.setEditable(false);
        txtTotal.setAutoscrolls(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(txtCodigo)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCantidad))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHabitacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(txtHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 46, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Tabla de Codigo de Productos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Medium", 0, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaCodigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N° Productos", "Nombre", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
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
        TablaCodigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCodigosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaCodigos);
        if (TablaCodigos.getColumnModel().getColumnCount() > 0) {
            TablaCodigos.getColumnModel().getColumn(0).setResizable(false);
            TablaCodigos.getColumnModel().getColumn(1).setResizable(false);
            TablaCodigos.getColumnModel().getColumn(2).setResizable(false);
            TablaCodigos.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 580, 220));

        btnCodigos.setText("Ver Codigos");
        btnCodigos.setBorderPainted(false);
        btnCodigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodigosActionPerformed(evt);
            }
        });
        jPanel5.add(btnCodigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 610, 300));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

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
        jScrollPane3.setViewportView(tablaHabitacion);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 364, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
     private void habilitarCampos(boolean habilitar) {
        txtCantidad.setEnabled(habilitar);
        txtCategoria.setEnabled(habilitar);
        txtCodigo.setEnabled(habilitar);
        txtHabitacion.setEnabled(habilitar);
        txtNombre.setEnabled(habilitar);
        txtPrecio.setEnabled(habilitar);
        txtStock.setEnabled(habilitar);
        txtTotal.setEnabled(habilitar);
        btnGuardar.setEnabled(habilitar);
        btnNuevo.setEnabled(habilitar);
        
        btnCodigos.setEnabled(habilitar);
        TablaCodigos.setEnabled(habilitar);
    }
    
       private void actualizarTxtHabitacion() {
    // Obtén la fila seleccionada en el JTable
    int selectedRow = tablaHabitacion.getSelectedRow();

    // Verifica si hay una fila seleccionada
    if (selectedRow != -1) {
        // Obtén el valor de la segunda columna (índice 1) de la fila seleccionada
        Object valorCelda = tablaHabitacion.getValueAt(selectedRow, 1);

        // Verifica si el valor es no nulo
        if (valorCelda != null) {
            // Establece el valor en el JTextField
            txtHabitacion.setText(valorCelda.toString());
          }
       }
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        PaginaPrincipal principal = new PaginaPrincipal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalirActionPerformed

    
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            if (txtNombre.getText().isEmpty() || txtCantidad.getText().isEmpty()
            || txtPrecio.getText().isEmpty() || txtHabitacion.getText().isEmpty()
            || txtStock.getText().isEmpty() || txtCategoria.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        return;
    }

    try {
        double cantidad = Double.parseDouble(txtCantidad.getText());
        double precio = Double.parseDouble(txtPrecio.getText());
        double stock = Double.parseDouble(txtStock.getText());

  

        // Guardar en Producto
        ProductoDAO.guardarProducto(txtNombre.getText(), precio, txtHabitacion.getText(), stock);

        JOptionPane.showMessageDialog(null, "Se guardaron correctamente");
        LimpiarDatos();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos en cantidad, precio y stock.");
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
       
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
         try {
        double precioUnitario = Double.parseDouble(txtPrecio.getText());
        int cantidad = Integer.parseInt(txtCantidad.getText());
        double precioTotal = precioUnitario * cantidad;
        // Actualizar el campo "Precio Total" o cualquier otro campo donde desees mostrarlo
        txtPrecio.setText(String.valueOf(precioTotal));
    } catch (NumberFormatException e) {
        // Manejo de errores si la entrada no es válida
    }
    }//GEN-LAST:event_txtCantidadActionPerformed
    
   
    
    private void txtCodigoCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtCodigoCaretPositionChanged
   
    }//GEN-LAST:event_txtCodigoCaretPositionChanged

    private void txtHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabitacionActionPerformed
         actualizarTxtHabitacion();
    }//GEN-LAST:event_txtHabitacionActionPerformed

    private void btnCodigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodigosActionPerformed
   DefaultTableModel modelo = (DefaultTableModel) TablaCodigos.getModel();
    ProductosManager manager = new ProductosManager(modelo);
    manager.cargarProductos();

    }//GEN-LAST:event_btnCodigosActionPerformed

    private void TablaCodigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCodigosMouseClicked
   // Verifica si se ha hecho clic en una fila de la tabla
        if (evt.getClickCount() == 1) {
            int filaSeleccionada = TablaCodigos.getSelectedRow();

            // Obtiene el valor de la primera columna de la fila seleccionada
            String valorNProducto = TablaCodigos.getValueAt(filaSeleccionada, 0).toString();
            String valorNombre = TablaCodigos.getValueAt(filaSeleccionada, 1).toString();
            String valorPrecio = TablaCodigos.getValueAt(filaSeleccionada, 2).toString();
            String valorStock = TablaCodigos.getValueAt(filaSeleccionada, 3).toString();

            // Establece los valores en los campos de texto
            txtNombre.setText(valorNombre);
            txtPrecio.setText(valorPrecio);
            txtStock.setText(valorStock);

            // Invoca el método mostrarValorColumna1
            mostrarValorColumna1(valorNProducto, valorNProducto);

            // Extrae el número del código del producto
            String numeroProducto = valorNProducto.replaceAll("\\D", "");

            // Convierte el número del producto a un entero
            int valorClaveForanea = Integer.parseInt(numeroProducto);

            // Obtiene el nombre de la categoría correspondiente y lo establece en el campo de texto
            String valorNombreCat = obtenerCategoriaDesdeBaseDeDatos(valorClaveForanea);
            txtCategoria.setText(valorNombreCat);
        }
    }//GEN-LAST:event_TablaCodigosMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        LimpiarDatos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
     
        
    }//GEN-LAST:event_txtTotalActionPerformed

    private void tablaHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHabitacionMouseClicked
     
    }//GEN-LAST:event_tablaHabitacionMouseClicked
    
    

         private void actualizarTotal() {
        try {
            // Verifica que ambos campos tengan datos
            if (!txtCantidad.getText().isEmpty() && !txtPrecio.getText().isEmpty()) {
                // Obtén los valores de txtCantidad y txtPrecio
                double cantidad = Double.parseDouble(txtCantidad.getText());
                double precio = Double.parseDouble(txtPrecio.getText());

                // Calcula el total
                double total = cantidad * precio;

                // Formatea el total para mostrar un máximo de 3 decimales
                String formatoTotal = String.format("S/. %.2f ", total);

                // Actualiza el valor de txtTotal
                txtTotal.setText(formatoTotal);
            } else {
                // Si alguno de los campos está vacío, deja txtTotal vacío
                txtTotal.setText("");
            }
        } catch (NumberFormatException ex) {
            // Maneja la excepción si los valores no son números válidos
            txtTotal.setText("Error");
        }
    }
    
    
    
    
    public void mostrarValorColumna1(String valorColumna1, String valorCodigo) {
     txtCodigo.setText(valorCodigo);
}
    public void mostrarHabitacion(String NumHabitacion){
        txtHabitacion.setText(NumHabitacion);
    }
    public void LimpiarDatos(){
        txtCantidad.setText(""); 
        txtCategoria.setText("");
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
    }
    
  public String obtenerCategoriaDesdeBaseDeDatos(int valorClaveForanea) {
    String valorNombreCat = "";
    String query = "{CALL ObtenerCategoriaPorIdProducto(?)}";
    
    try (Connection conn = Conexion.obtenerConexion();
         CallableStatement cstmt = conn.prepareCall(query)) {
        
        cstmt.setInt(1, valorClaveForanea);
        ResultSet rs = cstmt.executeQuery();
        
        if (rs.next()) {
            valorNombreCat = rs.getString("Nombre_Cat");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return valorNombreCat;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCodigos;
    private javax.swing.JButton btnCodigos;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaHabitacion;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtHabitacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
