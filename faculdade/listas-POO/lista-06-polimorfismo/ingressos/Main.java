package ingressos;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        char escolha;
        Ingresso ingresso = new Simples(200f);

        do {
            System.out.println("Menu:\n- 1 ingresso simples\n- 2 ingresso VIP");
            escolha = in.nextLine().charAt(0);
            switch (escolha) {
                case '1':
                    ingresso = new Simples(200f);
                    break;

                case '2':
                    System.out.println("Digite \n1 - Camarote superior\n2 - Camarote Inferior");
                    char escolhaVip = in.nextLine().charAt(0);
                    if (escolhaVip == '1') {
                        ingresso = new CamaroteSuperior(500f, 200f, "20H");
                    } else {
                        ingresso = new CamaroteInferior(400f, 100f, "5H");
                    }
                    break;

                default:
                    System.out.println("Digite uma opção válida!");

            }
        } while(escolha != '1' && escolha != '2');

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
        ingresso.imprimeValor();

    }
}
