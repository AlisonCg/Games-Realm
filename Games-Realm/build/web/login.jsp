<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Games Realm | Iniciar sesión</title>
        <link rel="icon" href="img/GRL.jpg" type="image/jpg" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </head>
    <body style="background-color: #0C0C0D">          
        <div oncopy="return false" onpaste="return false" ondragstart="return false;" ondrop="return false;" class="contenedor container col-lg-3" style="background-color: #3C403F; color: #E8E8E8; font-family: 'Open Sans', sans-serif">
            <form method="post" action="Controlador">
                <div class="form-group text-center">
                    <img src="img/GRL.jpg" height="100" width="100"> 
                <hr>
                <p><h2>Inicio de sesión</h2>
                <hr>
                </div>
                <div class="form-group">
                    <input oncopy="return false" onpaste="return false" class="form-control" type="text" name="txtuser" placeholder="Email" autocomplete="off">
                </div>
                <div class="form-group">
                    <input oncopy="return false" onpaste="return false" class="form-control" type="password" name="txtcontra" placeholder="Contraseña" show="*">
                </div>
                <input style="background-color: #24A5BA; border: white; margin-top: 1.5vw; color: #E8E8E8" class="btn btn-block" type="submit" name="accion" value="Ingresar">
            </form>
            <hr>
            <h6 style="text-align: center">¿Aún no tienes cuenta?</h6>
            <a class="btn btn-primary btn-lg" href="registro.jsp">Crear cuenta</a>
            <br><h6><a href="index.jsp">Regresar</a></h6>
        </div>        
        <script src="js/JQuery.js" type="text/javascript"></script>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    </body>
</html>