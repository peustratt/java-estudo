package lista_04_estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

/** */
public class exercicio_05 {
    public static void main(String[] args){
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);
        Scanner in = new Scanner(System.in);

        int opcao, cont_1 = 0, cont_2 = 0, cont_3 = 0, cont_4 = 0, cont_5 = 0, cont_6 = 0;
        int totalDeVotos;
        String menu = "Código \n1 - José\n2 - Maria\n3 - Paulo\n 4 - Carla\n 5 - Branco\n 0 - Encerrar programa";

        do {
            System.out.println("Digite o código do seu candidato");
            opcao = in.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Resultado!");
                    break;
                case 1:
                    cont_1++;
                    break;
                case 2:
                    cont_2++;
                    break;
                case 3:
                    cont_3++;
                    break;
                case 4:
                    cont_4++;
                    break;
                case 5:
                    cont_5++;
                    break;
                default:
                    cont_6++;
                    break;
            }
        } while (opcao != 0);

        totalDeVotos = cont_1 + cont_2 + cont_3 + cont_4 + cont_5 + cont_6;
        float percent1 = (float) cont_1 / totalDeVotos;
        float percent2 = (float) cont_2 / totalDeVotos;
        float percent3 = (float) cont_3 / totalDeVotos;
        float percent4 = (float) cont_4 / totalDeVotos;
        float percent5 = (float) cont_5 / totalDeVotos;
        float percent6 = (float) cont_6 / totalDeVotos;

        System.out.printf("José teve %d votos, e obteve %.2f%%\n", cont_1, percent1*100.0);
        System.out.printf("Maria teve %d votos, e obteve %.2f%%\n", cont_2, percent2*100.0);
        System.out.printf("Paulo teve %d votos, e obteve %.2f%%\n", cont_3, percent3*100.0);
        System.out.printf("Carla teve %d votos, e obteve %.2f%%\n", cont_4, percent4*100.0);
        System.out.printf("Obtivemos %d votos Brancoss, o que representa %.2f%%\n", cont_5, percent5*100.0);
        System.out.printf("Obtivemos %d votos Nulos, o que representa %.2f%%\n", cont_6, percent6*100.0);
    }


}
