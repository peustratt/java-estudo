// Faça um programa que compara dois vetores (A e B) e exibe na tela um terceiro vetor
// (C) contendo a interseção dos valores de A e B. Declare e inicialize os vetores A e B
// com 5 números inteiros cada. Use modularização.

import java.util.Arrays;

public class exec05 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] b = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 29 };
        String intersecStr = "";

        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    if (intersecStr.equals("")) {
                        intersecStr += i;
                    } else {
                        intersecStr += "," + i;
                    }
                }
            }
        }
        System.out.println(intersecStr);
        String[] intersect = intersecStr.split(",");
        System.out.println(Arrays.toString(intersect));
    }

}
