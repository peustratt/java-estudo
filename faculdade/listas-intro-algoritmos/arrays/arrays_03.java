package arrays;

import java.util.Locale;
import java.util.Scanner;

public class arrays_03 {
    static Scanner in = new Scanner(System.in);
    public static void main(String [] args){
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);

        float media = 0;

        float[] notas = new float[10];

        for (int i=0; i < notas.length; i++){
            System.out.printf("Digite a nota do °%d aluno: ", i+1);
            notas[i] = in.nextFloat();
        }

        for (float nota : notas){
            media += nota;
        }
        media /= 10;

        int alunos_acima = 0;
        for (float nota : notas){
            if (nota > media){
                alunos_acima++;
            }
        }

        System.out.printf("A média foi %.2f, %d aluno ficaram acima dessa média!", media, alunos_acima);
    }

}

