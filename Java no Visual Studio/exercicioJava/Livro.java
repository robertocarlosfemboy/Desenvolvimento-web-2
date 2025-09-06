public class Livro {
    string titulo = teclado.nextLine();
    string autor = teclado.nextLine();
    int num = teclado.nextInt();
    boolean status = true; // disponível

    public void emprestar(){
        if(status){
            status = false;
            System.out.println("Este livro já foi emprestado.");
        }
        else{
            System.out.println("Este livro está disponível!");
        }
    }
}

public class ResultadoLivro {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro();
        livro1.titulo = "Cinderela";
        livro1.autor = "Maria";
        livro1.num = 3;
        livro1.status = true;
        livro1.emprestar();
    }
}
