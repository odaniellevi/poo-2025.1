package cartao_cliente;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Daniel", "12345678900");
        Cartao cartao = new Cartao("1234456", "12/30", cliente);

        cartao.exibirDados();
        System.out.println(cliente);
    }
}
