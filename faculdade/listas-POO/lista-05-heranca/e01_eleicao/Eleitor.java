package e01_eleicao;

public class Eleitor extends Pessoa {
    private int titulo;
    Eleitor(String nome, String CPF, int titulo){
        super(nome, CPF);
        this.setTitulo(titulo);
    }

    public int getTitulo() {
        return this.titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    public int votar() {
        System.out.println("Digite o seu número do seu candidato: ");
        int voto = Aplicacao.in.nextInt();
        Aplicacao.in.nextLine();
        return voto;
    }
    
}
