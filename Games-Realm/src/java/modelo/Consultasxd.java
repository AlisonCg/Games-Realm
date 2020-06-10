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

import java.sql.*;
import java.util.*;
public class Consultasxd {
    
    public static List<Videogame> obtenerTodo(){
        List<Videogame> todos = new ArrayList<Videogame>();
        try {
            Conexion o = new Conexion();
            Connection con = o.getConnection();
            String q = "SELECT * FROM Videojuego";
            PreparedStatement pr = con.prepareStatement(q);
            ResultSet rs = pr.executeQuery();
            
            while (rs.next()){
                Videogame v = new Videogame();
                v.setId_video(rs.getInt(1));
                v.setNombre(rs.getString(2));
                v.setPrecio(rs.getDouble(3));
                v.setDescripcion(rs.getString(4));
                v.setEdicion(rs.getString(5));
                v.setImagen(rs.getString(6));
                v.setAnio(rs.getInt(7));
                v.setId_genero(rs.getInt(8));
                v.setId_cc(rs.getInt(9));
                v.setId_cp(rs.getInt(10));
                todos.add(v);
            }
            con.close();
        } catch(Exception e){
            System.out.println("No se conecto a la tabla");
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        } 
            return todos;
        
    }
    
    public static List<Videogame> getByClass(int id){
        List<Videogame> V = new ArrayList<Videogame>();
        Conexion c = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pr = null;
        String q = "";
        try {
            con = c.getConnection();
            q = "SELECT * FROM Videojuego WHERE id_cc = ?";
            pr = con.prepareStatement(q);
            pr.setInt(1, id);
            rs = pr.executeQuery();
            
            while (rs.next()){
                Videogame v = new Videogame();
                v.setId_video(rs.getInt("id_video"));
                v.setNombre(rs.getString("Nombre"));
                v.setPrecio(rs.getDouble("Precio"));
                v.setDescripcion(rs.getString("Descripcion"));
                v.setEdicion(rs.getString("Edicion"));
                v.setImagen(rs.getString("Imagen"));
                v.setAnio(rs.getInt("Anio"));
                v.setId_genero(rs.getInt("id_genero"));
                v.setId_cc(rs.getInt("id_cc"));
                v.setId_cp(rs.getInt("id_cp"));
                V.add(v);
            }
            System.out.print(V);
        } catch(Exception e){
            System.out.println("Errorrrrrrrrrrrrr xd");
            e.printStackTrace();
        } finally{
            try{
                con.close();
                pr.close();
                rs.close();
            }catch(Exception sqle){
                sqle.printStackTrace();
            }
            return V;
        }
    }
    
    public static List<Videogame> getByPlat(int id){
        List<Videogame> V = new ArrayList<Videogame>();
        Conexion c = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pr = null;
        String q = "";
        try {
            con = c.getConnection();
            q = "SELECT * FROM Videojuego WHERE id_cp = ?";
            pr = con.prepareStatement(q);
            pr.setInt(1, id);
            rs = pr.executeQuery();
                Videogame v = new Videogame();
            
            while (rs.next()){
                v.setId_video(rs.getInt("id_video"));
                v.setNombre(rs.getString("Nombre"));
                v.setPrecio(rs.getDouble("Precio"));
                v.setDescripcion(rs.getString("Descripcion"));
                v.setEdicion(rs.getString("Edicion"));
                v.setImagen(rs.getString("Imagen"));
                v.setAnio(rs.getInt("Anio"));
                v.setId_genero(rs.getInt("id_genero"));
                v.setId_cc(rs.getInt("id_cc"));
                v.setId_cp(rs.getInt("id_cp"));
                V.add(v);
            }
            System.out.print(V);
        } catch(Exception e){
            System.out.println("Errorrrrrrrrrrrrr xd");
            e.printStackTrace();
        } finally{
            try{
                con.close();
                pr.close();
                rs.close();
            }catch(Exception sqle){
                sqle.printStackTrace();
            }
            return V;
        }
    }
    
