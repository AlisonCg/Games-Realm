function filterFloat(evt,input){
    // Backspace = 8, Enter = 13, ‘0′ = 48, ‘9′ = 57, ‘.’ = 46, ‘-’ = 43
    var key = window.Event ? evt.which : evt.keyCode;    
    var chark = String.fromCharCode(key);
    var tempValue = input.value+chark;
    if(key >= 48 && key <= 57){
        if(filter(tempValue)=== false){
            return false;
        }else{       
            return true;
        }
    }else{
          if(key == 8 || key == 13 || key == 0) {     
              return true;              
          }else if(key == 46){
                if(filter(tempValue)=== false){
                    return false;
                }else{       
                    return true;
                }
          }else{
              return false;
          }
    }
}
function filter(__val__){
    var preg = /^([0-9]+\.?[0-9]{0,2})$/; 
    if(preg.test(__val__) === true){
        return true;
    }else{
       return false;
    }
    
}

function cuentas(e) {
    key = e.keyCode || e.which;
    tecla = String.fromCharCode(key).toLowerCase();
    letras = "QWERTYUIOPASDFGHJKLZXCVBNMabcdefghijklmnopqrstuvwxyz1234567890, !?¡¿+-.:&";
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
    if (e.which == 239)
            return false;
}

function validar(e) {
    tecla = (document.all) ? e.keyCode : e.which;
    if (tecla==8) return true; //Tecla de retroceso
    if (tecla==48) return true;
    if (tecla==49) return true;
    if (tecla==50) return true;
    if (tecla==51) return true;
    if (tecla==52) return true;
    if (tecla==53) return true;
    if (tecla==54) return true;
    if (tecla==55) return true;
    if (tecla==56) return true;
    if (tecla==57) return true;
    patron = /1/;
    te = String.fromCharCode(tecla);
    return patron.test(te);
}

function soloLetras(e) {
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
    if (e.which == 239)
            return false;
}

function valido(formulario) {
	
	if (formulario.txtnom.value.length >70){
		alert("Escribe como máximo 70 letras en el campo de Nombre");
		formulario.txtnom.focus();
		return(false);
	}
        
        if (formulario.txtP.value.length >20){
		alert("Escribe como máximo una cantidad de 8 dígitos");
		formulario.txtP.focus();
		return(false);
	}
        
        if (formulario.txtD.value.length >1000){
		alert("Escribe como máximo 1000 carácteres en el campo de Descripción");
		formulario.txtD.focus();
		return(false);
	}
        
        
        if (formulario.txtE.value.length >45){
		alert("Escribe como máximo 45 letras en el campo de Edición");
		formulario.txtE.focus();
		return(false);
	}
        
        if (formulario.txtI.value.length >200){
		alert("Escribe como máximo 200 carácteres en el campo de URL de Imagen");
		formulario.txtI.focus();
		return(false);
	} 
        
        if (formulario.txtA.value.length >4){
		alert("Ingresa un año válido");
		formulario.txtA.focus();
		return(false);
	}
        
        if (formulario.txtA.value.length <4){
		alert("Ingresa un año válido");
		formulario.txtA.focus();
		return(false);
	}
}