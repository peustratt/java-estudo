import java.util.Scanner;

import meu_local.MyLocal;

public class exec02 {
    static Scanner in = new Scanner(System.in);

    public static void main(String args[]) {
        MyLocal.setarUs();
        int base, expo;

        System.out.println("Digite no seguinte formato ex: 2e3");
        String[] resp = in.nextLine().split("e");
        base = Integer.parseInt(resp[0]);
        expo = Integer.parseInt(resp[1]);

        int[] tamanho = new int[expo - 1];
        int result = base;

        for (int i : tamanho) {
            result *= base;
        }

        
        System.out.println("\nresultado: "+result);


    }
}
