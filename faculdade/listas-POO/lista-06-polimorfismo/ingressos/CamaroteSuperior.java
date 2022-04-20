package ingressos;

public class CamaroteSuperior extends VIP{
    private String localizacao;

    CamaroteSuperior(float valor, float valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.setLocalizacao(localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
}
