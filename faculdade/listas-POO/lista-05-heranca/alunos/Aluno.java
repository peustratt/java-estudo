package alunos;

public class Aluno {
    private int matricula;
    private String nome;
    private String area;
    private double valorBolsa;

    Aluno(int matricula, String nome, String area, double valorBolsa) {
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setArea(area);
        this.setValorBolsa(valorBolsa);
    }

    public int getMatricula() {
        return this.matricula;
    }

    private void setMatricula(int matricula) {
        if (matricula > 0) {
            this.matricula = matricula;
        } else {
            System.out.println("Digite um inteiro positivo para a matrícula!");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (!nome.equals(null) || !nome.equals("")) {
            this.nome = nome;
        } else {
            System.out.println("Digite uma string válida!");
        }
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        if (!area.equals(null) || !area.equals("")) {
            this.area = area;
        } else {
            System.out.println("Digite uma string válida!");
        }
    }

    public double getValorBolsa() {
        return this.valorBolsa;
    }

    public void setValorBolsa(double valorBolsa) {
        if (valorBolsa > 0) {
            this.valorBolsa = valorBolsa;
        } else {
            System.out.println("Digite um número válido");
        }
    }
}
