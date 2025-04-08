package associacao_de_classe;

public class Motor {
    private String modelo;
    private double cilindrada;

    public Motor(String modelo, double cilindrada) {
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Modelo do motor: " + getModelo() + " e Cilindrada: " + getCilindrada();
    }
}