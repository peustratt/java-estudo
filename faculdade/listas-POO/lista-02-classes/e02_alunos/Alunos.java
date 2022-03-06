package e02_alunos;

import java.util.Scanner;

public class Alunos {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Aluno[] alunos = new Aluno[3];
        alunos[0] = new Aluno("Pedro Ivo", 28, "ADS", 202120075);
        alunos[1] = new Aluno("Xandex", 26, "ADS", 202120156);
        alunos[2] = new Aluno("Flavia Costa", 32, "Ciência da Computação", 202120034);

        System.out.println("\nAlunos matriculados: ");
        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("- aluno %d: %s\n", i + 1, alunos[i].nome);
        }

        System.out.print("Digite o número do aluno que deseja editar: ");
        int escolha = in.nextInt();
        Aluno alunoEscolhido = alunos[escolha - 1];
        alunoEscolhido.imprimeDados();

        System.out.print("qual campo deseja alterar? ex (N, I, C, M): ");
        char escolhaDado = in.next().charAt(0);
        alunoEscolhido.alteraValor(escolhaDado);
        System.out.println("----------");
        alunoEscolhido.imprimeDados();

    }
}
