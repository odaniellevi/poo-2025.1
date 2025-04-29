package repositorios;
import entidades.Pessoa;

public interface IPessoaRepositorio {
    void adicionarPessoa(Pessoa pessoa);
    void excluirPessoaPorCpf(String cpf);
    void pegarPessoaPorCpf(String cpf);
    void atualizarNomePorCpf(String cpf, String novoNome);
}