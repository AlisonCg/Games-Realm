<%-- 
    Document   : Agregar
    Created on : 31/05/2020, 07:05:07 PM
    Author     : alis0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*,java.util.*,java.text.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Games Realm | Agregar</title>
        <link rel="icon" href="img/GRL.jpg" type="image/jpg" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <script src="js/validar.js" type="text/javascript"></script>
    </head>
    <body background="img/fon_1.jpg"
    style="background-repeat: no-repeat !important;
    background-attachment: scroll !important;
    background-position: center center !important;
    z-index: auto;
    background-size: cover !important;
    -webkit-background-size: cover !important;
    -moz-background-size: cover !important;
    -o-background-size: cover !important;">
        <nav class="navbar navbar-expand-md navbar-dark bg-dark navbar-hover fixed-top" style="background: #3C403F; color: #E8E8E8; opacity: 1; font-family:'Open Sans', sans-serif; font-size: 10px">
            <a class="navbar-brand" href="index.jsp"><img src="img/GR.jpg" class="hover" style="height: 35px; width: 35px"></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarHover" aria-controls="navbarDD" aria-expanded="false" aria-label="Navigation" style="background: #24A5BA">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarHover">
                <ul class="navbar-nav">
                    <li class="nav-item dropdown active">
                        <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            PRODUCTOS
                        </a>
                        <ul class="dropdown-menu bg-dark" style="font-size: 10px" id="navbarHover">
                            <li><a class="dropdown-item nav-link active" style="background-color: #24A5BA" href="Agregar.jsp">AGREGAR</a>   
                            </li>
                            <li><a class="dropdown-item nav-link" href="Editar.jsp">EDITAR</a>
                            </li>
                            <li><a class="dropdown-item nav-link" href="Eliminar.jsp">ELIMINAR</a>
                            </li>
                        </ul>
                    </li>
                    <%  HttpSession sesion = request.getSession();
                            int n = 1;  
                            if(sesion.getAttribute("r").equals(n))
                            {
                    %>
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">HOME</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Novedades.jsp">NOVEDADES</a>
                    </li> 
                    <%}else{
                    %>
                    <li class="nav-item">
                        <a class="nav-link" href="Novedades.jsp">NOVEDADES</a>
                    </li>
                    <%}%>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            VIDEOJUEGOS
                        </a>
                        <ul class="dropdown-menu bg-dark" style="font-size: 10px" id="navbarHover">
                            <li><a class="dropdown-item nav-link" href="#">CLASIFICACIÓN<bold>&nbsp;&nbsp;&nbsp;&nbsp;></bold></a>
                                <ul class="dropdown-menu bg-dark" style="font-size: 10px" id="navbarHover">
                                    <li><a class="dropdown-item nav-link" href="#">EVERYONE 10+</a></li>
                                    <li><a class="dropdown-item nav-link" href="#">TEE 13+</a></li>
                                    <li><a class="dropdown-item nav-link" href="#">MADURO 17+</a></li>
                                    <li><a class="dropdown-item nav-link" href="#">ADULTOS 18+</a></li>
                                </ul>
                            </li>
                            <li><a class="dropdown-item nav-link" href="#">PLATAFORMA<bold>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;></bold></a>
                                <ul class="dropdown-menu bg-dark" style="font-size: 10px" id="navbarHover">
                                    <li><a class="dropdown-item nav-link" href="#">PS4</a></li>
                                    <li><a class="dropdown-item nav-link" href="#">XBOX ONE</a></li>
                                    <li><a class="dropdown-item nav-link" href="#">NINTENDO SWITCH</a></li>
                                    <li><a class="dropdown-item nav-link" href="#">PC</a></li>
                                    <li><a class="dropdown-item nav-link" href="#">XBOX 360</a></li>
                                    <li><a class="dropdown-item nav-link" href="#">PS3</a></li>
                                </ul>
                            </li>
                            <li><a class="dropdown-item nav-link" href="#">GÉNERO<bold>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;></bold></a>
                                <ul class="dropdown-menu bg-dark" style="font-size: 10px" id="navbarHover">
                                    <li><a class="dropdown-item nav-link" href="#">PLATAFORMAS</a></li>
                                    <li><a class="dropdown-item nav-link" href="#">MUNDO ABIERTO</a></li>
                                    <li><a class="dropdown-item nav-link" href="#">DISPAROS</a></li>
                                    <li><a class="dropdown-item nav-link" href="#">ACCIÓN Y AVENTURA</a></li>
                                    <li><a class="dropdown-item nav-link" href="#">PELEAS</a></li>
                                    <li><a class="dropdown-item nav-link" href="#">JUEGOS DE ROL</a></li>
                                    <li><a class="dropdown-item nav-link" href="#">CARRERAS</a></li>
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
                          <a class="nav-link" href="#" tabindex="-1" aria-disabled="true"><img src="img/carrito.png" class="hover" style="height: 25px; width: 25px"></a>
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
        <br><br>
        <div oncopy="return false" onpaste="return false" ondragstart="return false;" ondrop="return false;" class="contenedor2 container" style="font-family: 'Roboto', sans-serif; background-color: #0C0C0C; height: 80%; border-radius: 10px; opacity:.9; margin-top: 3vw">
            <form action="guardar.jsp" name="formulario" onsubmit="return valido(this)">
                <div class="form-group"><br>
                <h2>Agregar Producto</h2>
                <hr style="display: block; 
                height: 1px;
                border: 0; 
                border-top: 2px solid #FFFFFF;
                margin: 1em 0; 
                padding: 0;">
                </div>
                <label style="color: white"><h9>Nota: Escribe todos los datos correctamente del producto a agregar</h9></label><br><br>
                <div class="form-group">
                    <div class="row">
                        <input class="form-control" type="hidden" name="txtid" value="--">
                        <div class="col clearfix">
                            <input oncopy="return false" onpaste="return false" class="form-control" type="text" name="txtnom" placeholder="Nombre" autocomplete="off" required="required">
                        </div>
                        <div class="col clearfix">
                            <input id="contra" class="form-control" type="password" name="txtcontra" placeholder="Contraseña" required="required">
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="row">
                        <div class="col clearfix">
                            <input oncopy="return false" onpaste="return false" class="form-control" type="text" name="txtappa" placeholder="Precio 0.00" autocomplete="off" required="required">
                        </div>
                        <div class="col clearfix">
                            <input id="contra2" class="form-control" type="password" name="txtcontra2" placeholder="Confirmar contraseña" required="required">
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="row">
                        <div class="col clearfix">
                            <input oncopy="return false" onpaste="return false" class="form-control" type="email" name="email_contacto" id="email_contacto" required="required" placeholder="Email" autocomplete="off">
                        </div>
                        <div class="col clearfix">
                            <input class="form-control" type="hidden" name="txtd" value="direccion">
                            <input class="form-control" type="hidden" name="txtni" value="2">
                        </div>
                    </div>
                </div>
                <input style="background-color: #24A5BA; border: white; margin-top: 1.5vw; color: white" class="btn btn-block" type="submit" name="accion" value="Crear cuenta">
            </form><br>
            <hr><br>
            <br><h6><a href="index.jsp">Regresar</a></h6>
        </div>
        <script src="js/JQuery.js" type="text/javascript"></script>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    </body>
</html>
