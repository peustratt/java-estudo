// Faça um programa principal que defina um array de inteiros e chame três funções
// passando por parâmetro o array definido. No final, imprima o resultado das funções na
// tela.
// a. Uma função para calcular a média e retorná-la.
// b. Uma função para encontrar o maior valor e retorná-lo.
// c. Uma função para encontrar o menor valor e retorná-lo.

import java.util.Scanner;

import meu_local.MyLocal;

public class exec06 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        MyLocal.setarUs();
        System.out.println("Digite o tamanho do vetor: ");
        int[] vetor = new int[in.nextInt()];

        for (int i=0; i < vetor.length; i++) {
            System.out.printf("Digite o %d valor: ", i+1);
            vetor[i] = in.nextInt();
        }

        System.out.printf("Media: %.2f\n", calculaMedia(vetor));
        System.out.println("Maior: " + encontraMaior(vetor));
        System.out.println("Menor " + encontraMenor(vetor));
    }

    private static float calculaMedia(int[] vetor) {
        float soma = 0;
        for (int valor: vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }

    private static int encontraMaior(int[] vetor) {
        int maior = Integer.MIN_VALUE;
        for (int valor: vetor) {
            if (maior < valor) {
                maior = valor;
            }
        }
        return maior;
    }

    private static int encontraMenor(int[] vetor) {
        int menor = Integer.MAX_VALUE;
        for (int valor: vetor) {
            if (menor > valor) {
                menor = valor;
            }
        }
        return menor;
    }
}
