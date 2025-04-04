package associacao_de_classe;

public class Pessoa {
    private String nome;
    private int idade;
    private ContaBancaria conta;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void abrirConta(String numConta) {
        conta = new ContaBancaria(numConta);
    }
}
