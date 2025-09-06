package biblioteca;

public class Biblioteca_Virtual {
    private String autor;
    private String nome;
    private String assunto; 
    private boolean emprestado;

    public Biblioteca_Virtual(String autor, String nome, String assunto) {
        this.autor = autor;
        this.nome = nome;
        this.assunto = assunto;
        this.emprestado = false; //não está emprestado
    }

    public String getAutor() {
        return autor;
    }

    public String getNome() {
        return nome;
    }

    public String getAssunto() {
        return assunto;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void emprestar(){
        if (emprestado == false) { //não está emprestado
            System.out.format("O %s não está emprestado.", nome);
            emprestado = true;
        }
        else {
            System.out.format("O %s está emprestado.", nome);
        }

    }

    public void devolver(){
        if (emprestado == true) { // está emprestado
            System.out.format("O %s está devolvido.", nome);
            emprestado = false;
        }
        else {
            System.out.format("O %s pode ser emprestado.", nome);
        }
    
    }

    public void verificarDisponibilidade(){
        if (verificaDisponibilidade == false) {

        }
        boolean verificarDisponibilidade == ;
        System.out.format("O %s não está disponível.", nome);
    }

   

}





/*
 * biblioteca 
 *      atributos: autor, 
 *      metodos: emprestar, devolver e verificar disponibilidade
 *      subclasses
 *          livro
 *              atributos: páginas, 
 *              metodos: virar paginas
 *          audiobook
 *              atributos: duração, 
 *              metodos: dar play, 
 * 
 * 
 */