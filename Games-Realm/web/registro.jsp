<%-- 
    Document   : registro
    Created on : 30/05/2020, 07:11:09 PM
    Author     : alis0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Games Realm | Crear cuenta</title>
        <link rel="icon" href="img/GRL.jpg" type="image/jpg" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <script src="js/validar.js" type="text/javascript"></script>
    </head>
    <body style="background-color: #0C0C0D">
        <div oncopy="return false" onpaste="return false" ondragstart="return false;" ondrop="return false;" class="contenedor2 container" style="background-color: #3C403F; color: #E8E8E8; font-family: 'Open Sans', sans-serif">
            <form action="guardar.jsp" name="formulario" onsubmit="return valido(this)">
                <div class="form-group">
                <h2><img src="img/GRL.jpg" height="100" width="100">Crear Cuenta</h2>
                <hr>
                </div>
                <label style="color: white"><h9>Nota: Todos los datos son obligatorios</h9></label><br>
                <label style="color: white"><h9>*Escribe tus nombres y apellidos sin acentos y con mayúsculas y minúsculas</h9></label>
                <br><br>
                <div class="form-group">
                    <div class="row">
                        <div class="col clearfix">
                            <h4>Información Personal</h4>
                            <input onkeypress="return soloLetrases(event)" oncopy="return false" onpaste="return false" class="form-control" type="text" name="txtnom" placeholder="Nombre" autocomplete="off" required="required">
                        </div>
                        <div class="col clearfix">
                            <h4>Información De Inicio De Sesión</h4>
                            <input onkeypress="return cuentas(event)" id="contra" class="form-control" type="password" name="txtcontra" placeholder="Contraseña" required="required">
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="row">
                        <div class="col clearfix">
                            <input onkeypress="return soloLetrases(event)" oncopy="return false" onpaste="return false" class="form-control" type="text" name="txtappa" placeholder="Apellido" autocomplete="off" required="required">
                        </div>
                        <div class="col clearfix">
                            <input onkeypress="return cuentas(event)" id="contra2" class="form-control" type="password" name="txtcontra2" placeholder="Confirmar contraseña" required="required">
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
                            <h6>* Campos Requeridos</h6>
                        </div>
                    </div>
                </div>
                <input style="background-color: #24A5BA; border: white; margin-top: 1.5vw; color: white" class="btn btn-block" type="submit" name="accion" value="Crear cuenta">
            </form><br>
            <hr><br>
            <h6 style="text-align: center">¿Ya tienes una cuenta?</h6>
            <a class="btn btn-primary btn-lg" href="login.jsp" style="margin-left: 19.5vw">Iniciar Sesión</a>
        </div>
        <script src="js/JQuery.js" type="text/javascript"></script>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    </body>
</html>