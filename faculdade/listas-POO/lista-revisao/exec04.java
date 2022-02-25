import meu_local.MyLocal;
import java.util.Scanner;

// Escrever um programa que lê 10 números inteiros e armazene esses valores em um
// array. O programa deve calcular a média aritmética dos valores do vetor e imprimir na
// tela todos os valores menores do que a média calculada. Use modularização.

public class exec04 {
    static Scanner in = new Scanner(System.in);
    public static void main(String args[]) {
        MyLocal.setarUs();



        System.out.println("Digite o a quantidade valores: ");
        int qtd = in.nextInt();
        int[] vetor = new int[qtd];
        for (int i=0; i < qtd; i++) {
            System.out.printf("Digite o %d valor: ", i+1);
            vetor[i] = in.nextInt();
        }

        float media = calculaMedia(vetor);
        System.out.printf("media: %.2f\n", media);
        for (int valor: vetor) {
            if (valor < media) {
                System.out.println(valor);
            }
        }
    }

    public static float calculaMedia(int[] vetor) {
        float soma = 0;

        for (int valor : vetor) {
            soma += valor;
        }

        return soma / vetor.length;

    }
}
