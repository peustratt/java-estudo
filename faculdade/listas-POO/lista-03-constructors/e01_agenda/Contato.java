package e01_agenda;

public class Contato {
    String nome;
    int idade;
    String sexo;
    String celular;
    String email;

    Contato(String nome, int idade, String sexo, String celular, String email) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.celular = celular;
        this.email = email;
    }

    Contato(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return String.format("Nome: %s\nIdade: %d\nSexo: %s\nCelular: %s\nEmail: %s", this.nome, this.idade, this.sexo, Utils.formataCelular(this.celular), this.email);
    }
}
