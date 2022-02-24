package arrays;

import java.util.Locale;
import java.util.Scanner;

public class arrays_02 {
    public static void main(String[] args){
        Locale us = new Locale("us", "en");
        Locale.setDefault(us);
        Scanner in = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i=0; i < nomes.length; i++){
            System.out.printf("Digite o %d° nome: ", i+1);
            nomes[i] = in.nextLine();
        }

        boolean achado = false;
        String nome_busca = "Maria";

        for (String nome : nomes){
            if (nome.equals(nome_busca)){
                achado = true;
            }
        }
        if (achado){
            System.out.println("Achei!");
        }
        else{
            System.out.println("Não achei");
        }
    }

}
