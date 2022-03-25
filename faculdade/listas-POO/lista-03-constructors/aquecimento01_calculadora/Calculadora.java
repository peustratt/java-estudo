package aquecimento01_calculadora;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println(soma(10, 15));
        System.out.println(subtracao(10, 5));
        System.out.println(multiplicacao(2, 4));
        System.out.println(divisao(10, 5));
    }

    public static double soma(double a, double b){
        return a + b;
    }
    
    public static double subtracao(double a, double b) {
        return a - b;
    }
    
    public static double multiplicacao(double a, double b) {
        return a * b;
    }
    
    public static double divisao(double a, double b) {
        return a / b;
    }
    
}
