/** Uma loja está levantando o preço total de todas as mercadorias em estoque. Escreva um
 programa que pergunte ao usuário o número total no estoque. Para cada mercadoria no
 estoque, o programa deve perguntar o preço ao usuário. Ao final imprimir o total em
 estoque e a média de preço das mercadorias.*/

package lista_04_estrutura_repeticao;


import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args){
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);
        Scanner in = new Scanner(System.in);

        System.out.printf("Informe a quantidade de intems no estoque: ");
        int qtdEmEstoque = in.nextInt();
        float totalEmEstoque = 0;

        for (int i=0; i < qtdEmEstoque; i++){
            System.out.println("Insira o preço do intem: ");
            totalEmEstoque += in.nextFloat();
        }

        System.out.printf("O total em estoque é R$%.2f, e a média dos preços é R$%.2f", totalEmEstoque, totalEmEstoque/qtdEmEstoque);
    }
}
