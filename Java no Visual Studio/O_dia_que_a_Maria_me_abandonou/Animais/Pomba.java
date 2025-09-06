package Animais;

public class Pomba extends Ave{
    private int cartasEntregues;

    public Pomba(String nome){
        super(nome);
        cartasEntregues = 0;
    }
    
    public void entregarCarta(){
        voar();
        cartasEntregues++;
        System.out.println("O total de cartas entregues por %s é", getNome());
    }
}