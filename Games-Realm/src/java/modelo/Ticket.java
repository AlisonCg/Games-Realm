/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
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
public class Ticket extends HttpServlet {

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
"    <body style=\"background-color: #0C0C0D\" onload=\"funcionxd();\">\n" +
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
"                    </li>\n");
                     HttpSession sesion = request.getSession();
                            int n=1;
                            if(sesion.getAttribute("r").equals(n)){

out.println("                    <li class=\"nav-item\">\n" +
"                        <a class=\"nav-link\" href=\"Novedades.jsp\">NOVEDADES</a>\n" +
"                    </li>\n" +
"                    <li class=\"nav-item dropdown\">\n" +
"                        <a class=\"nav-link dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
"                            PRODUCTOS\n" +
"                        </a>\n" +
"                        <ul class=\"dropdown-menu bg-dark\" style=\"font-size: 10px\" id=\"navbarHover\">\n" +
"                            <li><a class=\"dropdown-item nav-link\" href=\"Agregar.jsp\">AGREGAR</a>\n" +
"                        </ul>\n" +
"                    </li>\n" );
}else{

out.println("                    <li class=\"nav-item\">\n" +
"                        <a class=\"nav-link\" href=\"Novedades.jsp\">NOVEDADES</a>\n" +
"                    </li>\n" );
}
out.println("                    <li class=\"nav-item dropdown\">\n" +
"                        <a class=\"nav-link dropdown-toggle\" href=\"Todos\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n" +
"                            VIDEOJUEGOS\n" +
"                        </a>\n" +
"                        <ul class=\"dropdown-menu bg-dark\" style=\"font-size: 10px\" id=\"navbarHover\">\n" +
"                            <li><a class=\"dropdown-item nav-link\" href=\"#\">CLASIFICACIÓN<bold>&nbsp;&nbsp;&nbsp;&nbsp;></bold></a>\n" +
"                                <ul class=\"dropdown-menu bg-dark\" style=\"font-size: 10px\" id=\"navbarHover\">\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_clas?variable=1\">EVERYONE 10+</a></li>\n" +
"                                    <li><a class=\"dropdown-item nav-link\" href=\"Con_clas?variable=2\">TEEN 13+</a></li>\n" +
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
"                        <li class=\"nav-item\">\n" );
HttpSession sesionI = request.getSession();
                           if(sesionI.getAttribute("us")==null){
out.println("                          <a class=\"nav-link\" href=\"login.jsp\"><img src=\"img/ini.png\" class=\"hover\" style=\"height: 25px; width: 25px; margin-right: .5vw\">INICIAR SESIÓN</a>\n" );
 }else{
out.println("                          <a class=\"nav-link\" href=\"logout\"><img src=\"img/ini.png\" class=\"hover\" style=\"height: 25px; width: 25px; margin-right: .5vw\">CERRAR SESIÓN</a>\n" );
        }
