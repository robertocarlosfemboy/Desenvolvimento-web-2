public class Heroi{
    
    private float vida = 50;
    private float ataque = 30;
    private float defesa = 15;

public float getVida(){
    return vida;
}

public void setVida(float vida){
    this.vida = vida;
}

public float getAtaque(){
    return ataque;
}

public void setAtaque(float ataque){
    this.ataque = ataque;
}

public float getDefesa(){
    return defesa;
}

public void setDefesa(float defesa){
    this.defesa = defesa;
}

    public void luta(){
        heroi.vida = vida - ataque;
        heroi.defesa = ataque - defesa;



    }

}
