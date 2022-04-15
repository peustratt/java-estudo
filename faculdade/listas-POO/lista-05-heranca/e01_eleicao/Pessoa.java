package e01_eleicao;

public class Pessoa {
    private String nome;
    private String CPF;

    Pessoa(String nome, String CPF) {
        this.setNome(nome);
        this.setCPF(CPF);
    }

    protected String getNome() {
        return this.nome;
    }

    protected void setNome(String nome) {
        if (!nome.equals(null) || !nome.equals("")) {
            this.nome = nome;
        } else {
            System.out.println("Digite uma string válida!");
        }
    }

    protected String getCPF() {
        return this.CPF;
    }

    protected void setCPF(String CPF) {
        if (!CPF.equals(null) && !CPF.equals(""))
        this.CPF = CPF;
    }
}
