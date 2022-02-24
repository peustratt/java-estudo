import java.util.Scanner;

import meu_local.MyLocal;

public class exec03 {
    public static void main(String[] args) {
        MyLocal.setarUs();
        Scanner in = new Scanner(System.in);

        System.err.println("Digites os valores do separados por virgulas");
        String[] valoresStr = in.nextLine().split(",");

        int[] valoresArray = new int[valoresStr.length];
        for (int i=0; i < valoresStr.length; i++) {
            valoresArray[i] = Integer.parseInt(valoresStr[i]);
        }

        int max = valoresArray[0];
        int index = 0;

        for (int i=0; i < valoresArray.length; i++) {
            if (max < valoresArray[i]) {
                max = valoresArray[i];
                index = i;
            }
        }

        System.out.printf("\nMaior valor: %d,\nindex de ocorrência: [%d]\n", max, index);

        in.close();
        

        
    }
    
}
