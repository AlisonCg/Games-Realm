package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDAO implements Validar{
    
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
       
    @Override
    public int validar(Cliente cli) {
        int nivel=0;
        String sql = "select Email, Pass from Cliente where Email=? and Pass=?";
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                nivel=rs.getInt(1);
            }
            con.close();
            rs.close();
            return nivel;
        } catch (Exception e) {
            
            System.out.println("Ocurrio un error clienteDAO");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            return 0;
        }
    }
    
}