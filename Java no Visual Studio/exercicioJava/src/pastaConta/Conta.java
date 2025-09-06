package pastaConta;
    
    public class Conta {
    private float saldo = 0;
    
    public void sacar(float sacar){
        if(saldo > 0){
            this.saldo -= sacar;
        }
        else;
    }

    public void depositar(float depositar){
        if(depositar > 0){
            this.saldo += depositar;
        }
        else;
    }
    public void verificar(float verificar){
        if(verificar > 0){
        this.depositar(verificar);
        }
    }
}

