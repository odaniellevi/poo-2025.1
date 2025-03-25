public class Veiculo {
    private String placa;
    private String motor;
    private String modelo;
    private double capTanque;
    private int ano;

    public Veiculo(String placa, String motor, String modelo, double capTanque, int ano) {
        this.placa = placa;
        this.motor = motor;
        this.modelo = modelo;
        this.capTanque = capTanque;
        this.ano = ano;
    }

    public Veiculo(){}

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double calcularConsumo(double km) {
        return 0;
    }
}
