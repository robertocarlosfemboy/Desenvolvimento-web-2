// Implemente uma classe chamada “Carro” com atributos para
//armazenar a marca, o modelo, se está ligado ou desligado e a
//velocidade atual do carro. Adicione métodos para acelerar, frear,
//ligar, desligar e exibir a velocidade atual.

public class Carro {
    String marca = teclado.nextLine();
    String modelo = teclado.nextLine();
    float velocidade = teclado.nextFloat();
    boolean liga = true; // ligado

    public void carro(){
        if(liga){
            liga = false; // desligado
            System.out.println("O carro está desligado.");
        }
        else{
            System.out.println("O carro está ligado!");
        }
    }
}

public class ResultadoCarro {
    public static void main(String[] args) throws Exception {
        Carro Carro1 = new Carro();
        Carro1.marca = "BMW";
        Carro1.modelo = "   ";
        Carro1.velocidade = 3;
        Carro1.liga = true;
    }
}
