public class Quadrado implements FormaGeometrica {
    private double lado;
    public Quadrado (double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    public double calcularDiagonal() {
        return lado * Math.sqrt(2);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}