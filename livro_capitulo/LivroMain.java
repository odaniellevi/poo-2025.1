package livro_capitulo;

public class LivroMain {
    public static void main(String[] args) {
        Capitulo capitulo = new Capitulo("A Correria", 3);
        Livro livro = new Livro("A Hora do Trabalho", capitulo);

        livro.exibirDados();
    }
}
