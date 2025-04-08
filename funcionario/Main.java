package funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Daniel");
        Departamento departamento = new Departamento("T.I", funcionario);

        departamento.exibirDados();
    }
}
