public class Moto extends Veiculo{
    private double capBagageiro;
    
    public Moto(String placa, String motor, String modelo, double capTanque, int ano, double capBagageiro) {
        super(placa, motor, modelo, capTanque, ano);
        this.capBagageiro = capBagageiro;
    }

    public double getCapBagageiro() {
        return capBagageiro;
    }

    public void setCapBagageiro(double capBagageiro) {
        this.capBagageiro = capBagageiro;
    }

    public double calcularConsumo(double km) {
        return km / 30.0;
    } 
}
