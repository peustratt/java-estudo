/* 9) A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um
        programa para coletar dados sobre o salário e número de filhos de cada habitante e após
        as leituras, escrever:
        a. Média de salário da população
        b. Média do número de filhos
        c. Maior salário dos habitantes
        d. Percentual de pessoas com salário menor que R$ 150,00
        Obs.: Pergunte ao usuário a quantidade de habitantes que será cadatrada.*/

package lista_04_estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;


public class exercicio_09 {
    public static void main(String[] args){
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);
        Scanner in = new Scanner(System.in);

        float somaSalario = 0, salario, maiorSalario = 0;
        System.out.println("Digite a quantidade de cadastros que serão realizados: ");
        int qtdCadastro = in.nextInt();
        int qtdDeFilhos, somaFilhos = 0, contAbaixo150 = 0;

        for (int i=1; i <= qtdCadastro; i++){
            System.out.printf("Cadastro da °%d pessoa!\n", i);
            System.out.println("Digite o salario : ");
            salario = in.nextFloat();
            somaSalario += salario;
            if (salario > maiorSalario){
                maiorSalario = salario;
            }
            if (salario < 150){
                contAbaixo150++;
            }

            System.out.println("Digite a quantidade de filhos: ");
            qtdDeFilhos = in.nextInt();
            somaFilhos += qtdDeFilhos;


        }
        System.out.printf("A média dos salários é R$%.2f\n", somaSalario/qtdCadastro);
        System.out.printf("A média do numero de filhos é de %.2f\n", (float) somaFilhos/qtdCadastro);
        System.out.printf("O mairo salário entres os cadastrados é R$%.2f\n", maiorSalario);
        System.out.printf("O percentual de pessoas com salário menor que R$150,00 é de %.2f%%", ((float) contAbaixo150/qtdCadastro) * 100);


    }
}
