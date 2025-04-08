package cartao_cliente;

public class Cartao {
    private String numero;
    private String validade;
    private Cliente cliente;

    public Cartao(String numero, String validade, Cliente cliente) {
        this.numero = numero;
        this.validade = validade;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void exibirDados() {
        System.out.println("Número do cartão: " + numero);
        System.out.println("Data de Validade: " + validade);
    }
}
