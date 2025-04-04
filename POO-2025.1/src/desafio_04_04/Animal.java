package desafio_04_04;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
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

    public void setIdade(int idade) throws Exception {
        if (idade < 0) {
            throw new Exception ("Idade inválida!");
        }
        this.idade = idade;
    }

    public Animal(){}

    public void emitirSom() {}
}
