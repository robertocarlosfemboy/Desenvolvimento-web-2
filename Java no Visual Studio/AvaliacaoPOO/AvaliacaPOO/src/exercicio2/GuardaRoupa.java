package exercicio2;

public class GuardaRoupa {
    
    //Atributos
    private String cor;
    private String tecido;
    private String marca;
    private String estilo;
    private float tamanho;
    private boolean guardado = false; // Não está guardado 
    private boolean usado = false; // Não foi usado
    private boolean higienizado = false; // Não foi higienizado
    
    public GuardaRoupa(String cor, String tecido, String marca, String estilo,
    float tamanho, boolean guardado){
        this.cor = cor;
        this.tecido = tecido;
        this.marca = marca;
        this.estilo = estilo;
        this.tamanho = tamanho;
        this.guardado = guardado;
        this.usado = usado;
        this.higienizado = higienizado;
    } 

    
    
    public String getCor() {
        return cor;
    }



    public void setCor(String cor) {
        this.cor = cor;
    }



    public String getTecido() {
        return tecido;
    }



    public void setTecido(String tecido) {
        this.tecido = tecido;
    }



    public String getMarca() {
        return marca;
    }



    public void setMarca(String marca) {
        this.marca = marca;
    }



    public String getEstilo() {
        return estilo;
    }



    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }



    public float getTamanho() {
        return tamanho;
    }



    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }



    public boolean isGuardado() {
        return guardado;
    }



    public void setGuardado(boolean guardado) {
        this.guardado = guardado;
    }



    public boolean isUsado() {
        return usado;
    }



    public void setUsado(boolean usado) {
        this.usado = usado;
    }



    public boolean isHigienizado() {
        return higienizado;
    }



    public void setHigienizado(boolean higienizado) {
        this.higienizado = higienizado;
    }


    public void guardar(){
        guardado = true; // Está guardado
        System.out.format("O(a) %s está guardado(a).");
    }
    
    public void tirar(){
        guardado = false; // Não está guardado
        System.out.format("O(a) %s foi tirado(a) do guarda-roupa.");
    }
    
    public void usar(){
        usado = true; // Está sendo usado
        System.out.format("O(a) %s está sendo usado(a).");
    }

    public void despir(){
        usado = false; // Não está mais sendo usado
        System.out.format("O(a) %s foi despido(a).");
    }
    
    public void higienizar(){
        guardado = true; // Está higienizado
        System.out.format("O %s está higienizado.");
    }
    
    public void sujar(){
        guardado = true; // Não está higienizado
        System.out.format("Você sujou o(a) %s.");
    }
        
}


