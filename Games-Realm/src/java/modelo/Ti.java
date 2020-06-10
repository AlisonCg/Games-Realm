/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author uzias
 */
public class Ti {
    private int id_ticket, id_venta;
    private double Total, Subtotal, Impuesto, Envio;
    private String Nombre_servicio, Fecha;

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getImpuesto() {
        return Impuesto;
    }

    public void setImpuesto(double Impuesto) {
        this.Impuesto = Impuesto;
    }

    public double getEnvio() {
        return Envio;
    }

    public void setEnvio(double Envio) {
        this.Envio = Envio;
    }

    public String getNombre_servicio() {
        return Nombre_servicio;
    }

    public void setNombre_servicio(String Nombre_servicio) {
        this.Nombre_servicio = Nombre_servicio;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
}