    public static List<Videogame> getByGenero(int id){
        List<Videogame> V = new ArrayList<Videogame>();
        Conexion c = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pr = null;
        String q = "";
        try {
            con = c.getConnection();
            q = "SELECT * FROM Videojuego WHERE id_genero = ?";
            pr = con.prepareStatement(q);
            pr.setInt(1, id);
            rs = pr.executeQuery();
            
            while (rs.next()){
                Videogame v = new Videogame();
                v.setId_video(rs.getInt("id_video"));
                v.setNombre(rs.getString("Nombre"));
                v.setPrecio(rs.getDouble("Precio"));
                v.setDescripcion(rs.getString("Descripcion"));
                v.setEdicion(rs.getString("Edicion"));
                v.setImagen(rs.getString("Imagen"));
                v.setAnio(rs.getInt("Anio"));
                v.setId_genero(rs.getInt("id_genero"));
                v.setId_cc(rs.getInt("id_cc"));
                v.setId_cp(rs.getInt("id_cp"));
                V.add(v);
            }
            System.out.print(V);
        } catch(Exception e){
            System.out.println("Errorrrrrrrrrrrrr xd");
            e.printStackTrace();
        } finally{
            try{
                con.close();
                pr.close();
                rs.close();
            }catch(Exception sqle){
                sqle.printStackTrace();
            }
            return V;
        }
    }
    public static List<Ventas> VerificaVenta(){
        List<Ventas> V = new ArrayList<Ventas>();
        Conexion c = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pr = null;
        String q = "";
        try {
            con = c.getConnection();
            q = "SELECT * FROM Venta";
            pr = con.prepareStatement(q);
            rs = pr.executeQuery();
            
            while (rs.next()){
                Ventas v = new Ventas();
                v.setId_video(rs.getInt("id_video"));
                v.setId_venta(rs.getInt("id_venta"));
                V.add(v);
            }
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            try{
                con.close();
                pr.close();
                rs.close();
            }catch(Exception sqle){
                sqle.printStackTrace();
            }
            return V;
        }
    }
    //aqui me hago un metodo para obtener las ventas por id de venta
    public static List<Ventas> VentabyVentaid(int id_v){
        List<Ventas> V = new ArrayList<Ventas>();
        Conexion c = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pr = null;
        String q = "";
        try {
            con = c.getConnection();
            q = "SELECT * FROM Venta where id_venta = ?";
            pr = con.prepareStatement(q);
            pr.setInt(1, id_v);
            rs = pr.executeQuery();
            
            while (rs.next()){
                Ventas v = new Ventas();
                v.setId_video(rs.getInt("id_video"));
                v.setId_venta(rs.getInt("id_venta"));
                V.add(v);
            }
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            try{
                con.close();
                pr.close();
                rs.close();
            }catch(Exception sqle){
                sqle.printStackTrace();
            }
            return V;
        }
    }
    //aqui se la agrego al usuario
    public static void RegVenta_usuario(int id_venta, int id_usuario){
        Conexion c = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pr = null;
        String q = "";
        try {
            con = c.getConnection();
            q = "UPDATE  Cliente set id_venta = ? where id_cliente = ?";
            pr = con.prepareStatement(q);
            pr.setInt(1, id_venta);
            pr.setInt(2, id_usuario);
            rs = pr.executeQuery();
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            try{
                con.close();
                pr.close();
                rs.close();
            }catch(Exception sqle){
                sqle.printStackTrace();
            }
        }
    }
    
