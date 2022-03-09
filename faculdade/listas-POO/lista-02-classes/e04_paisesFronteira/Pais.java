package e04_paisesFronteira;

import java.util.ArrayList;

public class Pais {
    String nome;
    String capital;
    Estado[] estados;
    ArrayList<Pais> paises;

    Pais(String nome, String capital, Estado[] estados) {
        this.nome = nome;
        this.capital = capital;
        this.estados = estados;
        this.paises = new ArrayList<Pais>();
    }

    public int obterQuantidadeCidades() {
        int numeroDeCidades = 0;
        for (Estado estado : this.estados) {
            numeroDeCidades += estado.obterNumeroCidades();
        }
        return numeroDeCidades;
    }

    public Estado obterMaiorEstado() {
        Estado maiorEstado = this.estados[0];
        for (Estado estado : this.estados) {
            if (maiorEstado.dimensao < estado.dimensao) {
                maiorEstado = estado;
            }
        }
        return maiorEstado;
    }

    public void imprimeDados() {
        System.out.println("#--- País ---#");
        System.out.println("Nome: " + this.nome);
        System.out.println("Capital: " + this.capital);
        System.out.println("\n#--- Estados ---#");
        for (int i = 0; i < this.estados.length; i++) {
            System.out.printf("#- Estado %d -#:\n", i + 1);
            estados[i].imprimeDados();
        }
    }

    public boolean ehPaisIgual(Pais p) {
        if (this.nome == p.nome && this.capital == p.capital) {
            return true;
        } else {
            return false;
        }
    }

    public void exibirFronteiras() {
        System.out.printf("\nPaíses que fazem fronteira com o %s:\n", this.nome);

        for (Pais pais : this.paises) {
            System.out.printf(" - %s\n", pais.nome);
        }

    }

}
