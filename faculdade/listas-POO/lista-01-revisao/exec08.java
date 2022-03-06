import java.util.Scanner;

public class exec08 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String celular, CPF, CEP;
        boolean valid = false;

        do {
            System.out.println("Digite seu celular 11 dígitos: ");
            celular = in.nextLine();
            boolean matched = celular.matches("^[0-9]{11}$");

            if (!matched) {
                System.out.println("Digite somente números e 11 dígitos!");
                continue;
            }
            valid = true;
        } while (!valid);

        valid = false;
        do {
            System.out.println("Digite seu CPF11 dígitos: ");
            CPF = in.nextLine();
            boolean matched = CPF.matches("^[0-9]{11}$");

            if (!matched) {
                System.out.println("Digite somente números e 11 dígitos!");
                continue;
            }
            valid = true;
        } while (!valid);

        valid = false;
        do {
            System.out.println("Digite seu CEP 8 dígitos: ");
            CEP = in.nextLine();
            boolean matched = CEP.matches("^[0-9]{8}$");

            if (!matched) {
                System.out.println("Digite somente números e 8 dígitos!");
                continue;
            }
            valid = true;
        } while (!valid);

        System.out.printf("(%s) %s %s-%s (celular)\n", celular.substring(0, 2), celular.substring(2, 3), celular.substring(3, 7), celular.substring(7));
        System.out.printf("%s.%s.%s-%s (CPF)\n", CPF.substring(0, 3), CPF.substring(3, 6), CPF.substring(6, 9), CPF.substring(9, 11));
        System.out.printf("%s-%s (CEP)\n", CEP.substring(0, 5), CEP.substring(5, 8));

    }
}
