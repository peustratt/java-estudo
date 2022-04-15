package e01_eleicao;

public class Candidato extends Pessoa {
    private int numero;
    private String partido;
    private int numVotos = 0;

    Candidato(String nome, String CPF, int numero, String partido) {
        super(nome, CPF);
        this.setNumero(numero);
        this.setPartido(partido);
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("Digite um inteiro maior que 0");
        }
    }

    public String getPartido() {
        return this.partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getNumVotos() {
        return this.numVotos;
    }

    public void incrementaVotos() {
        this.numVotos++;
    }

    public String toString() {
        return String.format("Nome: %s\nCPF: %s\nNúmero: %d\nPartido: %s", getNome(), getCPF(),
                getNumero(), getPartido());
    }
}
