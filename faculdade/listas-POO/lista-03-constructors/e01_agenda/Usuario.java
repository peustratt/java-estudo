package e01_agenda;

public class Usuario {
    String nome, cpf;
    Contato[] contatos;

    Usuario(String nome, String cpf, Contato[] contatos) {
        this.nome = nome;
        this.cpf = cpf;
        this.contatos = contatos;
    }

    public String toString() {
        String infoCompleta = this.nome + "\n" + Utils.formataCpf(this.cpf);
        for (int i=0; i < contatos.length; i++) {
            infoCompleta += "\n-----------\n";
            infoCompleta += "Contato: " + (i+1) + "\n" + contatos[i];
        }
        return infoCompleta;
    }
}
