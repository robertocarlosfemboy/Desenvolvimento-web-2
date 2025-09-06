package Animais;

public class Dragão extends Ave {
    public Dragão(String nome){
        super(nome);
    }
    
    public void jogarFogo(){
        System.out.println("O %s jogou fogo", getNome());
    }
}