package aquecimento02_cadastro;

public class Pessoa {
    public String nome, cpf, celular, cep;

    Pessoa (String nome, String cpf, String celular, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.cep = cep;
    }

    public String toString() {
        return String.format("Nome: %s\nCPF: %s\nCelular: %s\nCEP: %s", nome, Utils.formatacpf(this.cpf), Utils.formataCel(this.celular), Utils.formataCEP(this.cep));
    }
}
