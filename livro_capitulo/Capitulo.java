package livro_capitulo;

public class Capitulo {
    private String titulo;
    private int numero;

    public Capitulo(String titulo, int numero) {
        this.titulo = titulo;
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return titulo + ", Número: " + numero;
    }
}
