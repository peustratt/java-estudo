/**
 * Declare e inicialize dois vetores do tipo String vetorA e vetorB de tamanho 5. Faça a troca
 * do conteúdo dos dois vetores e exiba na tela.
 */

package lista_05_arrays;

import meu_local.MyLocal;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        MyLocal.setarUs();
        Scanner in = new Scanner(System.in);
        String[] vetorA = {"Hello man!", "Xands", "Peter", "Jack", "Missisipi"}, vetorB = {"Bye man", "Polko", "Pig", "David", "Kirk"};
        String temporarioB;

        for (int i = 0; i < vetorA.length; i++) {
            temporarioB = vetorB[i];
            vetorB[i] = vetorA[i];
            vetorA[i] = temporarioB;
        }

        for (String nome : vetorA)
            System.out.print(nome + " ");
        System.out.println();

        for (String nome : vetorB)
            System.out.print(nome + " ");
        System.out.println();
    }
}


