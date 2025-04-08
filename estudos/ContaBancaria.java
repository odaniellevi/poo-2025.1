package estudos;

public class ContaBancaria {
    private String titular;
    private String numConta;
    private String agencia;
    private double saldo;

    public ContaBancaria(String titular, String numConta, String agencia, double saldo) {
        this.titular = titular;
        this.numConta = numConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: " + saldo);
    }

    public void receberPagamento(double valorPago) throws Exception {
        if(valorPago <= 0) {
            throw new Exception();
        }
        saldo += valorPago;
    }
}
