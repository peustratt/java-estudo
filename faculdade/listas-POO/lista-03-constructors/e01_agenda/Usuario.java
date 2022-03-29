package e01_agenda;

public class Usuario {
    String nome, cpf;
    Contato[] contatos;

    Usuario(String nome, String cpf, Contato[] contatos) {
        this.nome = nome;
        this.cpf = cpf;
        this.contatos = contatos;
    }

    Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString() {
        String infoCompleta = this.nome + "\n" + Utils.formataCpf(this.cpf);
        for (Contato contato: contatos) {
            infoCompleta += contato;
        }
        return infoCompleta;
    }
}
