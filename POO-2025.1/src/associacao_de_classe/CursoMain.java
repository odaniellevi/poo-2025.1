package associacao_de_classe;

public class CursoMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Daniel", "123456");
        Curso curso = new Curso("Sistemas para Internet", 60);

        aluno.setCurso(curso);

        aluno.exibirDados();
        System.out.println(curso);
    }
}
