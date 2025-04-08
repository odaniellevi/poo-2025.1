package estudos;

public class ContaBancariaFisica extends ContaBancaria {
    private String cpf;

    public ContaBancariaFisica(String titular, String numConta, String agencia, double saldo, String cpf) {
        super(titular, numConta, agencia, saldo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
