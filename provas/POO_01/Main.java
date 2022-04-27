package POO_01;

public class Main {
    public static void main(String[] args) {
        Copo A = new Copo(500, 500, "Vermelho");
        Copo B = new Copo(400, "Roxo");

        A.esvaziar();
        B.adicionarLiquido(B.getCapacidadeMaxima() / 2);
        System.out.println();
        A.obterInformacoes();
        B.obterInformacoes();

    }
}
