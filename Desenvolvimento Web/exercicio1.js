/*Receber um código binário e converter em palavra. Cada letra em
binário terá um total de 5 dígitos. É permitido receber a entrada com algum
limitador entre as letras, porém terá desconto na nota.*/

function binarioTexto(binario){
    var texto;
    for(var i = 0; i < binario.length; i += 5){
        var grupo = binario.substr(i, 5);
        var codigoDecimal = parseInt(grupo, 2); 
        texto += String.fromCharCode(64 + codigoDecimal); 
    }
    texto = texto.substring(9, texto.length);
    console.log("Resultado: " + texto);
}

var entrada = "001000100100010"
binarioTexto(entrada);