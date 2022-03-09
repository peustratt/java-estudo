package e03_paises;

public class Estado {
    String nome, capital;
    String[] cidades;
    float dimensao;
    Estado(String nome, String capital, String[] cidades, float dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.cidades = cidades;
        this.dimensao = dimensao;
    }

    public int obterNumeroCidades() {
        return this.cidades.length;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Capital: " + this.capital);
        System.out.print("Cidades: ");
        for (String cidade : this.cidades) {
            System.out.printf("%s, ", cidade);
        }
        System.out.printf("\nArea: %.2f km²\n \n", this.dimensao);
    }
}
