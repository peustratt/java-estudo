package alunos;

public class Aplicacao {
    public static void main(String[] args) {
        AlunoIniciacaoCientifica alunoIc = new AlunoIniciacaoCientifica(1500, "Xandex", "Data-base", 750.45, "Jamp-app");
        AlunoMonitoria alunoMonitoria = new AlunoMonitoria(1501, "Pedro", "Front-end", 650.75, "POO");

        System.out.println();
        System.out.println(alunoIc);
        System.out.println("");
        System.out.println(alunoMonitoria);
    }
}
