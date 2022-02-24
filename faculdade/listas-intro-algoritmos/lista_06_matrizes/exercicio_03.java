/*
  Crie uma matriz para armazenar 3 telefones de um contato, onde cada linha da matriz é
  referente a um contato diferente. Crie um vetor para armazenar os nomes dos contatos.
  Portanto, a posição 0 do vetor corresponde ao nome do contato cujos 3 telefones estão na
  linha 0 da matriz.
  O programa deve perguntar ao usuário a quantidade de contatos que deseja cadastrar (que
  significa a quantidade de linhas da matriz e o tamanho do vetor de nomes).
  Para cada contato, dentro de um laço, o programa deve perguntar ao usuário o nome do
  contato (que será armazenado no vetor) e todos os seus 3 telefones a serem guardados na
  matriz.
  Por fim, o programa deverá exibir os contatos na tela da seguinte forma:
  Contato 1: [nome_do_contato]
  Telefones:
  (xx) x xxx.xxxx
  (xx) x xxx.xxxx
  (xx) x xxx.xxxx
  ===
  Contato 2: [nome_do_contato]
  Telefones:
  (xx) x xxx.xxxx
  (xx) x xxx.xxxx
 */

package lista_06_matrizes;

import meu_local.MyLocal;
import java.util.Scanner;

public class exercicio_03 {
    static Scanner in = new Scanner(System.in);
    static String[] numerosOrdinais = {"primeiro", "segundo", "terceiro"};

    public static void main(String[] args) {
        MyLocal.setarUs();
        System.out.println("Digite quantos contatos você deseja salvar: ");
        int qtdDeContatos = in.nextInt();
        in.nextLine();
        String[][] matrizDeContatos = new String[qtdDeContatos][3];
        String[] contatos = new String[qtdDeContatos];
        int qtdDeTelefones = 3;

        for (int i = 0; i < qtdDeContatos; i++) {
            contatos[i] = cadContato();
            String[] telefones = cadTelefones(qtdDeTelefones);

            for (int j = 0; j < telefones.length; j++) {
                matrizDeContatos[i][j] = telefones[j];
            }

        }
        for (int i = 0; i < contatos.length; i++) {
            System.out.printf("Contato %d [%s]: \n", i+1, contatos[i]);
            for (String telefone : matrizDeContatos[i]) {
                System.out.println(telefone);
            }
            System.out.println("\n======");
        }
    }


    // Cadastra os telefones
    private static String[] cadTelefones(int qtdDeTelefones) {
        String[] telefones = new String[qtdDeTelefones];
        for (int i = 0; i < qtdDeTelefones; i++) {
            System.out.printf("Digite o  %s telefone do contato:", numerosOrdinais[i]);
            telefones[i] = in.nextLine();
            System.out.println();
        }

        return telefones;
    }

    // Cadastra o contato
    private static String cadContato() {
        System.out.println("Digite o nome do contato que deseja salvar: ");
        return in.nextLine();
    }
}
