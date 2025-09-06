import java.util.Scanner;

public class Cabrito {
    int descansado; //100       sono
    int felicidade; //100       felicidade
    int alimentado; //100       fome
    int saude;      //100       saúde
    public void atualizar(){
        boolean validarAtualizacao = true;
        while(descansado < 100 || felicidade < 100 || alimentado < 100 || saude < 100 && validarAtualizacao == true){
            System.out.println("O status do seu cabritinho é \n" +
            "Descansado: " + descansado + "\n" +
            "Felicidade: " + felicidade + "\n" +
            "Alimentado: " + alimentado + "\n" +
            "Saúde: " + saude);
            String status = "";
            System.out.println("O que você deseja fazer agora?" +
            "Colocá-lo para dormir\n" +
            "Fazer carinho \n" +
            "Alimentá-lo \n" + 
            "Dar remédio");
            switch (status){
            case "Colocá-lo para dormir":
                dormir();
                validarAtualizacao = false;
                break;
            case "Fazer carinho":
                carinho();
                validarAtualizacao = false;
                break;
            case "Alimentá-lo":
                comer();
                validarAtualizacao = false;
                break;
            case "Dar remédio":
                tomarRemedio();
                validarAtualizacao = false;
                break;
            default:
                System.out.println("Essa opção não existe :( \n" + 
                        "Tente novamente.");
                break;
            }
        }
    }
    public void dormir(){
        if(descansado < 100){
        felicidade += 20;
        alimentado -= 30;
        atualizar();
        }
        else{
        System.out.println("O seu cabritinho já está descansado!");
        atualizar();
        }
    }
    public void carinho(){
        if(felicidade < 100){
        felicidade += 40; 
        alimentado -= 20;
        saude += 35;
        atualizar();
        }
        else{
        System.out.println("O seu cabritinho está feliz!");
        atualizar();
        }
    }
    public void comer(){
        if(alimentado < 100){
        alimentado += 60; 
        alimentado -= 30;
        atualizar();
        }
        else{
        System.out.println("O seu cabritinho já está satisfeito!");
        atualizar();
        }
    }    
    public void tomarRemedio(){
        if(saude < 100){
        saude += 50; 
        atualizar();
        }
        else{
        System.out.println("O seu cabritinho está saudável!");
        atualizar();
        }
    }
}