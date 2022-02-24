/* 8) O mesmo exercício anterior, mas agora não será informado o número total de
        mercadorias no estoque. Então o funcionamento deverá ser da seguinte forma: ler o valor
        da mercadoria e perguntar ‘MAIS MERCADORIAS (S/N)?’. Ao final, imprimir o total
        em estoque e a média de preço das mercadorias.*/

package lista_04_estrutura_repeticao;


import java.util.Locale;
import java.util.Scanner;


public class exercicio_08 {
    public static void main(String[] args){
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);
        Scanner in = new Scanner(System.in);


        int qtdEmEstoque = 0;
        float totalEmEstoque = 0;
        char escolha ;

        do {
            System.out.println("Insira o preço do intem: ");
            totalEmEstoque += in.nextFloat();
            qtdEmEstoque++;

            while (true){
                System.out.println("MAIS MERCADORIAS (S/N)?");
                escolha = in.next().toUpperCase().charAt(0);

                if (escolha == 'S' || escolha == 'N'){
                    break;
                } else {
                    System.out.println("OPÇÃO INVÁLIDA!\n");
                }
            }

        } while(escolha != 'N');

        System.out.println("####################");
        System.out.printf("O total em estoque é R$%.2f, e a média dos preços é R$%.2f", totalEmEstoque, totalEmEstoque/qtdEmEstoque);
    }
}


