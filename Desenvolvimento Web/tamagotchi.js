var tamagotchi = {
    Alimentado: 30, //50
    Energia: 40,    //50
    Felicidade: 20  //50
}
var especieAnimal = "";
var nomeAnimal = "";

function especie() {
    nomeAnimal = prompt("Insira o nome do seu animalzinho: ") 
        var validar = true;
    while(validar == true) {
        var especieAnimal = prompt("O nome do seu animalzinho é " + nomeAnimal + ". Agora escolha a espécie dele: \n" +
            "Cachorrinho\n" +
            "Gatinho\n" +
            "Coelhinho\n");
        switch(especieAnimal){
        case "Cachorrinho":
            alert("O " + nomeAnimal + " é um " + especieAnimal + ".");
            validar = false;
            break;
        case "Gatinho":
            alert("O " + nomeAnimal + " é um " + especieAnimal + ".");
            validar = false 
            break;
        case "Coelhinho":
            alert("O " + nomeAnimal + " é um " + especieAnimal + ".");
            validar = false;
            break;
        default:
            alert("Esse animalzinho não existe :( \n" + 
                "Tente novamente.");
            break;
        }
    }
}

function atualizar(){
    var validarAtualizacao = true;
    while(tamagotchi.Alimentado < 50 || tamagotchi.Energia < 50 || tamagotchi.Felicidade < 50 && validarAtualizacao == true){
        alert("O status do seu animalzinho é: \n" + 
            "Barriguinha: " + tamagotchi.Alimentado + "\n" +
            "Energizinha: " + tamagotchi.Energia + "\n" + 
            "Felizinho: " + tamagotchi.Felicidade);
        var status = prompt("O que você deseja fazer agora? \n" + 
            "Alimentá-lo\n" +
            "Colocá-lo para dormir\n" +
            "Fazer carinho\n");
        switch(status){
        case "Alimentá-lo":
            comer();
            validarAtualizacao = false;
            break;
        case "Colocá-lo para dormir":
            dormir();
            validarAtualizacao = false 
            break;
        case "Fazer carinho":
            carinho();
            validarAtualizacao = false;
            break;
        default:
            alert("Essa opção não existe :( \n" + 
                "Tente novamente.");
            break;
        }
    }
}

function comer(){
    if (tamagotchi.Alimentado < 50){
        alert("O seu animalzinho está satisfeito!");
        tamagotchi.Alimentado = 50
        tamagotchi.Felicidade += 10
        tamagotchi.Energia -= 10
        atualizar();
    }
    else{
        alert("O seu animalzinho já está satisfeito!")
        atualizar();
    }
}

function dormir(){
    if (tamagotchi.Energia < 50){
        alert("O seu animalzinho renovou as energias!");
        tamagotchi.Energia = 50
        tamagotchi.Alimentado -= 30
        tamagotchi.Felicidade -= 20
        atualizar();
    }
    else{
        alert("O seu animalzinho já está descansado!")
        atualizar();
    }
}

function carinho(){
    if (tamagotchi.Felicidade < 50){
        alert("O seu animalzinho te ama!");
        tamagotchi.Felicidade += 20;
        atualizar();
    }
    else{
        alert("O " + nomeAnimal + " morreu! \n" +
        "Mas morreu feliz :) \n" + 
        "Recomece com outro animalzinho!");
        especie();
        atualizar();
    }
}

especie();
atualizar();


