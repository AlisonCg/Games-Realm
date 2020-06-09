<%-- 
    Document   : Novedades
    Created on : 26/05/2020, 05:10:42 AM
    Author     : alis0
--%>

<%@page language="java" import="java.sql.*"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Games Realm | Novedades</title>
        <link rel="icon" href="img/GRL.jpg" type="image/jpg" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
        
	<link href="css/slider.css" rel="stylesheet">
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
                            int n=1;
                            if(sesion.getAttribute("r").equals(n)){
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
        <div id="slides" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="img/nove/novedades.jpg">
                    <div class="carousel-caption">
                        <h1 class="display-2" style="margin-top: 10vw; font-family: 'Impact', sans-serif; color: white">2020</h1>
                    </div>
                </div>
            </div>
        </div>
        <br><br>
        
        <h1>ÚLTIMAS NOTICIAS</h1>
        <div class="d">
            <div class="row">
                <div class="col clearfix">
                    <a  target="_blank" style="text-decoration:none" href="https://vandal.elespanol.com/noticia/1350734929/consiguen-recuperar-un-juego-inedito-de-nes-basado-en-days-of-thunder-de-tom-cruise/">
                        <img class="hover2" src="img/nove/noticia_1.jpg" style="width: 96%">
                        <br><br><h6>Consiguen recuperar un juego inédito de NES basado en Días de trueno de Tom Cruise</h6>
                        <h6 class="opa">02/06/2020</h6>
                    </a>
                </div>
                <div class="col clearfix">
                    <a  target="_blank" style="text-decoration:none" href="https://vandal.elespanol.com/noticia/1350734928/ps5-y-xbox-series-x-difuminaran-la-linea-entre-cine-y-videojuego-dice-el-cto-de-epic-games/">
                        <img class="hover2" src="img/nove/noticia_2.jpg" style="width: 96%">
                        <br><br><h6>PS5 y Xbox Series X difuminarán la línea entre cine y videojuego, dice el CTO de Epic Games</h6>
                        <h6 class="opa">02/06/2020</h6>
                    </a>
                </div>
                <div class="col clearfix">
                    <a  target="_blank" style="text-decoration:none" href="https://vandal.elespanol.com/noticia/1350734927/skelattack-el-plataformas-2d-de-konami-ya-disponible-en-ps4-pc-xbox-one-y-switch/">
                        <img class="hover2" src="img/nove/noticia_3.jpg" style="width: 96%">
                        <br><br><h6>Skelattack, el plataformas 2D de Konami, ya disponible en PS4, PC, Xbox One y Switch</h6>
                        <h6 class="opa">02/06/2020</h6>
                    </a>
                </div>
                <div class="col clearfix">
                    <a  target="_blank" style="text-decoration:none" href="https://vandal.elespanol.com/noticia/1350734926/disability-serious-game-un-concurso-que-premiara-ideas-de-juegos-accesibles-e-inclusivos/">
                        <img class="hover2" src="img/nove/noticia_4.jpg" style="width: 96%">
                        <br><br><h6>Disability Serious Game, un concurso que premiará ideas de juegos accesibles e inclusivos</h6>
                        <h6 class="opa">02/06/2020</h6>
                    </a>
                </div>
                <div class="col clearfix">
                    <a  target="_blank" style="text-decoration:none" href="https://vandal.elespanol.com/noticia/1350734925/metro-exodus-dishonored-2-y-nascar-heat-4-llegan-en-junio-a-ps-now/">
                        <img class="hover2" src="img/nove/noticia_5.jpg" style="width: 96%">
                        <br><br><h6>Metro Exodus, Dishonored 2 y NASCAR Heat 4 llegan en junio a PS Now</h6>
                        <h6 class="opa">02/06/2020</h6>
                    </a>
                </div>
            </div>
        </div>         
        <br><br>
        
        <div class="d">
            <div class="row">
                <div class="col clearfix">
                    <a  target="_blank" style="text-decoration:none" href="https://vandal.elespanol.com/noticia/1350734924/este-mod-para-crysis-nos-da-pistas-sobre-como-se-podria-ver-su-remasterizacion/">
                        <img class="hover2" src="img/nove/noticia_6.jpg" style="width: 96%">
                        <br><br><h6>Este mod para Crysis nos da pistas sobre cómo se podría ver su remasterización</h6>
                        <h6 class="opa">02/06/2020</h6>
                    </a>
                </div>
                <div class="col clearfix">
                    <a  target="_blank" style="text-decoration:none" href="https://vandal.elespanol.com/noticia/1350734923/juegos-gratis-de-junio-en-ps-plus-xbox-gold-twitch-prime-epic-games-store-y-stadia-pro/">
                        <img class="hover2" src="img/nove/noticia_7.jpg" style="width: 96%">
                        <br><br><h6>Juegos gratis de junio en PS Plus, Xbox Gold, Twitch Prime, Epic Games Store y Stadia Pro</h6>
                        <h6 class="opa">02/06/2020</h6>
                    </a>
                </div>
                <div class="col clearfix">
                    <a  target="_blank" style="text-decoration:none" href="https://vandal.elespanol.com/noticia/1350734922/a-total-war-saga-troy-se-estrenara-gratis-en-epic-games-store-el-13-de-agosto/">
                        <img class="hover2" src="img/nove/noticia_8.jpg" style="width: 96%">
                        <br><br><h6>A Total War Saga: Troy se estrenará gratis en Epic Games Store el 13 de agosto</h6>
                        <h6 class="opa">02/06/2020</h6>
                    </a>
                </div>
                <div class="col clearfix">
                    <a  target="_blank" style="text-decoration:none" href="https://vandal.elespanol.com/noticia/1350734921/pokemon-espada-y-escudo-recibiran-su-expansion-pass-el-17-de-junio/">
                        <img class="hover2" src="img/nove/noticia_9.jpg" style="width: 96%">
                        <br><br><h6>Pokémon Espada y Escudo recibirá su primer DLC, la Isla de la Armadura, el 17 de junio</h6>
                        <h6 class="opa">02/06/2020</h6>
                    </a>
                </div>
                <div class="col clearfix">
                    <a  target="_blank" style="text-decoration:none" href="https://vandal.elespanol.com/noticia/1350734920/animal-crossing-new-horizons-encabeza-la-lista-de-mas-vendidos-en-game-durante-mayo-de-2020/">
                        <img class="hover2" src="img/nove/noticia_10.jpg" style="width: 96%">
                        <br><br><h6>Animal Crossing: New Horizons encabeza la lista de más vendidos en GAME durante mayo de 2020</h6>
                        <h6 class="opa">02/06/2020</h6>
                    </a>
                </div>
            </div>
        </div>         
        <br><br>
        
        <div class="container">
            <div class="col">
                <div class="hovereffect">
                    <img class="blo" src="img/index/historia.jpg">
                    <a href="https://www.youtube.com/watch?v=1dqReFp9PyI" target="_blank">
                    <div class="overlay">
                        <p style="font-size: 5vw; text-align: center; font-family: 'Open Sans', sans-serif; margin-top: 12vw">Los Mejores Juegos Este 2020</p>
                    </div>
                    </a>
                </div>
            </div>  
        </div>
        <br><br>
        
        <div class="d">
            <h4>Empresas Destacadas</h4><br>
            <a href="https://www.tencent.com/en-us/about.html" style="margin-right: 4.1vw" target="_blank"><img src="img/index/Tencent.jpg" style="width: 10%" class="hover"></a>
            <a href="https://www.microsoft.com/es-mx" style="margin-right: 4.1vw" target="_blank"><img src="img/index/Microsoft.png" style="width: 10%" class="hover"></a>
            <a href="https://www.sony.com.mx/" style="margin-right: 4.1vw" target="_blank"><img src="img/index/sony.jpg" style="width: 10%" class="hover"></a>
            <a href="https://www.ea.com/es-mx" style="margin-right: 4.1vw" target="_blank"><img src="img/index/EA.png" style="width: 10%" class="hover"></a>
            <a href="https://www.activisionblizzard.com/" style="margin-right: 4.1vw" target="_blank"><img src="img/index/Activision_Blizzard.png" style="width: 10%" class="hover"></a>
            <a href="https://www.apple.com/mx/" style="margin-right: 4.1vw" target="_blank"><img src="img/index/Apple.jpg" style="width: 8%" class="hover"></a>
            <a href="https://store.google.com/es/" style="margin-right: 4.1vw" target="_blank"><img src="img/index/Google.jpg" style="width: 10%" class="hover"></a>
        </div>
        
        <script src="js/JQuery.js" type="text/javascript"></script>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    </body>
</html>