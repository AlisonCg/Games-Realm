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
    
    public static void Reg_Venta(int id, int id_user){
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
            pr.setInt(2, id_user);
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
}
