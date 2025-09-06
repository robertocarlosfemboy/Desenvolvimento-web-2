function criarCookie(nome, valor, expira){
    var dtExpira = "expires="+expira;
    document.cookie = nome + "=" + valor + "; " + dtExpira;
    //cookie final = nomeUsuario=nome; expires= Tue, 01 Jan 2115 12:00:00 UTC 
}

function lerCookie(nome){
    var vnome = nome + "=";
    //vnome -> nomeUsuario=
    var ca = document.cookie.split(';');
    //ca -> nomeUsuario=nome
    for(var i=0; i<ca.length; i++){
        var c = ca[i];
        while(c.charAt(0)==' '){
            c = c.substring(1);
        }
        if(c.indexOf(vnome) == 0)
            return c.substring(vnome.length,c.length);
    }
    return "";
}

function verificarCookie(){
    var username=lerCookie("nomeUsuario");
    if(username != ""){
        alert("Bem vindo novamente " + username);
    }else{
        username =  prompt("Digite seu nome:");
        if (username != "" && username != null){
            criarCookie("nomeUsuario", username, " Tue, 01 Jan 2115 12:00:00 UTC ");
        }
    }
}

function maiusculas(nomeUsuario){
    return nomeUsuario.toUpperCase();
}

function minusculas(nomeUsuario){
    return nomeUsuario.toLowerCase();
}

function alternada(nomeUsuario) {
    let resultado = '';
    let usarMaiuscula = true;

    for (let i = 0; i < nomeUsuario.length; i++) {
        let char = nomeUsuario[i];
        if (/[a-zA-Z]/.test(char)) {
            resultado += usarMaiuscula ? char.toUpperCase() : char.toLowerCase();
            usarMaiuscula =! usarMaiuscula;
        } else {
            resultado += char;
        }
    }
    return resultado;
}

function 

verificarCookie();

//Receber o nome e sobrenome de uma pessoa em uma string e colocar as primeiras letras maiúsculas,
//exceto se for de, do ou da. Retornar o nome devidamente formatado.

var nome = "Insira um nome"
