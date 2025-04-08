package funcionario;

public class Departamento {
    private String nome;
    private Funcionario funcionario;

    public Departamento(String nome, Funcionario funcionario) {
        this.nome = nome;
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirDados() {
        System.out.println("Departamento: " + nome);
        System.out.println("Funcionário Responsável: " + funcionario);
    }
}
