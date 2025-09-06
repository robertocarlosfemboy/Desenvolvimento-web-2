package exercicio2;

public class Camiseta extends GuardaRoupa {
    private String gola;
    private String manga;
    private String toca;
    
    public Camiseta(String cor, String tecido, String marca, String estilo, float tamanho, boolean guardado,
            String gola, String manga, String toca) {
        super(cor, tecido, marca, estilo, tamanho, guardado);
        this.gola = gola;
        this.manga = manga;
        this.toca = toca;
    }

    public String getGola() {
        return gola;
    }
    public void setGola(String gola) {
        this.gola = gola;
    }

    public String getManga() {
        return manga;
    }
    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getToca() {
        return toca;
    }
    public void setToca(String toca) {
        this.toca = toca;
    }
    
    public void vestir(){
        System.out.println("Você vestiu a camiseta.");
    }
    
}

