/** Faça um programa para ler 10 números e armazenar em um vetor. Após isto, o programa
 deve ordenar os números no vetor em ordem crescente. Escreva na tela o vetor ordenado. */

package lista_05_arrays;

import meu_local.MyLocal;
import java.util.Scanner;

public class exercicio_06 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        MyLocal.setarUs();

        int[] vetor = {20, 50, 13, 52, 456, 123, 54, 13, 29, 8, 55, 45, 62, 1, 3};
        int[] vetorRev = new int[vetor.length];
        int min=vetor[0], mid=0;

        // Achando o menor valor
        for (int n: vetor) {
            if (n < min) {
                min = n;
            }
        }
        vetorRev[0] = min;

        //Achando qualquer valor diferente do menor
        for (int n: vetor) {
            if (n > min) {
                mid = n;
                break;
            }
        }

        // Loop sobre o vetorRev
        for (int i=1; i < vetor.length; i++) {
            for (int n: vetor) {
                if (n > min && n < mid) {
                    mid = n;
                }
            }
            vetorRev[i] = mid;
            min = mid;

            //Achando qualquer valor diferente do menor
            for (int n: vetor) {
                if (n > min) {
                    mid = n;
                    break;
                }
            }

        }

        for (int n: vetorRev) {
            System.out.print(n + " ");
        }

    }
}
