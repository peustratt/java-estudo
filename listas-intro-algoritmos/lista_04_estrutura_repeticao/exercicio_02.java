package lista_04_estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

/** Escreva um programa que receba um número qualquer do usuário e calcule o fatorial deste número.*/

public class exercicio_02 {
    public static void main(String[] args){
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int num = in.nextInt();
        int fatorial = num;

        /**
        for (int i=num; i > 2; i--) {
            fatorial *= (i - 1);
        }
         */

        for (int i=2; i < num; i++){
            fatorial *= i;
        }


        System.out.printf("O fatorial de %d é %d", num, fatorial);

    }
}
