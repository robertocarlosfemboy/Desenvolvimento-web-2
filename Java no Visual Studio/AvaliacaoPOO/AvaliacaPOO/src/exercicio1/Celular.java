package exercicio1;

public class Celular {    
// atributos
    private String marca;
    private String modelo;
    private float tamanho_da_tela;
    private String sistema_operacional;
    private boolean ligado = false; // o celular está desligado      /false = desligado      /true = ligado

// método construtor
    public Celular(String marca, String modelo, float tamanho_da_tela, String sistema_operacional, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanho_da_tela = tamanho_da_tela;
        this.sistema_operacional = sistema_operacional;
        this.ligado = ligado;
    }

// get e set marca
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

// get e set modelo
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

// get e set tamanho da tela
    public float getTamanho_da_tela() {
        return tamanho_da_tela;
    }
    public void setTamanho_da_tela(float tamanho_da_tela) {
        this.tamanho_da_tela = tamanho_da_tela;
    }

// get e set sistema operacional
    public String getSistema_operacional() {
        return sistema_operacional;
    }
    public void setSistema_operacional(String sistema_operacional) {
        this.sistema_operacional = sistema_operacional;
    }

// get set ligado
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
// métodos
    public void ligar(){
        ligado = true; // ligado
        System.out.format("O %s está ligado.", modelo);
    }

    public void desligar(){
        ligado = false; // desligado
        System.out.format("O %s está desligado.", modelo);
    }

    public void fazerLigacao(int numero_discado){
        if (ligado == true){} 
        else {
            System.out.format("O %s está desligado. Ligue-o.", modelo);
        }
        if (1000000000 > numero_discado || numero_discado > 99999999){
            System.out.println("A ligação foi realizada.");
        } 
        else {
            System.out.format("O número discado está errado. Digite novamente.");
        }
    }
} 

