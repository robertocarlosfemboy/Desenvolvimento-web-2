package exercicio2;

public class Calcado extends GuardaRoupa{
    private String cadarco;
    private int sola;
    private int palmilha;
    
    public Calcado(String cor, String tecido, String marca, String estilo, float tamanho, boolean guardado,
            String cadarco, int sola, int palmilha) {
        super(cor, tecido, marca, estilo, tamanho, guardado);
        this.cadarco = cadarco;
        this.sola = sola;
        this.palmilha = palmilha;
    }

    public String getCadarco() {
        return cadarco;
    }
    public void setCadarco(String cadarco) {
        this.cadarco = cadarco;
    }

    public int getSola() {
        return sola;
    }
    public void setSola(int sola) {
        this.sola = sola;
    }

    public int getPalmilha() {
        return palmilha;
    }
    public void setPalmilha(int palmilha) {
        this.palmilha = palmilha;
    }

    public void calcar(){
        System.out.println("Você calçou o calçado.");
    }
}
