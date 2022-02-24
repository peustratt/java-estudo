//Declare e inicialize uma matriz mA e uma matriz mB de inteiros 4x4. Preencha uma
//terceira matriz mC com os maiores valores entre cada linha e coluna da mA e mB.

package lista_06_matrizes;

import meu_local.MyLocal;


public class exercicio_02 {
    public static void main(String[] args) {
        MyLocal.setarUs();
        int[][] mA = {
                {45, 20, 15, 18},
                {25, 25, 34, 10},
                {30, 75, 88, 90},
                {1, 5, 8, 10}
        };
        int[][] mB = {
                {5, 65, 20, 30},
                {29, 24, 35, 12},
                {20, 74, 89, 60},
                {11, 3, 7, 25}
        };
        int[][] mC = new int[4][4];

        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA[i].length; j++) {
                mC[i][j] = maiorEntreAsMatrizes(mA[i][j], mB[i][j]);
            }
        }

        for (int[] linha : mC) {
            for (int valor : linha) {
                System.out.print(valor + "  ");
            }
            System.out.println();
        }

    }

    private static int maiorEntreAsMatrizes(int valorA, int valorB) {
        int maior = valorA;
        if (valorB > valorA) {
            maior = valorB;
        }
        return maior;
    }
}

