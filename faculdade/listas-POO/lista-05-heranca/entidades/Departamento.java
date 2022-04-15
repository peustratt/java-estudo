package entidades;

public class Departamento {
    private int codigo;
    private String nome;

    Departamento(int codigo, String nome) {
        this.setCodigo(codigo);
        this.setNome(nome);
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        } else {
            System.out.println("Digite um inteiro maior que 0!");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (!nome.equals(null) || !nome.equals("")) {
            this.nome = nome;
        } else {
            System.out.println("Digite um string válida!");
        }
    }

    public String toString() {
        return String.format("Código: %d\n--Nome Departamento: %s", getCodigo(), getNome());
    }
}
