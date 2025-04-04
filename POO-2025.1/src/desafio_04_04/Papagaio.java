package desafio_04_04;

public class Papagaio extends Animal {
    private String corPenas;
    private boolean podeFalar;
    private String origem;
    private double alturaVooMaxima;

    public Papagaio(String corPenas, boolean podeFalar, String origem, double alturaVooMaxima, String nome, int idade) {
        super(nome, idade);
        this.corPenas = corPenas;
        this.podeFalar = podeFalar;
        this.origem = origem;
        this.alturaVooMaxima = alturaVooMaxima;
    }

    public Papagaio() {}

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    public boolean isPodeFalar() {
        return podeFalar;
    }

    public void setPodeFalar(boolean podeFalar) {
        this.podeFalar = podeFalar;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public double getAlturaVooMaxima() {
        return alturaVooMaxima;
    }

    public void setAlturaVooMaxima(double alturaVooMaxima) {
        this.alturaVooMaxima = alturaVooMaxima;
    }
    
    @Override
    public void emitirSom() {
        if (isPodeFalar()) {
            System.out.println("Olá, Iago!");;
        } else {
            System.out.println("Piu!");
        }
    }
}
