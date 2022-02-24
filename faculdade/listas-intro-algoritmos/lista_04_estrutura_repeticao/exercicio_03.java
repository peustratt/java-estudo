package lista_04_estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

/** Escreva um programa que receba diversos números inteiros e positivos do usuário e que
 seja interrompido ao ser informado o número zero. Com os números recebidos,
 determine o maior e o menor valor deste conjunto de números. */

public class exercicio_03 {
    public static void main(String[] args){
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);
        Scanner in = new Scanner(System.in);

        int max = 0;
        int num, min;

        System.out.println("Digite o valor: ");
        num = in.nextInt();
        min = num;

        while (true) {

            if (num > max){
                max = num;
            }
            else if (num < min && num != 0){
                min = num;
            }

            if (num == 0){
                break;
            }

            System.out.println("Digite o valor: ");
            num = in.nextInt();
        }

        System.out.printf("O maior valor é %d, e o menor valor é %d", max, min);
    }
}
