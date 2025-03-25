import java.util.Scanner;

public class App {
    public static void main(String args []) {

        Scanner teclado = new Scanner(System.in);

        Carro carro1 = new Carro("ABC1", "V12.0", "HB20", 50.4, 2012, 4, "solar");
        System.out.println("Por favor, digite quantos km você percorreu" );
        double km = teclado.nextDouble();
        double consumo = carro1.calcularConsumo(km);
        System.out.println("Você consumiu " + consumo + " litros de combustível.");

        Moto moto1 = new Moto("CBH2", "V8.0", "XJ6", 20.0, 2021, 10.0);
        System.out.println("Por favor, digite quantos km você percorreu" );
        double kmMoto = teclado.nextDouble();
        double consumoMoto = moto1.calcularConsumo(kmMoto);
        System.out.println("Você consumiu " + consumoMoto + " litros de combustível.");

        teclado.close();
    }
}