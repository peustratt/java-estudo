package aquecimento;

import java.util.Scanner;

public class Imc {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite seu nome: ");
        String nome = in.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = in.nextInt();
        System.out.println("Digite sua altura em metros: ");
        float altura = in.nextFloat();
        System.out.println("Digite seu peso em kgs");
        float peso = in.nextFloat();
        System.out.println("Digite seu sexo: ");
        String sexo = in.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, altura, peso, sexo);

        pessoa.imprime();
    }
}
