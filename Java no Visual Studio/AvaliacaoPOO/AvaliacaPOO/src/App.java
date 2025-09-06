import exercicio1.Celular;

public class App {
    public static void main(String[] args) throws Exception {
        new Celular();{
        Celular celular = new Celular();
        celular.marca = "iphone";
        celular.modelo = "pro 16";
        celular.tamanho_da_tela = 10.6;
        celular.sistema_operacional = "iOS";
        celular.ligado = true;      
        celular.desligar();
        celular.ligar();
        celular.fazerLigacao(0);   
        } 
    }
} 









/*






*/
