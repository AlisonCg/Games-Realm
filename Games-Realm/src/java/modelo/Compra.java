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
public class Compra extends HttpServlet {

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
        //aqui voy a hacer todo esto de la compra, para luego mandar a un servlet que me imprima un ticket
        String elid;
        elid = request.getParameter("x");
        int i = Integer.parseInt(elid);
        
        HttpSession verificador_sesion = request.getSession();
        if(verificador_sesion.getAttribute("us")==null){
                response.sendRedirect("login.jsp");
        }
        //como se calcula el subtotal, que seria el costo por todos los videogames, el costo de envio lo dejare en 100 para todos
        //obtengo el int i que es la x anterior, que es a su vez la cantidad de veces que itero en el carrito
        
        //aqui calculo el subtotal
        double sub = 0;
        //primero necesito saber que juegos son
        //para mandar esos id de juego a una consulta que me regrese el precio en base al juego id
        //como ya tengo uno que trae por id, mejor uso objetos y le saco el precio
        HttpSession se = request.getSession(false);
                     String emailxd = (String) se.getAttribute("us");
                     String contrazd = (String) se.getAttribute("contraseña");
                     
                     Consultasxd obj = new Consultasxd();
                     
                     int id = obj.obtenerUserCorreo(emailxd, contrazd);
                     
                     
                     //aqui sera un metodo para obtener lo que haya en venta pero hay que pasarle el id de la venta
                     //por lo tanto necesito obtenerlo
                     //ya tengo el id del cliente, ahora falta un select que me de el id de venta
                     //i es el numero de videojuegos con cada uno debo obtener el valor que tiene con un for
                     int o = 0;
                     int id_venta = obj.obtenerVenta(id);
                     List<Ventas> lista = obj.VentabyVentaid(id_venta);
                    for (Ventas e:lista){
                         int id_videojuego = e.getId_video();
                         List<Videogame> li = Consultasxd.getById(id_videojuego);
                         //aqui ya estoy entrando a los videojuegos
                         for (Videogame j:li){
                             String valor1 = request.getParameter("numero"+o);
                             int v1 = Integer.parseInt(valor1); //este valor es el numero de veces que aparecio, osea el numeor de juegos que compro el dud
                             sub += (j.getPrecio())*v1;
                             i++;
                             out.println("<input type='hidden' id='nu"+i+"' value='"+sub+"'>");
                             //aqui voy a disminuir en inventario
                             
                             List<Inventario> l = obj.dimecantById(j.getId_video());
                             int canxd = 0;
                             
                             for (Inventario z: l){
                                 canxd = z.getCantidad_inv();
                                 int numero_a_usar = canxd - v1;
                                 obj.disminuye(id_videojuego, numero_a_usar);
                                 
                             }
                         }
                    }
        
