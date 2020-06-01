/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
/**
 *
 * @author uzias
 */
public class Con_clas extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * 
     * 
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        out.println("<!DOCTYPE html>\n" +
"<html>\n" +
"    <head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"        <title>Games Realm | Carrito</title>\n" +
"        <link rel=\"icon\" href=\"img/GRL.jpg\" type=\"image/jpg\" />\n" +
"        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n" +
"        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n" +
"        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n" +
"       \n" +
"        </head>\n" +
"    <body style=\"background-color: #0C0C0D\">\n" +
"        <nav class=\"navbar navbar-expand-md navbar-dark bg-dark navbar-hover fixed-top\" style=\"background: #3C403F; color: #E8E8E8; opacity: 1; font-family:'Open Sans', sans-serif; font-size: 10px\">\n" +
"            <a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"img/GR.jpg\" class=\"hover\" style=\"height: 35px; width: 35px\"></a>\n" +
"            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarHover\" aria-controls=\"navbarDD\" aria-expanded=\"false\" aria-label=\"Navigation\" style=\"background: #24A5BA\">\n" +
"                <span class=\"navbar-toggler-icon\"></span>\n" +
"            </button>\n" +
"            <div class=\"collapse navbar-collapse\" id=\"navbarHover\">\n" +
"                <ul class=\"navbar-nav\">\n" +
"                    <li class=\"nav-item-2 active\">\n" +
"                        <a class=\"nav-link\" href=\"index.jsp\">HOME<span class=\"sr-only\">(current)</span></a>\n" +
"                    </li>\n" +
"                    <%  HttpSession sesion = request.getSession();\n" +
"                            int n = 1;  \n" +
"                            if(sesion.getAttribute(\"r\").equals(n))\n" +
"                            {\n" +
"                    %>\n" +
"                    <li class=\"nav-item\">\n" +
"                        <a class=\"nav-link\" href=\"Novedades.jsp\">NOVEDADES</a>\n" +
"                    </li>\n" +
"                    <li class=\"nav-item dropdown\">\n" +
"                        <a class=\"nav-link dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
"                            PRODUCTOS\n" +
"                        </a>\n" +
"                        <ul class=\"dropdown-menu bg-dark\" style=\"font-size: 10px\" id=\"navbarHover\">\n" +
"                            <li><a class=\"dropdown-item nav-link\" href=\"Agregar.jsp\">AGREGAR</a>   \n" +
"                            </li>\n" +
"                            <li><a class=\"dropdown-item nav-link\" href=\"Editar.jsp\">EDITAR</a>\n" +
"                            </li>\n" +
"                            <li><a class=\"dropdown-item nav-link\" href=\"Eliminar.jsp\">ELIMINAR</a>\n" +
"                            </li>\n" +
"                        </ul>\n" +
"                    </li>\n" +
"                    <%}else{\n" +
"                    %>\n" +
"                    <li class=\"nav-item\">\n" +
"                        <a class=\"nav-link\" href=\"Novedades.jsp\">NOVEDADES</a>\n" +
"                    </li>\n" +
"                    <%}%>\n" +
"                    <li class=\"nav-item dropdown\">\n" +
"                        <a class=\"nav-link dropdown-toggle\" href=\"Todos\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
"                            VIDEOJUEGOS\n" +
"                        </a>\n" +
"                        <ul class=\"dropdown-menu bg-dark\" style=\"font-size: 10px\" id=\"navbarHover\">\n" +
"                            <li><a class=\"dropdown-item nav-link\" href=\"#\">CLASIFICACIÓN<bold>&nbsp;&nbsp;&nbsp;&nbsp;></bold></a>\n" +
"                                <ul class=\"dropdown-menu bg-dark\" style=\"font-size: 10px\" id=\"navbarHover\">\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_clas?variable=1\">EVERYONE 10+</a></li>\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_clas?variable=2\">TEE 13+</a></li>\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_clas?variable=3\">MADURO 17+</a></li>\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_clas?variable=4\">ADULTOS 18+</a></li>\n" +
"                                </ul>\n" +
"                            </li>\n" +
"                            <li><a class=\"dropdown-item nav-link\" href=\"#\">PLATAFORMA<bold>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;></bold></a>\n" +
"                                <ul class=\"dropdown-menu bg-dark\" style=\"font-size: 10px\" id=\"navbarHover\">\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_pla?variable=1\">PS4</a></li>\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_pla?variable=2\">XBOX ONE</a></li>\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_pla?variable=3\">NINTENDO SWITCH</a></li>\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_pla?variable=4\">PC</a></li>\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_pla?variable=5\">XBOX 360</a></li>\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_pla?variable=6\">PS3</a></li>\n" +
"                                </ul>\n" +
"                            </li>\n" +
"                            <li><a class=\"dropdown-item nav-link\" href=\"#\">GÉNERO<bold>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;></bold></a>\n" +
"                                <ul class=\"dropdown-menu bg-dark\" style=\"font-size: 10px\" id=\"navbarHover\">\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_gen?variable=1\">PLATAFORMAS</a></li>\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_gen?variable=2\">MUNDO ABIERTO</a></li>\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_gen?variable=3\">DISPAROS</a></li>\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_gen?variable=4\">ACCIÓN Y AVENTURA</a></li>\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_gen?variable=5\">PELEAS</a></li>\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_gen?variable=6\">JUEGOS DE ROL</a></li>\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_gen?variable=7\">CARRERAS</a></li>\n" +
"                                </ul>\n" +
"                            </li>\n" +
"                        </ul>\n" +
"                    </li>\n" +
"                </ul>\n" +
"                <div class=\"col\">\n" +
"                \n" +
"                </div>\n" +
"                <span>\n" +
"                    <ul class=\"navbar-nav my-2 my-lg-0\">\n" +
"                        <li class=\"nav-item\">\n" +
"                        <%  HttpSession sesionI = request.getSession();\n" +
"                            if(sesionI.getAttribute(\"us\")==null){\n" +
"                        %>\n" +
"                          <a class=\"nav-link\" href=\"login.jsp\"><img src=\"img/ini.png\" class=\"hover\" style=\"height: 25px; width: 25px; margin-right: .5vw\">INICIAR SESIÓN</a>\n" +
"                        <%  }else{%>\n" +
"                          <a class=\"nav-link\" href=\"logout\"><img src=\"img/ini.png\" class=\"hover\" style=\"height: 25px; width: 25px; margin-right: .5vw\">CERRAR SESIÓN</a>\n" +
"                        <%}%>\n" +
"                        </li>\n" +
"                        <li class=\"nav-item\">\n" +
"                          <a class=\"nav-link\" href=\"carrito.jsp\" tabindex=\"-1\" aria-disabled=\"true\"><img src=\"img/carrito.png\" class=\"hover\" style=\"height: 25px; width: 25px\"></a>\n" +
"                        </li>\n" +
"                        <li class=\"nav-item-2\">\n" +
"                            <div id=\"ocultable\" style=\"display: none\">\n" +
"                                <div class=\"topnav\">\n" +
"                                    <input class=\"form-control\" type=\"text\" placeholder=\"Buscar\" aria-label=\"Search\" style=\"background: #0C0C0D; color: #E8E8E8; font-family:'Open Sans', sans-serif; border-color: #E8E8E8\">\n" +
"                                </div> \n" +
"                            </div>\n" +
"                        </li>\n" +
"                        <li class=\"nav-item\">\n" +
"                            <a class=\"nav-link\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\"><img src=\"img/buscar.png\" class=\"hover\" style=\"height: 25px; width: 25px; margin-right: .5vw\" onclick=\"return mostrarOcultar('ocultable')\" type=\"button\" class=\"oculta\"></a>\n" +
"                            \n" +
"                        </li>\n" +
"                    </ul>\n" +
"                </span>\n" +
"            </div>\n" +
"        </nav>      ");
        String elid;
        elid = request.getParameter("variable");
        int i = Integer.parseInt(elid);
            List<Videogame> lista = Consultasxd.getByClass(i);
            
            //agregamos un for para que agregue los elementos de la lista
            for(Videogame e:lista){
                out.println("<table border = 0 id=\"consultasxd\">");
                out.println("<tr>"
                        + "<td><img src="+e.getImagen()+" style=\"width: 30%; height: 210px;\"></td>"
                        +"</tr>"
                        +"<tr>"
                        + "<td>"+e.getNombre()+"</td>"
                        +"</tr>"
                        +"<tr>"
                        + "<td>"+e.getEdicion()+"</td>"
                        +"</tr>"
                        +"<tr>"
                        + "<td>"+e.getAnio()+"</td>"
                        +"</tr>"
                        +"<tr>"
                        + "<td>"+e.getId_genero()+"</td>"
                        +"</tr>"
                        +"<tr>"        
                        + "<td>"+e.getId_cc()+"</td>"
                        +"</tr>"
                        +"<tr>"
                        + "<td>"+e.getId_cp()+"</td>"
                        +"</tr>"
                        +"<tr>"
                        + "<td><a href='Detallazos?variable="+e.getId_video()+"' class='botonlink'>Ver detalles</a>"//aqui el linkazo para ir a detallar a cada uno xd xd
                                + "<a href='Venta?variable="+e.getId_video()+"' class='botonlink' ><img src=\"img/carrito.png\" width=20 height=20></a></td>" //aqui el linkazo para ir al carrito xd xd xd
                        + "</tr>");
                out.println("</table>");
            }
            out.println("<script src=\"js/JQuery.js\" type=\"text/javascript\"></script>\n" +
"        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"    </body>\n" +
"</html>");
    }
}
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
