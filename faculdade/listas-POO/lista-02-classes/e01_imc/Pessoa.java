package e01_imc;

public class Pessoa {
    String nome;
    int idade;
    float altura;
    float peso;
    String sexo;

    Pessoa(String nome, int idade, float altura, float peso, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public float calcImc() {
        return this.peso / (this.altura * this.altura);
    }

    public void imprime() {
        String categoria;
        float imc = calcImc();

        if (imc > 30) {
            categoria = "Obesidade";
        } else if (imc > 25) {
            categoria = "Acima do peso normal";
        } else if (imc > 18.5) {
            categoria = "Peso normal";
        } else {
            categoria = "Abaixo do peso normal";
        }

        System.out.printf("Nome: %s\nIMC: %.2f\n%s!\n", this.nome, imc, categoria);
    }
}
