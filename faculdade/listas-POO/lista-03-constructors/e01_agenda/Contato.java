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
        // String celular = this.celular == null ? null : Utils.formataCelular(this.celular);
        String stringRetorno;
        if (this.idade == 0) {
            stringRetorno = String.format("Nome: %s", this.nome);
        } else {
            stringRetorno = String.format("Nome: %s\nIdade: %d\nSexo: %s\nCelular: %s\nEmail: %s", this.nome, this.idade, this.sexo, Utils.formataCelular(this.celular), this.email);
        }
        return stringRetorno;
    }
}
