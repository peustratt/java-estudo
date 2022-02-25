package lista_04_estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;


public class exercicio_01 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Locale us = new Locale("en","us");
        Locale.setDefault(us);
        System.out.println("Digite a quantidade de entradas: ");
        int entradas = in.nextInt();

        int[] range = new int[entradas];
        int tamanho = range.length;
        int soma = 0;



        for (int i=0; i < range.length; i++){
            System.out.printf("Digite o °%d valor: ",i+1);
            soma += in.nextFloat();
        }



        System.out.printf("A média aritimética dos %d valores é: %.2f", tamanho,soma/ (float) tamanho);

    }
}
