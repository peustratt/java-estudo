package aquecimento;

public class Quadrado {
    double lado;

    Quadrado() {}
    Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcArea() {
        return this.lado * this.lado;
    }
    
    public double calcPerimetro() {
        return this.lado * 4;
    }

    public void imprimiInfo() {
        System.out.println("Lado: " + this.lado);
        System.out.println("Area: " + calcArea());
        System.out.println("Perimetro: " + calcPerimetro());
    }
}
