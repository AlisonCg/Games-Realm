/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author uzias
 */
public class Venta extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //llegamos aqui despues de que aprietan el boton de agregar al carrito
        //creo que una cookie habria estado mejor, pero por ahora usare la BD
        //la idea sera almacenar en la tabla cliente un numero de venta, este numero de venta tendra todos los videojuegos agregados 
       /*
        Entonces lo primero seria definirle un numero de venta al usuario unico
        despues obtener ese numero de venta en la consulta de carritojsp y mostrarlos para despues comprarlos
        en caso de que quiera comprar dos de lo mismo deberia hacer los registros n de los mismo
        */
        String cosa;
        cosa = request.getParameter("variable");
        
        int id_video = Integer.parseInt(cosa);
        List<Ventas> lista = Consultasxd.getMaximo();
        int finl=0;
        for(Ventas e: lista){
            //aqui sera donde registres la nueva venta, pero habria que ver si el usuario ya tiene un numero registrado
            //este seria el numero que le corresponderia al usuario, pero hay que checar antes que no tenga uno ya
            finl = (e.getId_video())+1;
        }
        
        Consultasxd obj = new Consultasxd();
        
        
        HttpSession sesion = request.getSession(false);
        String emailxd = (String) sesion.getAttribute("us");
        String contrazd = (String) sesion.getAttribute("contraseña");
        
        //aqui el metodo que puede ser el mas riesgoso xdxd posible error en linea 59 por el false que honestamente no estoy seguro que hace
        //este es el id del cliente
        int id = obj.obtenerUserCorreo(emailxd, contrazd);
        
        /*
        Mando a llamar al metodo que obtiene las ventas y aqui un for para ver que onda y dentrod e ese un if para que revise si el usuario ya se registro antes con un numero
        */
        int id_usaraquixd;
        List<Ventas> lis = Consultasxd.VerificaVenta();
        
        id_usaraquixd = finl;
        for(Ventas e:lis){
            if(e.getId_venta() == id){
                id_usaraquixd = e.getId_venta();
            }
        }
        //aqui se registra la venta
        obj.Reg_Venta(id_usaraquixd, id_video);
        
        //reenvio a todos
        response.sendRedirect("Todos");
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
