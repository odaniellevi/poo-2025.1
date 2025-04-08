package associacao_de_classe;

public class LivroMain {
    public static void main(String[] args) {
        Livro livro = new Livro("A Cabeça Cabeçuda", 2025);
        Autor autor = new Autor("Barão de Vera Cruz", "Brasileiro");

        livro.setAutor(autor);
        livro.exibirInfo();
        System.out.println(autor);
    }
}
