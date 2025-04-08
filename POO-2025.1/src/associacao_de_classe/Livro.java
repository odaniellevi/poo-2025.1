package associacao_de_classe;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    private Autor autor;

    public Livro(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirInfo() {
        System.out.println("Título do livro: " + getTitulo());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
    }
}
