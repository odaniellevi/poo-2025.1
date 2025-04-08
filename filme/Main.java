package filme;

public class Main {
    public static void main(String[] args) {
        Ator ator = new Ator("Daniel", 19);
        Filme filme = new Filme("O Computador", 2025, ator);

        filme.exibirInformacoes();
        System.out.println(ator);
    }
}
