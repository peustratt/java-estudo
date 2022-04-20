package ingressos;

public class VIP extends Ingresso {

    private float valorAdicional;

    VIP(float valor, float valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public void imprimeValor() {
        System.out.println(this.valor + this.valorAdicional);
    }
}
