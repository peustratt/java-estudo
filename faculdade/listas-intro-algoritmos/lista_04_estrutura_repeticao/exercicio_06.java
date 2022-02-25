/**Escreva um programa que exiba um menu como mostrado abaixo e solicite do usuário
 uma opção de refeição que ao final será cobrado um valor do prato solicitado. O
 programa encerra quando o usuário informar a opção "S" do menu que se refere a sair.
 Obs.: use switch-case e do-while.
 Opção do Menu Produto Valor do Produto
 A Açaí na Tigela R$ 15,75
 B Bolo de Chocolate R$ 23,10
 C CupCake de Nutela R$ 8,50
 D Doce de Banana R$ 7,85
 E Enroladinho de Frango R$ 5,00
 S Sair */

package lista_04_estrutura_repeticao;


import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);

        char opcao;
        float total = 0;
        float precoAcai = 15.75f, precoBolo = 23.1f, precoCup = 8.5f, precoDoce = 7.85f, precoEnrol = 5f;
        String MENU = """
                 Opção do Menu Produto Valor do Produto
                 A Açaí na Tigela R$ 15,75
                 B Bolo de Chocolate R$ 23,10
                 C CupCake de Nutela R$ 8,50
                 D Doce de Banana R$ 7,85
                 E Enroladinho de Frango R$ 5,00
                 S Sair
                :\s""";

        do {
            System.out.println(MENU);
            opcao = in.nextLine().toUpperCase().charAt(0);

            switch (opcao) {
                case 'A' -> {
                    total += precoAcai;
                    System.out.printf("Adicionado Açai R$%.2f\n", precoAcai);
                }
                case 'B' -> {
                    total += precoBolo;
                    System.out.printf("Adicionado Bolo de Chocolate R$%.2f\n", precoBolo);
                }
                case 'C' -> {
                    total += precoCup;
                    System.out.printf("Adicionado CupCake de Nutela R$%.2f\n", precoCup);
                }
                case 'D' -> {
                    total += precoDoce;
                    System.out.printf("Adicionado Doce de Banana R$%.2f\n", precoDoce);
                }
                case 'E' -> {
                    total += precoEnrol;
                    System.out.printf("Adicionado Açai R$%.2f\n", precoEnrol);
                }
                case 'S' -> System.out.println("Finalizando a conta.\n############");

                default -> System.out.println("OPÇÃO INVÁLIDA!");
            }
        } while (opcao != 'S');

        System.out.printf("O total a se pagar é R$%.2f", total);
    }
}
