/*No algoritmo acima desenvolva uma função que receba em string e
converta novamente em binário*/

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

var entrada = "001000100100001"
binarioTexto(entrada);