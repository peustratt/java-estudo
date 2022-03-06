package aquecimento;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaQuadrado {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);

        System.out.println("Digite o lado do quadrado: ");
        Quadrado quad = new Quadrado(in.nextDouble());
        quad.imprimiInfo();
    }
}