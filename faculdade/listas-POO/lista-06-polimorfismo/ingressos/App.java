package ingressos;

public class App {
    public static void main(String[] args) {
        Ingresso ingresso = new CamaroteSuperior(500f, 200f, "20H");
        comprar(ingresso);
 
    }

    public static void comprar(Ingresso ingresso) {
        if (ingresso instanceof Simples) {
            System.out.println("Voce comprou um ingresso simples");
        } else if (ingresso instanceof CamaroteSuperior) {
            System.out.println("Voce comprou um ingresso VIP Camarote Superior");
        } else {
            System.out.println("Voce comprou um ingresso VIP Camarote Inferior");
        }

    }
}