           out.println("<form>"
                   + "<h2>Informacion del envio</h2>\n" +
"	<h4>Contacto</h4>\n" +
"	<input type=\"text\" name=\"name\" id=\"nombre\" placeholder=\"Nombre\" required>\n" +
"	<h4>Direccion</h4>\n" +
"	<input type=\"text\" name=\"name\" id=\"calle\" placeholder=\"Calle\" required> <input type=\"number\" id=\"numero\" name=\"name\" placeholder=\"numero\" min=\"1\" value=\"1\" max=\"2000\" required><br>\n" +
"	<input type=\"text\" name=\"name\" placeholder=\"Estado/Provincia\" id=\"estado\" required> <input type=\"text\" id=\"ciudad\" name=\"name\" placeholder=\"Ciudad\" required>\n" +
"	<input type=\"number\" name=\"name\" id=\"cp\" placeholder=\"C.P.\" min=\"0\" max=\"99999\" required>\n" +
"	<br>\n" +
"\n" +
"	<h2>Metodos de pago</h2>\n" +
"	<script type=\"text/javascript\">\n" +
"		function funcionxd(){\n" +
"			document.getElementById('hello').innerHTML='<h3>Tarjeta</h3>'\n" +
"			+'<h4>Numero de tarjeta</h4>'\n" +
"			+'<input type=\"number\" name=\"1\" min=\"1000\" placeholder=\"0000\" required><input placeholder=\"0000\" type=\"number\" name=\"1\" min=\"0000\" required><input placeholder=\"0000\" type=\"number\" name=\"1\" min=\"0000\" required>'\n" +
"			+'<h4>Titular</h4>'\n" +
"			+'<input type=\"text\" placeholder=\"Juan Perez\" required>'\n" +
"			+'<h4>Caducidad</h4>'\n" +
"			+'<input type=\"date\" min=\"2020-06-11\" required>'\n" +
"			+'<h4>CVV</h4>'\n" +
"			+'<input type=\"number\" required placeholder=\"000\" min=\"001\" max=\"999\">';\n" +
"			document.getElementById('hello2').innerHTML=\"\";\n" +
"			document.getElementById('metodo').value = 2;\n" +
"		}\n" +
"		function funcion2xd(){\n" +
"			document.getElementById('hello').innerHTML='<h3>Paypal</h3>'\n" +
"			+'<input type=\"text\" required placeholder=\"Usuario\"> '\n" +
"			+'<input type=\"pass\" required placeholder=\"Contraseña\"> ';\n" +
"			document.getElementById('hello2').innerHTML=\"\";\n" +
"			document.getElementById('metodo').value = 2;\n" +
"		}\n" +
"		function funcion3xd(){\n" +
"			var numero = Math.random(500000, 900000);\n" +
"			document.getElementById('hello').innerHTML='<h3>Efectivo</h3>'\n" +
"			+'<h4>Pasa a pagar este numero</h4>';\n" +
"			document.getElementById('hello2').innerHTML=numero*1000000;\n" +
"			document.getElementById('metodo').value = 3;\n" +
"		}\n" +
"	</script>\n" +
"	<style type=\"text/css\">\n" +
"		img {\n" +
"			margin: 1rem;\n" +
"		}\n" +
"	</style>\n" +
"	<img class=\"imagen\" src=\"img/tar.png\" width=\"100\" height=\"60\" onclick=\"funcionxd();\"><img class=\"imagen\" src=\"img/pay.png\" width=\"200\" height=\"60\" onclick=\"funcion2xd();\"><img class=\"imagen\" src=\"img/din.png\" width=\"100\" height=\"60\" onclick=\"funcion3xd();\">\n" +
"	<div id=\"hello\">\n" +
"		\n" +
"	</div>\n" +
"<div id=\"hello2\">\n" +
"		\n" +
"	</div>\n" +
                   "<style type=\"text/css\">\n" +
"		input {\n" +
"			padding: 1rem;\n" +
"			margin: 1rem;\n" +
"		}"+
                   ".imagen {\n" +
"			margin: 1rem;\n" +
"		}"+
                   "</style>"+
"	<h2>Detalles</h2>\n" +
"	<table  width=\"30%\">\n" +
"		<tr>\n" +
"			<td width=\"50%\"></td>\n" +
"			<td width=\"50%\"></td>\n" +
"		</tr>\n" +
"		<tr>\n" +
"			<td>Subtotal</td>\n" +
"			<td></td>\n" +
"		</tr>\n" +
"		<tr>\n" );
           //el numero de productos seria la x claramente xd
           //aqui hare los metodos recio
           double iva = sub*.16;
           double total = sub + iva;
out.println("			<td>#Productos</td>\n" +
"			<td>"+Integer.toString(i)+"</td>\n" +
"		</tr>\n" +
"		<tr>\n" +
"			<td>Envío</td>\n" +
"			<td>100</td>\n" +
"		</tr>\n" +
"		<tr>\n" +
"			<td>IVA</td>\n" +
"			<td>"+iva+"</td>\n" +
"		</tr>\n" +
"		<tr>\n" +
"			<td>Total</td>\n" +
"			<td>"+total+"</td>\n" +
"		</tr>\n" +
"	</table>\n" +
"	<br>\n" +
"	<input type=\"hidden\" id=\"metodooo\" value=\"1\">\n" +
"	<button href=\"Ticket\" class='botonlink' type=\"submit\" >Compra</button>\n" +                   
"	</form>");
        
             out.println("</table></center>");
            out.println("<script src=\"js/JQuery.js\" type=\"text/javascript\"></script>\n" +
"        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"        <link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"    </body>\n" +
"</html>");
    }
} //ya despues de todo esto me manda a otra pag con el ticket diria yo y seria un gg gallos
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
