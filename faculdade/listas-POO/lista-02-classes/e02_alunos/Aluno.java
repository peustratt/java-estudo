package e02_alunos;

import java.util.Scanner;

public class Aluno {
    static Scanner in = new Scanner(System.in);

    String nome;
    int idade;
    String curso;
    int matricula;

    Aluno(String nome, int idade, String curso, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = matricula;
    }

    public void alteraValor(char opcao) {
        switch(opcao) {
            case 'N':
                alteraNome();
                break;
            case 'I':
                alteraIdade();
                break;
            case 'C':
                alteraCurso();
                break;
            case 'M':
                alteraMatricula();
                break;
        }
    }

    public void alteraNome() {
        System.out.print("Digite o novo nome: ");
        String nomeAntigo = this.nome;
        this.nome = in.nextLine();
        System.out.printf("Novo valor: %s,\nvalor prévio: %s\n", this.nome, nomeAntigo);
    }

    public void alteraIdade() {
    System.out.print("Digite a nova idade: ");
        int dadoVelho = this.idade;
        this.idade = in.nextInt();
        System.out.printf("Novo valor: %d,\nvalor pŕevio: %d\n", this.idade, dadoVelho);
    }

    public void alteraCurso() {
        System.out.print("Digite o novo curso: ");
        String dadoVelho = this.curso;
        this.curso = in.nextLine();
        System.out.printf("Novo valor %s,\nvalor prévio: %s\n", this.curso, dadoVelho);
    }

    public void alteraMatricula() {
        System.out.print("Digite a nova matrícula: ");
        int dadoVelho = this.matricula;
        this.matricula = in.nextInt();
        System.out.printf("Novo valor %d,\nvalor prévio: %d\n", this.matricula, dadoVelho);
    }

    public void imprimeDados() {
        System.out.printf("\nNome: %s\nIdade: %d\nCurso: %s\nMatrícula: %d\n-----\n", this.nome, this.idade, this.curso, this.matricula);
    }
}