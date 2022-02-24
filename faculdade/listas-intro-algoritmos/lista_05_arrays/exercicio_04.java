/** Faça um programa para “remover” um número de um vetor. Inicialize um vetor com 6
 números inteiros quaisquer e depois peça para o usuário digitar um número a ser removido
 do vetor. O programa deve verificar se esse número digitado existe no vetor ou não. Se
 existir, deve gerar um novo vetor com tamanho reduzido e sem esse número. (Considere
 que não haverá números repetidos no vetor). */

package lista_05_arrays;

import meu_local.MyLocal;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        MyLocal.setarUs();
        Scanner in = new Scanner(System.in);

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int numDelete, numDeleteIndex = 0;
        boolean pertence = false;

        System.out.print("Vetor original: " );
        for (int numero: vetorA) {
            System.out.print(numero + " ");
        }
        System.out.println();

        System.out.println("Digite o numero a ser removido: ");
        numDelete = in.nextInt();

        for (int i=0; i<vetorA.length; i++) {
            if (numDelete == vetorA[i]) {
                pertence = true;
                numDeleteIndex = i;
                break;
            }
        }

        System.out.println();

        if (pertence) {
            int[] vetorB = new int[vetorA.length - 1];
            for (int i=0, j=0; i < vetorA.length; i++) {
                if (i == numDeleteIndex) {
                    continue;
                }
                else {
                    vetorB[j] = vetorA[i];
                    j++;
                }
            }

            System.out.print("Novo vetor: ");
            for (int numero: vetorB) {
                System.out.print(numero + " ");
            }
            System.out.println();

        }
        else {
            System.out.println("Numero digitado não pertence ao vetor original!");
        }

    }
}
