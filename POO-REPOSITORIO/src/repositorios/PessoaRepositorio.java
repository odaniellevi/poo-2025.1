package repositorios;
import entidades.Pessoa;
import java.util.ArrayList;

public class PessoaRepositorio implements IPessoaRepositorio {
    private ArrayList<Pessoa> pessoasCadastradas;

    public PessoaRepositorio() {
        this.pessoasCadastradas = new ArrayList<>();
    }

    @Override
    public void adicionarPessoa(Pessoa pessoa) {
        pessoasCadastradas.add(pessoa);
    }

    @Override
    public void pegarPessoPorCpf(String cpf) {
        for (int i=0; i < pessoasCadastradas.size(); i++) {
            if (cpf.equals == pessoasCadastradas.get(i)) {
                return pessoasCadastradas.get(i);
            }
        }
        return null;
    }

    @Override
    public void excluirPessoaPorCpf(String cpf) {
        Pessoa pessoaConsulta = pegarPessoaPorCpf(cpf);
        if (pessoaConsulta == null) {
            throw new RuntimeException("CPF não foi encontrado");
        }
        pessoasCadastradas.remove(pessoaConsulta);
    }

    @Override
    public void atualizarNomePorCpf(String cpf, String novoNome) {
        Pessoa pessoaConsulta = pegarPessoaPorCpf(cpf);
        if (pessoaConsulta == null) {
            throw new RuntimeException("CPF não encontrado");
        }
        pessoaConsulta.setNome(novoNome);
    }
}