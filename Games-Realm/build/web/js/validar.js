function soloLetrases(e) {
    key = e.keyCode || e.which;
    tecla = String.fromCharCode(key).toLowerCase();
    letras = " abcdefghijklmnopqrstuvwxyz";
    especiales = "8-37-39-46";
    
    tecla_especial = false;
    for (var i in especiales) {
      if (key == especiales[i]) {
        tecla_especial = true;
        break;
      }
    }

    if (letras.indexOf(tecla) == -1 && !tecla_especial) {
      return false;
    }
    if (e.which == 32)
            return false;
    if (e.which == 239)
            return false;
    
}

function validar_email( email ) 
{
    var regex = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    return regex.test(email) ? true : false;
}

$(document).ready(function() {
	//variables
	var pass1 = $('[name=txtcontra]');
	var pass2 = $('[name=txtcontra2]');
	var confirmacion = "Las contraseñas si coinciden";
	var longitud = "La contraseña debe estar formada entre 6-20 carácteres (ambos inclusive)";
	var negacion = "No coinciden las contraseñas";
	var vacio = "La contraseña no puede estar vacía";
	//oculto por defecto el elemento span
	var span = $('<br><span></span>').insertAfter(pass2);
	span.hide();
	//función que comprueba las dos contraseñas
	function coincidePassword(){
	var valor1 = pass1.val();
	var valor2 = pass2.val();
	//muestro el span
	span.show().removeClass();
	//condiciones dentro de la función
	if(valor1 != valor2){
	span.text(negacion).addClass('negacion');	
	}
	if(valor1.length==0 || valor1==""){
	span.text(vacio).addClass('negacion');	
	}
	if(valor1.length<6 || valor1.length>20){
	span.text(longitud).addClass('negacion');
	}
	if(valor1.length!=0 && valor1==valor2){
	span.text(confirmacion).removeClass("negacion").addClass('confirmacion');
	}
	}
	//ejecuto la función al soltar la tecla
	pass2.keyup(function(){
	coincidePassword();
	});
});

function cuentas(e) {
    key = e.keyCode || e.which;
    tecla = String.fromCharCode(key).toLowerCase();
    letras = "QWERTYUIOPASDFGHJKLZXCVBNMabcdefghijklmnopqrstuvwxyz1234567890()<>@,$!/\?¡|¿*+-_.:[]%&";
    especiales = "8-37-39-46";
    
    tecla_especial = false;
    for (var i in especiales) {
      if (key == especiales[i]) {
        tecla_especial = true;
        break;
      }
    }

    if (letras.indexOf(tecla) == -1 && !tecla_especial) {
      return false;
    }
    if (e.which == 32)
            return false;
    if (e.which == 239)
            return false;
}

function valido(formulario) {
	
        var pas1 = $("#contra").val();
        var pas2 = $("#contra2").val();
        
        if (pas1 != pas2){
            alert("No coinciden las contraseñas");
            return(false);
        }
        
	if (formulario.txtnom.value.length >20){
		alert("Escribe como máximo 20 letras en el campo de Nombre");
		formulario.txtnom.focus();
		return(false);
	}
        
        if (formulario.txtappa.value.length >20){
		alert("Escribe como máximo 20 letras en el campo de Apellido");
		formulario.txtappa.focus();
		return(false);
	}
        
        if (formulario.txtuser.value.length >20){
		alert("Tu Nombre de Usuario no puede ser mayor a 20 carácteres");
		formulario.txtuser.focus();
		return(false);
	}
        
        if (formulario.txtcontra.value.length >20){
		alert("Tu contraseña no puede ser mayor a 20 carácteres");
		formulario.txtcontra.focus();
		return(false);
	}        
}