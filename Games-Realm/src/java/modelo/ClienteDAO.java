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
        int r=0;
        String sql = "select Nivel from Cliente where Email=? and Pass=?";
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getEmail());
            ps.setString(2, cli.getContra());
            rs = ps.executeQuery();
            
            while(rs.next()) {
                r=rs.getInt("Nivel");
            }
            if(r==1){
                return 1;
            } 
            if (r==2){
                return 2;
            } else {
                return 0;
            }
            
        } catch (Exception e) {
            
            System.out.println("Ocurrio un error clienteDAO");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            return 0;
        }
    }
    
}