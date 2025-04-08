package livro_capitulo;

public class Livro {
    private String titulo;
    private Capitulo capitulo;

    public Livro(String titulo, Capitulo capitulo) {
        this.titulo = titulo;
        this.capitulo = capitulo;
    }

    public Capitulo getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(Capitulo capitulo) {
        this.capitulo = capitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Capítulo: " + capitulo);
    }
}
