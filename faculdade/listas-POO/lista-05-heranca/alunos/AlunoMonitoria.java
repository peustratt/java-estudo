package alunos;

public class AlunoMonitoria extends Aluno {
    private String disciplina;

    AlunoMonitoria(int matricula, String nome, String area, double valorBolsa, String disciplina) {
        super(matricula, nome, area, valorBolsa);
        this.setDisciplina(disciplina);
    }
    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (!disciplina.equals(null) || !disciplina.equals("")) {
            this.disciplina = disciplina;
        } else {
            System.out.println("Digite uma string válida!");
        }
    }

    public String toString() {
        return String.format("Matrícula: %d\nNome: %s\nÁrea: %s\nValor da bolsa: R$%.2f\nDisciplina: %s",
                this.getMatricula(), this.getNome(), this.getArea(), this.getValorBolsa(), this.getDisciplina());
    }
}
