package lista_04_estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

/** Escreva um programa que leia 10 valores e escreva na tela quantos desses valores lidos
 estão no intervalo [10,20] (incluindo os valores 10 e 20 no intervalo) e quantos deles
 estão fora deste intervalo. */

public class exercicio_04 {
    public static void main(String[] args){
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);
        Scanner in = new Scanner(System.in);

        int cont = 0;
        int num;

        for (int i=1; i <= 10; i++){
            System.out.printf("Digite o °%d numero: ", i);
            num = in.nextInt();
            if (num >= 10 && num <= 20) {
                cont += 1;
            }
        }

        System.out.printf("Quantidade de numeros dentro do invervalo é %d, quantidade de numeros fora do intervalo %d", cont, Math.abs(cont-10));
    }
}
