<%-- 
    Document   : carrito
    Created on : 30/05/2020, 06:32:50 AM
    Author     : uzias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Games Realm | Carrito</title>
        <link rel="icon" href="img/GRL.jpg" type="image/jpg" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
       
        </head>
    <body style="background-color: #0C0C0D">
        <nav class="navbar navbar-expand-md navbar-dark bg-dark navbar-hover fixed-top" style="background: #3C403F; color: #E8E8E8; opacity: 1; font-family:'Open Sans', sans-serif; font-size: 10px">
            <a class="navbar-brand" href="index.jsp"><img src="img/GR.jpg" class="hover" style="height: 35px; width: 35px"></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarHover" aria-controls="navbarDD" aria-expanded="false" aria-label="Navigation" style="background: #24A5BA">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarHover">
                <ul class="navbar-nav">
                    <li class="nav-item-2 active">
                        <a class="nav-link" href="index.jsp">HOME<span class="sr-only">(current)</span></a>
                    </li>
                    <%  HttpSession sesion = request.getSession();
                            int n = 1;  
                            if(sesion.getAttribute("r").equals(n))
                            {
                    %>
                    <li class="nav-item">
                        <a class="nav-link" href="Novedades.jsp">NOVEDADES</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            PRODUCTOS
                        </a>
                        <ul class="dropdown-menu bg-dark" style="font-size: 10px" id="navbarHover">
                            <li><a class="dropdown-item nav-link" href="Agregar.jsp">AGREGAR</a>   
                            </li>
                            <li><a class="dropdown-item nav-link" href="Editar.jsp">EDITAR</a>
                            </li>
                            <li><a class="dropdown-item nav-link" href="Eliminar.jsp">ELIMINAR</a>
                            </li>
                        </ul>
                    </li>
                    <%}else{
                    %>
                    <li class="nav-item">
                        <a class="nav-link" href="Novedades.jsp">NOVEDADES</a>
                    </li>
                    <%}%>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="Todos" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            VIDEOJUEGOS
                        </a>
                        <ul class="dropdown-menu bg-dark" style="font-size: 10px" id="navbarHover">
                            <li><a class="dropdown-item nav-link" href="#">CLASIFICACIÓN<bold>&nbsp;&nbsp;&nbsp;&nbsp;></bold></a>
                                <ul class="dropdown-menu bg-dark" style="font-size: 10px" id="navbarHover">
                                    <li><a class="dropdown-item nav-link" href="Con_clas?variable=1">EVERYONE 10+</a></li>
                                    <li><a class="dropdown-item nav-link" href="Con_clas?variable=2">TEE 13+</a></li>
                                    <li><a class="dropdown-item nav-link" href="Con_clas?variable=3">MADURO 17+</a></li>
                                    <li><a class="dropdown-item nav-link" href="Con_clas?variable=4">ADULTOS 18+</a></li>
                                </ul>
                            </li>
                            <li><a class="dropdown-item nav-link" href="#">PLATAFORMA<bold>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;></bold></a>
                                <ul class="dropdown-menu bg-dark" style="font-size: 10px" id="navbarHover">
                                    <li><a class="dropdown-item nav-link" href="Con_pla?variable=1">PS4</a></li>
                                    <li><a class="dropdown-item nav-link" href="Con_pla?variable=2">XBOX ONE</a></li>
                                    <li><a class="dropdown-item nav-link" href="Con_pla?variable=3">NINTENDO SWITCH</a></li>
                                    <li><a class="dropdown-item nav-link" href="Con_pla?variable=4">PC</a></li>
                                    <li><a class="dropdown-item nav-link" href="Con_pla?variable=5">XBOX 360</a></li>
                                    <li><a class="dropdown-item nav-link" href="Con_pla?variable=6">PS3</a></li>
                                </ul>
                            </li>
                            <li><a class="dropdown-item nav-link" href="#">GÉNERO<bold>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;></bold></a>
                                <ul class="dropdown-menu bg-dark" style="font-size: 10px" id="navbarHover">
                                    <li><a class="dropdown-item nav-link" href="Con_gen?variable=1">PLATAFORMAS</a></li>
                                    <li><a class="dropdown-item nav-link" href="Con_gen?variable=2">MUNDO ABIERTO</a></li>
                                    <li><a class="dropdown-item nav-link" href="Con_gen?variable=3">DISPAROS</a></li>
                                    <li><a class="dropdown-item nav-link" href="Con_gen?variable=4">ACCIÓN Y AVENTURA</a></li>
                                    <li><a class="dropdown-item nav-link" href="Con_gen?variable=5">PELEAS</a></li>
                                    <li><a class="dropdown-item nav-link" href="Con_gen?variable=6">JUEGOS DE ROL</a></li>
                                    <li><a class="dropdown-item nav-link" href="Con_gen?variable=7">CARRERAS</a></li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                </ul>
                <div class="col">
                
                </div>
                <span>
                    <ul class="navbar-nav my-2 my-lg-0">
                        <li class="nav-item">
                        <%  HttpSession sesionI = request.getSession();
                            if(sesionI.getAttribute("us")==null){
                        %>
                          <a class="nav-link" href="login.jsp"><img src="img/ini.png" class="hover" style="height: 25px; width: 25px; margin-right: .5vw">INICIAR SESIÓN</a>
                        <%  }else{%>
                          <a class="nav-link" href="logout"><img src="img/ini.png" class="hover" style="height: 25px; width: 25px; margin-right: .5vw">CERRAR SESIÓN</a>
                        <%}%>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="carrito.jsp" tabindex="-1" aria-disabled="true"><img src="img/carrito.png" class="hover" style="height: 25px; width: 25px"></a>
                        </li>
                        <li class="nav-item-2">
                            <div id="ocultable" style="display: none">
                                <div class="topnav">
                                    <input class="form-control" type="text" placeholder="Buscar" aria-label="Search" style="background: #0C0C0D; color: #E8E8E8; font-family:'Open Sans', sans-serif; border-color: #E8E8E8">
                                </div> 
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#" tabindex="-1" aria-disabled="true"><img src="img/buscar.png" class="hover" style="height: 25px; width: 25px; margin-right: .5vw" onclick="return mostrarOcultar('ocultable')" type="button" class="oculta"></a>
                            
                        </li>
                    </ul>
                </span>
            </div>
        </nav>      
        
        <h2>Tu carrito</h2>
    <center>
        <table id="carrito" width="90%" >
            <tr height="100px">
                <%
                    
                %>
                <td width="30%"></td><td></td>
                <%
                    
                %>
            </tr>
            <tr height="80px">
                <td></td>
                <td><a href='Detallazos?variable="+e.getId_video()+"' class='botonlink' id="alad">Realizar compra</a></td>
            </tr>
            
        </table>
    </center>
        <script src="js/JQuery.js" type="text/javascript"></script>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    </body>
</html>
