/** Escreva um programa que permita o usuário informar dados para dois vetores de inteiros
 de 5 posições cada um e apresente o conjunto união dos vetores em um terceiro vetor.
 Conjunto união são todos os elementos que existem em ambos os vetores. (Considere que
 não haverá números repetidos nos vetores). */
package lista_05_arrays;

import meu_local.MyLocal;
import java.util.Scanner;

public class exercicio_05 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        MyLocal.setarUs();

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int tamanhoA = vetorA.length;
        int[] veterIntersec = new int[tamanhoA];

        for (int i=0; i <tamanhoA; i++) {
            System.out.printf("Digite o °%d valor do vetor 1: ", i+1);
            vetorA[i] = in.nextInt();
            System.out.printf("Digite o °%d valor do vetor 2: ", i+2);
            vetorB[i] = in.nextInt();
        }

        for (int i=0; i < tamanhoA; i++){

            for (int item: vetorB) {
                if (vetorA[i] == item){
                    veterIntersec[i] = item;
                    break;
                }
            }
        }
        for (int item: veterIntersec) {
            System.out.printf("%d ", item);
        }
        System.out.println();

    }
}
