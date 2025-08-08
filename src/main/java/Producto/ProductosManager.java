/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto;

import Codigo.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ProductosManager {
    private DefaultTableModel modelo;

    public ProductosManager(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    public void cargarProductos() {
     // Limpiar la tabla antes de cargar datos
     modelo.setRowCount(0);

     // Utilizando try-with-resources para garantizar el cierre adecuado de la conexión
     try (Connection connection = Conexion.obtenerConexion();
          CallableStatement cs = connection.prepareCall("{CALL sp_cargarProductos}");
          ResultSet rs = cs.executeQuery()) {

         while (rs.next()) {
             String nItem = rs.getString("N_Item");
             String nombre = rs.getString("Nombre_Prod");
             double precioProd = rs.getDouble("Precio_Prod");
             int stock = rs.getInt("Stock");
             modelo.addRow(new Object[]{nItem, nombre, precioProd, stock});
         }

     } catch (SQLException e) {
         e.printStackTrace();
     }
 }

}

