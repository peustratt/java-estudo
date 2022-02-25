package matriz;

import meu_local.MyLocal;
import java.util.Scanner;

public class exercicio_02 {
    static Scanner in = new Scanner(System.in);
    public static void  main(String[] args) {
        MyLocal.setarUs();



        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 1, 7, 8},
                {9, 10, 1, 12},
                {13, 14, 15, 1}
        };
        int somaDIag = 0;

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (i == j) {
                    somaDIag += matriz[i][i];
                }
            }
        }

        System.out.printf("A soma da diagonal da matriz é %d", somaDIag);

    }
}
