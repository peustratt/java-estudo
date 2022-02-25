package arrays;

import java.util.Locale;
import java.util.Scanner;

public class arrays_04 {
    static Scanner in = new Scanner(System.in); 
    public static void main(String[] args){
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);

        int[] numeros = new int[15];

        for (int i=0; i < numeros.length; i++){
            System.out.printf("Digite o °%d numero: ", i+1);
            numeros[i] = in.nextInt();
        }

        int maior = 0;
        for (int numero : numeros){
            if (numero > maior){
                maior = numero;
            }
        }

        for (int i=0; i < numeros.length; i++){
            if (numeros[i] == maior){
                System.out.printf("O maior número é %d, e o seu index é %d.", maior, i);
            }
        }
    }
}
