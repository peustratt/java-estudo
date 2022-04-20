package ingressos;

public class Ingresso {
    protected float valor;

    Ingresso(float valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.println(this.valor);
    }
}
