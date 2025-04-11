package artista;

public class Pintor extends Artista {
    private String tipoTinta;
    private int qtdeQuadros;

    public Pintor(String nome, int idade, String tipoTinta, int qtdeQuadros) {
        super(nome, idade);
        this.tipoTinta = tipoTinta;
        this.qtdeQuadros = qtdeQuadros;
    }

    public String getTipoTinta() {
        return tipoTinta;
    }
    
    public void setTipoTinta(String tipoTinta) {
        this.tipoTinta = tipoTinta;
    }

    public int getQtdeQuadros() {
        return qtdeQuadros;
    }

    public void setQtdeQuadros(int qtdeQuadros) {
        this.qtdeQuadros = qtdeQuadros;
    }

    @Override
    public void realizarApresentacao() {
        System.out.println("O pintor " + getNome() + " está realizando uma apresentação com a tinta.");
    }
}