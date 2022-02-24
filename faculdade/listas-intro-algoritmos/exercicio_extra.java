import java.util.Locale;

public class exercicio_extra {
    public static void main(String[] args) {
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);

        int[] vA = {1, 2, 3}, vB = {4, 5, 6};
        int[] vC = new int[vA.length + vB.length];

        for (int i=0; i < vA.length; i++) {
            vC[i] = vA[i];
            vC[i + vA.length] = vB[i];
        }

        for (int numero : vC) {
            System.out.print(numero + " ");
        }
    }
}
