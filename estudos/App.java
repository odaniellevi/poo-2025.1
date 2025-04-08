package estudos;

public class App {
    public static void main(String[] args) {
        ContaBancariaFisica cbf1 = new ContaBancariaFisica("Daniel", "123456", "001", 1000, "12345678900");
        ContaBancariaJuridica cbj1 = new ContaBancariaJuridica("Marina", "346432", "123", 5000, "345673557588787");
        cbj1.exibirInformacoes();

        try {
            cbj1.receberPagamento(1700);
        } catch(Exception e) {
            System.out.println("Valor inválido!");
        }
        System.out.println("Saldo após pagamento: " + cbj1.getSaldo());
    }
}
