package entidades;

import java.util.Scanner;

public class app {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite a matricula");
        int matricula = in.nextInt();
        in.nextLine();
        System.out.println("Digite o nome: ");
        String nome = in.nextLine();
        Departamento depto = new Departamento(5025, "Farmácia");

        Funcionario func = new Funcionario(matricula, nome, depto);

        System.out.println(func);
    }
}