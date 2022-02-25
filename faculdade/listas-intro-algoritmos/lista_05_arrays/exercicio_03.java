/** Escreva um programa para ler e armazenar em um vetor a temperatura média dos últimos
 X dias, onde a quantidade de dias a ser cadastrada será informada pelo usuário. Esta
 quantidade será o tamanho do vetor. Calcule e escreva na tela:
 a. Menor temperatura
 b. Maior temperatura
 c. Temperatura média
 d. O número de dias em que a temperatura foi inferior à média */

package lista_05_arrays;

import meu_local.MyLocal;
import java.util.Scanner;

public class exercicio_03 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        MyLocal.setarUs();

        float tempMax, tempMin, tempMedia = 0;
        int contMenorQueMedia = 0;

        System.out.println("Digite a quantidade de dias: ");
        float[] vetorDias = new float[in.nextInt()];

        for (int i=0; i< vetorDias.length; i++) {
            System.out.printf("Digite a temperatura do °%d dia: ", i+1);
            vetorDias[i] = in.nextFloat();
            tempMedia += vetorDias[i];
        }

        tempMedia /= vetorDias.length;
        tempMax = vetorDias[0];
        tempMin = vetorDias[0];

        for (float temp: vetorDias) {
            if (temp > tempMax) {
                tempMax = temp;
            }
            else if (temp < tempMin) {
                tempMin = temp;
            }
            if (temp < tempMedia) {
                contMenorQueMedia++;
            }
        }

        System.out.printf("A mininima foi %.2f°C,\n a máxima foi %.2f°C,\n a média foi %.2f°C\n e o numero de dias com a temperatura abaixo da média foi %d", tempMin, tempMax, tempMedia, contMenorQueMedia);

    }
}
