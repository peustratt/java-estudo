package entidades;

public class Funcionario {
    private int matricula;
    private String nome;
    private Departamento depto;

    Funcionario(int matricula, String nome, Departamento depto) {
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setDepto(depto);
    }

    public int getMatricula() {
        return this.matricula;
    }

    private void setMatricula(int matricula) {
        if (matricula > 0) {
            this.matricula = matricula;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (!nome.equals(null) && !nome.equals("")) {
            this.nome = nome;
        } else {
            System.out.println("Digite uma string válida!");
        }
    }

    public Departamento getDepto() {
        return this.depto;
    }

    public void setDepto(Departamento depto) {
        if (depto != null) {
            this.depto = depto;
        }
    }

    public String toString() {
        return String.format("\nDados Funcionário:\n--Matrícula: %d\n--Nome: %s,\nDepartamento:\n--%s", getMatricula(), getNome(), getDepto());
    }

}