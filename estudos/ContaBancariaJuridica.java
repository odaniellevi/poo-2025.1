package estudos;

public class ContaBancariaJuridica extends ContaBancaria {
    private String cnpj;

    public ContaBancariaJuridica(String titular, String numConta, String agencia, double saldo, String cnpj) {
        super(titular, numConta, agencia, saldo);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void receberPagamento(double valorPago) throws Exception {
        if (valorPago <= 0) {
            throw new Exception();
        }
        setSaldo(getSaldo() + valorPago * 0.97);
    }
}
