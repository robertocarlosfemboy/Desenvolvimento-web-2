package Animais;

public class Animal {
    private String nome;


    public Animal(String nome) {
        this.nome = nome;
    }

    public void comer(){
        System.out.format("O %s comeu.", nome);
    }

    public void beber(){
        System.out.println("O %s bebeu.", nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}