out.println("                        </li>\n" +
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
"        </nav>   ");
        //aqui ya se genera el ticket recio, en teoria si llegas aqui es porque ya compraste, entonces deberia de borrarte el id de venta en tu usuario
        String me = request.getParameter("metodooo");
        String metodo = "";
        if(me.equals("1")){
            metodo = "Tarjeta";
        } else if (me.equals("2")){
            metodo = "Paypal";
        } else {
            metodo = "Efectivo";
        }    
        //ya esta el metodo
        //hay que verificar el id del ticket
        List<Ti> lista = Consultasxd.getMaximoTicket();
        int finl=0;
        for(Ti e: lista){
            finl = (e.getId_ticket())+1; //este sera el numero de ticket recio
        }
        //aqui la fecha un poco descompuesta
        Calendar c = Calendar.getInstance();
        String dia = Integer.toString(c.get(Calendar.DATE));
         String mes = Integer.toString(c.get(Calendar.MONTH));
        String annio = Integer.toString(c.get(Calendar.YEAR));
        
        String fecha = annio+"-"+mes+"-"+dia;
        /////////////////////////////////////////////////////////////////////////////////////////para el total, subtotal y eso
         HttpSession se = request.getSession(false);
                     String emailxd = (String) se.getAttribute("us");
                     String contrazd = (String) se.getAttribute("contraseña");
                     
                     Consultasxd obj = new Consultasxd();
                     
                     int id = obj.obtenerUserCorreo(emailxd, contrazd);
                     
                     double sub = 0;
                     //aqui sera un metodo para obtener lo que haya en venta pero hay que pasarle el id de la venta
                     //por lo tanto necesito obtenerlo
                     //ya tengo el id del cliente, ahora falta un select que me de el id de venta
                     int o = 0;
                     int id_venta = obj.obtenerVenta(id);
                     List<Ventas> la = obj.VentabyVentaid(id_venta);
                    for (Ventas e:la){
                         int id_videojuego = e.getId_video();
                         List<Videogame> li = Consultasxd.getById(id_videojuego);
                         //aqui ya estoy entrando a los videojuegos
                         for (Videogame j:li){
                             String valor1 = request.getParameter("nu"+o);
                             int v1 = Integer.parseInt(valor1); //cantidad de juegos del mismo que compro
                             sub += (j.getPrecio())*v1;
                             o++;
                         }
                    }
                    
                    double iva = sub * .16;
                    double total = sub + iva;
                    double envio = 100;
        ////////////////////////////////////////////////////////////////////////////////////////
        //ya tengo todos los datos del ticket, ahora solo queda almacenar y  mostrar
        //tengo que almacenar un ticket
        
        obj.registrarTicket(finl, metodo, fecha, total, sub, iva, envio, id_venta);
        //el ticket esta registrado
        out.println("<style type=\"text/css\">\n" +
"	.g {\n" +
"		text-align: center;\n" +
"		background-color: white;\n" +
"		opacity: .4;\n" +
"		color: black;\n" +
"	}\n" +
"</style>\n" +
"<center>\n" +
"	<table  width=\"70%\" class=\"g\">\n" +
"		<tr>\n" +
"			<td colspan=\"2\">Compra"+finl+"</td>\n" +
"		</tr>\n" +
"		<tr>\n" +
"			<td width=\"50%\">Servicio</td>\n" +
"			<td width=\"50%\">"+metodo+"</td>\n" +
"		</tr>\n" +
"		<tr>\n" +
"			<td width=\"50%\">Fecha</td>\n" +
"			<td width=\"50%\">"+fecha+"</td>\n" +
"		</tr>\n" +
"		<tr>\n" +
"			<td colspan=\"2\">DETALLES DE LA COMPRA</td>\n" +
"		</tr>\n" +
"		<tr>\n" +
"			<td width=\"50%\">Nombre producto</td>\n" +
"			<td width=\"50%\">Precio</td>\n" +
"		</tr>\n" );
        for(Ventas e:la){
                         int id_videojuego = e.getId_video();
                         List<Videogame> li = Consultasxd.getById(id_videojuego);
                         //aqui ya estoy entrando a los videojuegos
                         for (Videogame j:li){
                             String valor1 = request.getParameter("nu"+o);
                             int v1 = Integer.parseInt(valor1); //cantidad de juegos del mismo que compro
                             sub += (j.getPrecio())*v1;
                             o++;
out.println("		<tr>\n" +
"			<td width=\"50%\">"+j.getNombre()+"</td>\n" +
"			<td width=\"50%\">"+j.getPrecio()+"</td>\n" +
"		</tr>\n" );
        }  }
out.println("		<tr>\n" +
"			<td width=\"50%\"></td>\n" +
"			<td width=\"50%\">Total"+total+"</td>\n" +
"		</tr>\n" +
"	</table>\n" +
"</center>");
            out.println("<script src=\"js/JQuery.js\" type=\"text/javascript\"></script>\n" +
"        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"    </body>\n" +
"</html>");
    }
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
