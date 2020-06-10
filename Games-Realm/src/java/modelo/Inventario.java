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
public class Inventario {
    private int id_inv, Cantidad_inv, id_video;

    public int getId_inv() {
        return id_inv;
    }

    public void setId_inv(int id_inv) {
        this.id_inv = id_inv;
    }

    public int getCantidad_inv() {
        return Cantidad_inv;
    }

    public void setCantidad_inv(int Cantidad_inv) {
        this.Cantidad_inv = Cantidad_inv;
    }

    public int getId_video() {
        return id_video;
    }

    public void setId_video(int id_video) {
        this.id_video = id_video;
    }
    
}
