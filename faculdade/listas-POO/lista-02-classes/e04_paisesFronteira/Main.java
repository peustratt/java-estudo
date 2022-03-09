package e04_paisesFronteira;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String[] cidades01 = { "Recife", "Gravatá", "Caruaru", "Carpina", "Timbaúba" },
                cidades02 = { "João Pessoa", "Campina Grande", "Patos", "Boqueirão", "Cabaceiras" },
                cidades03 = { "Maceio", "Maragogi", "Varzea do Una", "Delmiro Gouveia", "Arapiraca" },
                cidades04 = { "Natal", "Tibal do Sul", "Pipa", "Ponta Negra", "Morro do Careca" },
                cidades05 = { "Fortaleza", "Cumbuco", "Jericoacoara", "Genipabu", "Forte" };

        // Brasil
        Estado[] estadosBR = {
                new Estado("Pernambuco", "Recife", cidades01, 98800),
                new Estado("Paraiba", "João Pessoa", cidades02, 56500),
                new Estado("Alagoas", "Maceio", cidades03, 40250),
                new Estado("Rio Grande do Norte", "Natal", cidades04, 45450),
                new Estado("Ceará", "Fortaleza", cidades05, 250450)
        };
        Pais brasil = new Pais("Brasil", "Brasília", estadosBR);

        // Chile
        Estado[] estadosCH = {
                new Estado("Coquimbo", "La serena", cidades01, 40579),
                new Estado("Aconcagua", "San Felipe", cidades02, 2659),
                new Estado("Santiago", "Santiago", cidades03, 2109),
                new Estado("Colchaga", "San Fernando", cidades04, 4050),
                new Estado("Valdivia", "Valdvia", cidades05, 10450)
        };
        Pais chile = new Pais("Chile", "Santiago", estadosCH);

        // Uruguai
        Estado[] estadosUR = {
                new Estado("Montevidéu", "Montevidéu", cidades01, 530),
                new Estado("Artigas", "Artigas", cidades02, 11928),
                new Estado("Flores", "Trinidad", cidades03, 5144),
                new Estado("Salto", "Salto", cidades04, 14163),
                new Estado("Tacuarembó", "Tacuarembó", cidades05, 15438)
        };
        Pais uruguai = new Pais("Uruguai", "Montevidéu", estadosUR);

        // Argentina
        Estado[] estadosAR = {
                new Estado("Buenos Aires", "Ciudad Autónoma de Buenos Aires", cidades01, 200),
                new Estado("Artigas", "Artigas", cidades02, 11928),
                new Estado("Flores", "Trinidad", cidades03, 5144),
                new Estado("Salto", "Salto", cidades04, 14163),
                new Estado("Tacuarembó", "Tacuarembó", cidades05, 15438)
        };
        Pais argentina = new Pais("Argentina", "Buenos Aires", estadosAR);

        // Venezuela
        Pais venezuela = new Pais("Venezuela", "Caracas", estadosAR);

        brasil.paises.add(argentina);
        brasil.paises.add(venezuela);
        brasil.paises.add(uruguai);

        chile.paises.add(argentina);

        uruguai.paises.add(argentina);
        uruguai.paises.add(brasil);

        argentina.paises.add(brasil);
        argentina.paises.add(chile);
        argentina.paises.add(uruguai);

        venezuela.paises.add(brasil);

        System.out.println(brasil.ehPaisIgual(venezuela));
        System.out.println(argentina.ehPaisIgual(argentina));

        brasil.exibirFronteiras();
        argentina.exibirFronteiras();
        venezuela.exibirFronteiras();
        chile.exibirFronteiras();
        uruguai.exibirFronteiras();

        Pais[] paises = new Pais[5];
        paises[0] = brasil;
        paises[1] = argentina;
        paises[2] = venezuela;
        paises[3] = chile;
        paises[4] = uruguai;

        for (int i = 0; i < paises.length; i++) {
            System.out.printf("Pais %d: %s\n", i + 1, paises[i].nome);
        }
        System.out.println("Escolha o pais pelo numero: ");
        int escolha = in.nextInt();
        paises[escolha - 1].exibirFronteiras();

    }
}
