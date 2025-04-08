package filme;

public class Filme {
    private String titulo;
    private int anoLancamento;
    private Ator ator;

    public Filme(String titulo, int anoLancamento, Ator ator) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.ator = ator;
    }

    public Filme(){}

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }
}
