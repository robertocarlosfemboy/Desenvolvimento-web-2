package Animais;

public class Cachorro extends Animal {
    private int ossosComidos;

    //método construtor
    public Cachorro(String nome){
        super(nome);
        ossosComidos = 0;
    }
    
    @Override
    public void comer() {
        super.comer();
        ossosComidos++;
        System.out.println("O número de ossos comidos pelo %s é: %d", getNome(), ossosComidos);
    }

    public void latir(){
        System.out.println("O %s latiu.", getNome());
    }

    public void lamber(){
        System.out.println("O %s lambeu.", getNome());
    }
}