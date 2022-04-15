package alunos;

public class AlunoIniciacaoCientifica extends Aluno {
    private String tituloProjeto;

    AlunoIniciacaoCientifica(int matricula, String nome, String area, double valorBolsa, String tituloProjeto) {
        super(matricula, nome, area, valorBolsa);
        this.setTituloProjeto(tituloProjeto);
    }

    public String getTituloProjeto() {
        return this.tituloProjeto;
    }

    public void setTituloProjeto(String tituloProjeto) {
        if (!tituloProjeto.equals(null) && !tituloProjeto.equals("")) {
            this.tituloProjeto = tituloProjeto;
        } else {
            System.out.println("Digite uma string válida!");
        }
    }

    public String toString() {
        return String.format("Matrícula: %d\nNome: %s\nÁrea: %s\nValor da bolsa: R$%.2f\nTítulo do Projeto: %s",
                this.getMatricula(), this.getNome(), this.getArea(), this.getValorBolsa(),this.getTituloProjeto());
    }
}
