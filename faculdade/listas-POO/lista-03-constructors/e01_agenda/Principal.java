package e01_agenda;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite seu nome: ");
        String nome = in.nextLine();
        System.out.print("Digite seu CPF: ");
        String cpf = in.nextLine();
        ArrayList<Contato> contatos = new ArrayList<>();

        System.out.println("\nVocê deseja fazer o cadastro simples ou composto?\ndigite:\n1 -> simples\n2 -> composto: ");
        char escolhaCadastro = in.nextLine().charAt(0);
        String escolhaUser = "CADASTRO";

        switch(escolhaCadastro) {
            case '1':
                while (!escolhaUser.equalsIgnoreCase("SAIR")) {
                    contatos.add(cadastraContatoSimples());
                    System.out.println("Cadastrar mais digite qualquer tecla, ou 'SAIR' para encerrar!");
                    escolhaUser = in.nextLine();
                }
                break;

            case '2':
                while (!escolhaUser.equalsIgnoreCase("SAIR")) {
                    contatos.add(cadastraContatoComposto());
                    System.out.println("Cadastrar mais digite qualquer tecla, ou 'SAIR' para encerrar!");
                    escolhaUser = in.nextLine();
                }
                break;
            default:
                System.out.println("Sorry opção incorreta");
        }

        Usuario user = new Usuario(nome, cpf, contatos.toArray(new Contato[0]));
        
        System.out.println("\n#Usuário: ");
        System.out.println(user);
    }

    private static Contato cadastraContatoSimples() {
        System.out.println("Digite o nome do contato: ");
        String nome = in.nextLine();
        return new Contato(nome);
    }

    private static Contato cadastraContatoComposto() {
        System.out.println("Digite o nome do contato: ");
        String nome = in.nextLine();
        System.out.println("Digite a idade: ");
        int idade = in.nextInt();
        in.nextLine();
        System.out.println("Digite o sexo: ");
        String sexo = in.nextLine();
        System.out.println("Digite o celular: ");
        String celular = in.nextLine();
        System.out.println("Digite o email: ");
        String email = in.nextLine();

        return new Contato(nome, idade, sexo, celular, email);

    }
}
