import java.util.Scanner;

// Faça um programa que receba uma frase e uma palavra.
// Calcule e mostre a quantidade de vezes que a palabra digitada aprece na frase.

public class exec07 {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        String frase = "Calcule e mostre a quantidade de vezes que a palabra digitada aprece na frase. ", str = "";
        int tamanhoStr = str.length();
        int indexFinal = frase.length() - tamanhoStr + 1;
        int count = 0;

        System.out.println("Digite a string: ");


        for (int i = 0; i < indexFinal; i++) {
            if (frase.substring(i, i + tamanhoStr).equals(str)) {
                count++;
            }
        }

        System.out.println(count);
    }

}
