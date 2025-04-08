package professor;

public class ProfessorMain {
    public static void main(String[] args) {

        Professor professor = new Professor("Camilla", "POO");
        Escola escola = new Escola("Casinha do Brincar", professor);

        escola.exibirDados();
    }
}
