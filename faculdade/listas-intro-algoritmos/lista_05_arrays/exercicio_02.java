/** Declare e inicialize um vetor A com 10 números inteiros, declare também um vetor B do
 mesmo tamanho, sendo que cada elemento do vetor B será o elemento do vetor A * 2. Isto
 é: B[i] = A[i] * 2; */

package lista_05_arrays;

import meu_local.MyLocal;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        MyLocal.setarUs();
        Scanner in = new Scanner(System.in);

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, vetorB = new int[10];

        for (int i=0; i<vetorA.length; i++) {
            vetorB[i] = vetorA[i] * 2;
        }

        for (int item: vetorA) {
            System.out.printf("%d ", item);
        }
        System.out.println();

        for (int item: vetorB) {
            System.out.printf("%d ", item);
        }
        System.out.println();


    }
}
