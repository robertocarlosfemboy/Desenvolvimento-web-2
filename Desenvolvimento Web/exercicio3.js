/*Fazer um programa que receba uma string e grave minhas preferências
de como visualizar o que escrevi. Posso optar por todas as letras
MAIÚSCULAS, todas letras minúsculas ou as letras AlTeRnAdAs. Também
quero que fique armazenado se vou ver a palavra normal ou lamron (ao
contrário). Cada vez que eu executar o código quero entrar com uma string
nova, onde só minhas preferências serão lembradas.*/

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

function alternada(nomeUsuario){
    var resultado = '';
    var usarMaiuscula = true;
    for (var i = 0; i < nomeUsuario.length; i++) {
        var char = nomeUsuario[i];
        if (/[a-zA-Z]/.test(char)){
            resultado += usarMaiuscula ? char.toUpperCase() : char.toLowerCase();
            usarMaiuscula =! usarMaiuscula;
        } else {
            resultado += char;
        }
    }
    return resultado;
}

function normal(nomeUsuario){
    return nomeUsuario;
}

function aoContrario(nomeUsuario){
    return nomeUsuario.split('').reverse().join('');
}

function menu() {
    var palavra = prompt("Insira a palavra: ")
    var opcao = prompt(palavra + "\n" +
        "Menu: escolha uma opção: \n" +
        "1. MAIÚSCULAS\n" +
        "2. minúsculas\n" +
        "3. AlTeRnAdAs\n");
    switch(opcao){
        case "1":
            palavra = maiusculas(palavra);    
            var sentido = prompt(palavra + "\n" +
                "Menu: escolha o sentido da palavra: \n" +
                "1. normal\n" +
                "2. Ao contrário\n");
                switch(sentido){
                    case "1":
                        palavra = normal(palavra);
                    case "2":
                        palavra = aoContrario(palavra);
                }
                var palavra = alert(palavra);
        case "2":
            palavra = minusculas(palavra);    
            var sentido = prompt(palavra + "\n" +
                "Menu: escolha o sentido da palavra: \n" +
                "1. normal\n" +
                "2. Ao contrário\n");
                switch(sentido){
                    case "1":
                        palavra = normal(palavra);
                    case "2":
                        palavra = aoContrario(palavra);
                }     
                var palavra = alert(palavra);
        case "3":
            palavra = alternada(palavra);    
            var sentido = prompt(palavra + "\n" + 
                "Menu: escolha o sentido da palavra: \n" +
                "1. normal\n" +
                "2. Ao contrário\n");
                switch(sentido){
                    case "1":
                        palavra = normal(palavra);
                    case "2":
                        palavra = aoContrario(palavra);
                }
                var palavra = alert(palavra);
    }
}

menu();



