package associacao_de_classe;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("HB20", 2012);
        Motor motor = new Motor("V8", 6.2);
        carro.setMotor(motor);
        System.out.println(motor);

        Carro carro2 = new Carro("BMW X1", 2024);
        Motor motor2 = new Motor("V10", 8);
        // System.out.println(carro2.getModelo());
        // System.out.println(motor2.getModelo());
    }
}