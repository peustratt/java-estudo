package arrays;

import java.util.Locale;


public class arrays_01 {
    public static void main(String[] args){
        // Setado linguagem default para inglês EUA
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);

        int[] lista = new int[10];

        for (int i=0; i < lista.length; i++){
            if (i % 2 == 0){
                lista[i] = 0;
            }
            else{
                lista[i] = 1;
            }
        }

        for (int i : lista){
            System.out.println(i);
        }
    }
}
