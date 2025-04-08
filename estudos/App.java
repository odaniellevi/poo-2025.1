package estudos;

public class App {
    public static void main(String[] args) {
        ContaBancariaFisica cbf1 = new ContaBancariaFisica("Daniel", "123456", "001", 1000, "12345678900");

        cbf1.exibirInformacoes();

        try {
            cbf1.receberPagamento(500);
        } catch (Exception e) {
            System.out.println("Valor inválido!");
        }
        System.out.println("Saldo após recebimento de pagamento: " + cbf1.getSaldo());
    }
}
