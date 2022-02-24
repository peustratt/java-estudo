package lista_06_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class falvis {
    public static void main(String[] args) {
        Locale us = new Locale("en", "us");
        Locale.setDefault(us);
        Scanner in = new Scanner(System.in);

        int quantidadeFuncionarios;

        System.out.println("Digite a quantidade de funcionários: ");
        quantidadeFuncionarios = in.nextInt();

        String[] nomesFuncionarios = new String[quantidadeFuncionarios];

        int colunaMatriz = 4;

        double[][] matrizDadosFuncionarios = new double[quantidadeFuncionarios][colunaMatriz];

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.println("Informe o nome do funcionário: ");
            nomesFuncionarios[i] = in.next();

            double[] dadosCadastrais = dadosCadastrais(colunaMatriz);

            for (int j = 0; j < matrizDadosFuncionarios[i].length; j++)
                matrizDadosFuncionarios[i][j] = dadosCadastrais[j];
        }
        for (int k = 0; k < nomesFuncionarios.length; k++) {
            System.out.printf("Funcionário %s ", nomesFuncionarios[k]);
            for (double dadosCadastrais : matrizDadosFuncionarios[k]) {
                System.out.println(dadosCadastrais);
            }
            System.out.println("==========\n");
        }

        double somaSalariosBrutos = 0, somaSalariosLiquidos = 0, somaDescontosInss = 0, somaDescontosIr = 0;
        for (double[] dadosfuncionario: matrizDadosFuncionarios) {
            somaSalariosBrutos += dadosfuncionario[0];
            somaSalariosLiquidos += dadosfuncionario[1];
            somaDescontosInss += dadosfuncionario[2];
            somaDescontosIr += dadosfuncionario[3];
        }
        System.out.printf("A soma dos salários brutos é %.2f\n", somaSalariosBrutos);
        System.out.printf("A soma dos salários liquidos é %.2f\n", somaSalariosLiquidos);
        System.out.printf("A soma dos descontos de INSS é %.2f\n", somaDescontosInss);
        System.out.printf("A soma dos descontos de Imposto de Renda é %.2f\n", somaDescontosIr);

    }

    public static double[] dadosCadastrais(int dadosCad) {
        Scanner in = new Scanner(System.in);
        double salBruto;
        double descontoInss;
        double descontoImpostoRenda;
        double salLiquido;
        double[] dadosDoFuncionario = new double[dadosCad];

        System.out.println("Digite o salário bruto do funcionário: ");
        salBruto = in.nextDouble();
        System.out.println("Digite o desconto do Inss: ");
        descontoInss = in.nextDouble();
        System.out.println("Digite o desconto do Imposto de Renda: ");
        descontoImpostoRenda = in.nextDouble();
        salLiquido = salBruto - (descontoInss + descontoImpostoRenda);

        dadosDoFuncionario[0] = salBruto;
        dadosDoFuncionario[1] = salLiquido;
        dadosDoFuncionario[2] = descontoInss;
        dadosDoFuncionario[3] = descontoImpostoRenda;

        return dadosDoFuncionario;
    }

}