package professor;

public class Escola {
    private String nome;
    private Professor professor;

    public Escola(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirDados() {
        System.out.println("Nome da Escola: " + nome + ", Professor responsável: " + professor);
    }
}
