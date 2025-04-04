package associacao_de_classe;

public class Main {
    public static void main(String args []) {
        Carro carro = new Carro("Relâmpago Marquinhos", 2003);
        Motor motor = new Motor("V8", 6.2);
        carro.setMotor(motor);
        // System.out.println(motor);
        System.out.println(carro.getMotor());

        Motor novoMotor = new Motor("V10", 8.4);
        carro.setMotor(novoMotor);
        System.out.println(carro.getMotor());
    }
}