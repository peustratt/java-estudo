package e03_paises;

public class Paises {
    public static void main(String[] args) {
        String[] cidadesPE = { "Recife", "Gravatá", "Caruaru", "Carpina", "Timbaúba" },
                cidadesPB = { "João Pessoa", "Campina Grande", "Patos", "Boqueirão", "Cabaceiras" },
                cidadesAL = { "Maceio", "Maragogi", "Varzea do Una", "Delmiro Gouveia", "Arapiraca" },
                cidadesRN = { "Natal", "Tibal do Sul", "Pipa", "Ponta Negra", "Morro do Careca" },
                cidadesCE = { "Fortaleza", "Cumbuco", "Jericoacoara", "Genipabu", "Forte" };

        Estado[] estados = {
                new Estado("Pernambuco", "Recife", cidadesPE, 98800),
                new Estado("Paraiba", "João Pessoa", cidadesPB, 56500),
                new Estado("Alagoas", "Maceio", cidadesAL, 40250),
                new Estado("Rio Grande do Norte", "Natal", cidadesRN, 45450),
                new Estado("Ceará", "Fortaleza", cidadesCE, 250450)
        };

        Pais pais01 = new Pais("Brasil", "Brasília", estados);

        pais01.imprimeDados();
        System.out.println("Numero de cidades: " + pais01.obterQuantidadeCidades());
        System.out.println("O maior estado: " + pais01.obterMaiorEstado().nome);
    }
}
