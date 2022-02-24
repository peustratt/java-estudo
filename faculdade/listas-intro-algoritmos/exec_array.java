import java.util.Locale;
import java.util.Scanner;

public class exec_array {
    public static void main(String[] args) {
        // Setado linguagem default para inglês EUA
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);
        Scanner in = new Scanner(System.in);

        int[] lista = new int[5];

        for (int i=0; i < lista.length; i++){
            System.out.printf("Digite o °%d numero: ", i+1);
            lista[i] = in.nextInt();
        }
        for (int i : lista){
            System.out.println(i);
        }
    }
}
