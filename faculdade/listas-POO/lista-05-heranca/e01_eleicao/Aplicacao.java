package e01_eleicao;

import java.util.Scanner;

public class Aplicacao {
    static Scanner in = new Scanner(System.in);
    static Candidato[] candidatos = new Candidato[2];
    static Eleitor[] eleitores = new Eleitor[5];
    public static void main(String[] args) {
        for (int i=0; i < candidatos.length; i++) {
            candidatos[i] = cadastraCandidato();
        }
        // Votação
        for (int i=0; i < eleitores.length; i++) {
            // Printa candidatos
            System.out.println();
            for (int j=0; j < candidatos.length; j++) {
                System.out.println("Cadidato " + (j+1));
                System.out.println(candidatos[j]);
                System.out.println("----------");
            }

            System.out.println("\nCadastro e votação Eleitor n° " + (i+1));
            int voto = 0;
            eleitores[i] = cadastrarEleitor();
            while (true) {
                voto  = eleitores[i].votar();
                if (validarVoto(voto)) {
                    break;
                } else {
                    System.out.println("Voto inválido!");
                }

            }

            for (int j=0; j < candidatos.length; j++) {
                if (candidatos[j].getNumero() == voto) {
                    candidatos[j].incrementaVotos();
                }
            }

        }

        Candidato vencedor = candidatos[0];
        String nomeCand01 = candidatos[0].getNome();
        int votosCand01 = candidatos[0].getNumVotos();
        String nomeCand02 = candidatos[1].getNome();
        int votosCand02 = candidatos[1].getNumVotos();
        float totalVotos = votosCand01 + votosCand02;
        boolean empate = false;

        if (votosCand01 < votosCand02) {
            vencedor = candidatos[1];
        } else if (votosCand01 == votosCand02) {
            empate = false;
        } else {
            vencedor = candidatos[0];
        }

        if (!empate) {
            System.out.println("\nO vencedor foi");
            System.out.println(vencedor);
            System.out.println("Tabela de votos: ");
            System.out.printf("Nome: %s, Votos recebidos: %d, percentual do total de votos: %.2f%%", nomeCand01, votosCand01, ((votosCand01/totalVotos) * 100));
            System.out.printf("\nNome: %s, Votos recebidos: %d, percentual do total de votos: %.2f%%\n", nomeCand02, votosCand02, ((votosCand02 / totalVotos) * 100));
        }
    }

    public static Candidato cadastraCandidato() {
        System.out.println("\nCadastro de Candidato!");
        System.out.println("Digite o nome: ");
        String nome = in.nextLine();
        System.out.println("Digite o CPF: ");
        String CPF = in.nextLine();
        System.out.println("Digite o número do candidato: ");
        int numero = in.nextInt();
        in.nextLine();
        System.out.println("Digite o partido: ");
        String partido = in.nextLine();

        return new Candidato(nome, CPF, numero, partido);
    }

    public static Eleitor cadastrarEleitor() {
        System.out.println("Digite o seu nome: ");
        String nome = in.nextLine();
        System.out.println("Digite o seu CPF:");
        String CPF = in.nextLine();

        int titulo;
        while (true) {
            System.out.println("Digite o seu titulo: ");
            titulo = in.nextInt();
            in.nextLine();
            if (validarTitulo(titulo)) {
                break;
            } else {
                System.out.println("Já existe outro eleitor com este título!\nDigite novamente!");
            }
        }
        return new Eleitor(nome, CPF, titulo);
    }

    public static boolean validarVoto(int voto) {
        for (Candidato candidato: candidatos) {
            if (candidato.getNumero() == voto) {
                return true;
            }
        }
        return false;
    }

    public static boolean validarTitulo(int titulo) {
        for (Eleitor eleitor: eleitores) {
            if (eleitor != null) {
                if (eleitor.getTitulo() == titulo) {
                    return false;
                }
            }
        }
        return true;
    }
}
