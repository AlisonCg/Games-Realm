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
        String cosa;
        cosa = request.getParameter("variable");
        
        int id = Integer.parseInt(cosa);
        List<Ventas> lista = Consultasxd.getMaximo();
        int finl=0;
        for(Ventas e: lista){
            finl = (e.getId_video())+1;
        }
        
        Consultasxd obj = new Consultasxd();
        
        
        HttpSession sesion = request.getSession(false);
        String emailxd = (String) sesion.getAttribute("us");
        String contrazd = (String) sesion.getAttribute("contraseña");
        
        //aqui el metodo que puede ser el mas riesgoso xdxd posible error en linea 59 por el false que honestamente no estoy seguro que hace
        id = obj.obtenerUserCorreo(emailxd, contrazd);
        
                
                //aqui se registra la venta
        obj.Reg_Venta(finl, id);
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