    // aqui es donde me habia equivocado, le estoy registrando el 
    public static void Reg_Venta(int id, int id_video){
        Conexion c = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pr = null;
        String q = "";
        try {
            con = c.getConnection();
            q = "INSERT INTO Venta values (?, ?)";
            pr = con.prepareStatement(q);
            pr.setInt(1, id);
            pr.setInt(2, id_video);
            rs = pr.executeQuery();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static int obtenerUserCorreo(String correo, String pass){
        
        int idrecio = 0;
        Conexion c = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pr = null;
        String q = "";
        try {
            con = c.getConnection();
            q = "SELECT * FROM Cliente WHERE Email=? and Pass=?";
            pr = con.prepareStatement(q);
            pr.setString(1, correo);
            pr.setString(2, pass);
            rs = pr.executeQuery();
            
            while (rs.next()){
                idrecio = rs.getInt("id_cliente");
            }
            
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }
         return idrecio;
    }
    
    //aqui se obtiene el id de venta
    public static int obtenerVenta(int id_user){
        
        int idrecio = 0;
        Conexion c = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pr = null;
        String q = "";
        try {
            con = c.getConnection();
            q = "SELECT * FROM Cliente WHERE id_cliente = ?";
            pr = con.prepareStatement(q);
            pr.setInt(1, id_user);
            rs = pr.executeQuery();
            
            while (rs.next()){
                idrecio = rs.getInt("id_venta");
            }
            
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }
         return idrecio;
    }
    
    public static List<Ventas> getMaximo(){
        List<Ventas> V = new ArrayList<Ventas>();
        Conexion c = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pr = null;
        String q = "";
        try {
            con = c.getConnection();
            q = "SELECT * FROM Venta WHERE id_venta IN (SELECT MAX(id_venta) FROM Venta)";
            pr = con.prepareStatement(q);
            rs = pr.executeQuery();
            
            while (rs.next()){
                Ventas v = new Ventas();
                v.setId_video(rs.getInt("id_video"));
                v.setId_venta(rs.getInt("id_venta"));
                V.add(v);
            }
        } catch(Exception e){
            System.out.println("Errorrrrrrrrrrrrr xd");
            e.printStackTrace();
        } finally{
            try{
                con.close();
                pr.close();
                rs.close();
            }catch(Exception sqle){
                sqle.printStackTrace();
            }
            return V;
        }
    }
    
    public static List<Ti> registrarTicket(int id, String nombre, String fecha, double total, double subtotal, double impuesto, double envio, int id_venta){
        List<Ti> V = new ArrayList<Ti>();
        Conexion c = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pr = null;
        String q = "";
         try {
            con = c.getConnection();
            q = "INSERT INTO Ticket values (?, ?, ?, ?, ?, ?, ?, ?)";
            pr = con.prepareStatement(q);
            pr.setInt(1, id);
            pr.setString(2, nombre);
            pr.setString(3, fecha);
            pr.setDouble(4, total);
            pr.setDouble(5, subtotal);
            pr.setDouble(6, impuesto);
            pr.setDouble(7, envio);
            pr.setInt(8, id_venta);
            rs = pr.executeQuery();
            
        } catch(Exception e){
            System.out.println("Errorrrrrrrrrrrrr xd");
            e.printStackTrace();
        } finally{
            try{
                con.close();
                pr.close();
                rs.close();
            }catch(Exception sqle){
                sqle.printStackTrace();
            }
            return V;
        }
    }
    
    public static List<Ti> getMaximoTicket(){
        List<Ti> V = new ArrayList<Ti>();
        Conexion c = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pr = null;
        String q = "";
        try {
            con = c.getConnection();
            q = "SELECT * FROM Ticket WHERE id_ticket IN (SELECT MAX(id_ticket) FROM Ticket)";
            pr = con.prepareStatement(q);
            rs = pr.executeQuery();
            
            while (rs.next()){
                Ti v = new Ti();
                v.setId_ticket(rs.getInt("id_ticket"));
                v.setNombre_servicio(rs.getString("Nombre_servicio"));
                v.setFecha(rs.getString("Fecha"));
                v.setTotal(rs.getDouble("Total"));
                v.setSubtotal(rs.getDouble("Subtotal"));
                v.setImpuesto(rs.getDouble("Impuesto"));
                v.setImpuesto(rs.getDouble("Impuestp"));
                v.setId_venta(rs.getInt("id_venta"));
                V.add(v);
            }
        } catch(Exception e){
            System.out.println("Errorrrrrrrrrrrrr xd");
            e.printStackTrace();
        } finally{
            try{
                con.close();
                pr.close();
                rs.close();
            }catch(Exception sqle){
                sqle.printStackTrace();
            }
            return V;
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////este es por id
    public static List<Videogame> getById(int id){
        List<Videogame> V = new ArrayList<Videogame>();
        Conexion c = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pr = null;
        String q = "";
        try {
            con = c.getConnection();
            q = "SELECT * FROM Videojuego WHERE id_video = ?";
            pr = con.prepareStatement(q);
            pr.setInt(1, id);
            rs = pr.executeQuery();
            
            while (rs.next()){
                Videogame v = new Videogame();
                v.setId_video(rs.getInt("id_video"));
                v.setNombre(rs.getString("Nombre"));
                v.setPrecio(rs.getDouble("Precio"));
                v.setDescripcion(rs.getString("Descripcion"));
                v.setEdicion(rs.getString("Edicion"));
                v.setImagen(rs.getString("Imagen"));
                v.setAnio(rs.getInt("Anio"));
                v.setId_genero(rs.getInt("id_genero"));
                v.setId_cc(rs.getInt("id_cc"));
                v.setId_cp(rs.getInt("id_cp"));
                V.add(v);
            }
            System.out.print(V);
        } catch(Exception e){
            System.out.println("Errorrrrrrrrrrrrr xd");
            e.printStackTrace();
        } finally{
            try{
                con.close();
                pr.close();
                rs.close();
            }catch(Exception sqle){
                sqle.printStackTrace();
            }
            return V;
        }
    }
    
    public static List<Inventario> dimecantById(int id_game){
        List<Inventario> lista = new ArrayList<Inventario>();
        Conexion c = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pr = null;
        String q = "";
        try {
            con = c.getConnection();
            q = "SELECT * FROM Inventario WHERE id_inv = ?";
            pr = con.prepareStatement(q);
            pr.setInt(1, id_game);
            rs = pr.executeQuery();
            
            while (rs.next()){
                Inventario v = new Inventario();
                v.setId_inv(rs.getInt("id_inv"));
                v.setCantidad_inv(rs.getInt("Cantidad_inv"));
                v.setId_video(rs.getInt("id_video"));
                lista.add(v);
            }
        } catch (Exception e) {
             e.printStackTrace();
        } finally{
            try{
                con.close();
                pr.close();
                rs.close();
            }catch(Exception sqle){
                sqle.printStackTrace();
            }
            return lista;
        }
    }
    
    public static void disminuye(int id_game, int cantidad){
        Conexion c = new Conexion();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pr = null;
        String q = "";
        try {
            con = c.getConnection();
            q = "UPDATE Inventario set Cantidad_inv = ? where id_inv = ?";
            pr = con.prepareStatement(q);
            pr.setInt(1, cantidad);
            pr.setInt(2, id_game);
            rs = pr.executeQuery();
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            try{
                con.close();
                pr.close();
                rs.close();
            }catch(Exception sqle){
                sqle.printStackTrace();
            }
        }
    }
}
