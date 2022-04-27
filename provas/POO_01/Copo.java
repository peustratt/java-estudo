
// 4 - Escreva uma classe Copo com os seguintes atributos: capacidadeMaxima (int),
// capacidadeAtual (int) e cor (String). Lembre-se de implementar os atributos usando encapsulamento,
// não esqueçam de implementar seus métodos gets e sets. Além disso, a classe deve ter um construtor
// que recebe o valor de todos os atributos por parâmetro. A classe também deve implementar os seguintes
//métodos: *

package POO_01;

public class Copo {
    private int capacidadeMaxima;
    private int capacidadeAtual;
    private String cor;

    Copo(int capacidadeMaxima, int capacidadeAtual, String cor){
        setCapacidadeMaxima(capacidadeMaxima);
        setCapacidadeAtual(capacidadeAtual);
        setCor(cor);
    }

    Copo(int capacidadeMaxima, String cor) {
        setCapacidadeMaxima(capacidadeMaxima);
        setCor(cor);
    }

    public int getCapacidadeMaxima() {
        return this.capacidadeMaxima;
    }
    
    private void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
    
    public int getCapacidadeAtual() {
        return this.capacidadeAtual;
    }

    private void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }
    
    private String getCor() {
        return this.cor;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    public void adicionarLiquido(int qtd) {
        int somaQtd = getCapacidadeAtual() + qtd;

        if (somaQtd > getCapacidadeMaxima()) {
            System.out.println("O líquido esborrou");
            setCapacidadeAtual(getCapacidadeMaxima());
        } else {
            setCapacidadeAtual(somaQtd);
        }
    }

    public void esvaziar() {
        setCapacidadeAtual(0);
    }

    public void obterInformacoes() {
        System.out.printf("O copo %s, armazena até %d ml e atualmente contém %d ml de líquido.\n", getCor(), getCapacidadeMaxima(), getCapacidadeAtual());
    }


}
