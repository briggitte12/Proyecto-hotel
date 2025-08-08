
package Clientes;

import java.util.Date;
/**
 *
 * @author juant
 */
public class Cliente {
    private int idCliente;
    private String nombres;
    private String apellidoPat;
    private String apellidoMat;
    private String tipoDocumento;
    private String numeroDoc;
    private String tipoHabitacion; // Si es necesario
    private Date fechaIngreso;
    private Date fechaSalida;
    private int idProducto; // Si es necesario

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }
    
    

    public Cliente(String nombres, String apellidoPat, String apellidoMat, String tipoDocumento, String numeroDoc, String tipoHabitacion, Date fechaIngreso, Date fechaSalida, int idProducto) {
        this.nombres = nombres;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.tipoDocumento = tipoDocumento;
        this.numeroDoc = numeroDoc;
        this.tipoHabitacion = tipoHabitacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.idProducto = idProducto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(String numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
}
