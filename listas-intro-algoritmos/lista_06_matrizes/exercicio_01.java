/**
 * Declare e inicialize uma matriz de inteiros 5x5 (não repetir números). Percorra a matriz e
 * obtenha a localização (linha e a coluna) do maior valor. Depois exiba na tela.
 */
package lista_06_matrizes;

import meu_local.MyLocal;

public class exercicio_01 {
    public static void main(String[] args) {
        MyLocal.setarUs();
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 50, 9, 10},
                {11, 12, 35, 14, 15},
                {16, 17, 18, 40, 20},
                {21, 22, 23, 24, 25}
        };
        int[] indexes;

        indexes = indexOfBiggestInMatrix(matriz);
        System.out.printf("O maior está na linha %d e na coluna %d", indexes[0]+1, indexes[1]+1);
    }

    public static int[] indexOfBiggestInMatrix(int[][] matriz) {
        int maior = matriz[0][0];
        int[] indexes = new int[2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    indexes[0] = i;
                    indexes[1] = j;
                    maior = matriz[i][j];
                }
            }
        }

        return indexes;

    }
}
