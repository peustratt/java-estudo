package matriz;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Locale us = new Locale("en","us");
        Locale.setDefault(us);

        int[][] matriz = {
                {1 ,2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] linha: matriz){
            for(int item: linha){
                System.out.print(item + " ");
            }
            System.out.println();

        }




    }
}
