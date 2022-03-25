package aquecimento02_cadastro;

public class Utils {
    public static String formatacpf(String cpf) {
        return String.format("%s.%s.%s-%s (CPF)", cpf.substring(0, 3), cpf.substring(3, 6), cpf.substring(6, 9), cpf.substring(9, 11));

    }

    public static String formataCEP(String cep) {
        return String.format("%s-%s (CEP)", cep.substring(0, 5), cep.substring(5, 8));
    } 

    public static String formataCel(String celular) {
        return String.format("(%s) %s %s-%s (celular)", celular.substring(0, 2), celular.substring(2, 3), celular.substring(3, 7), celular.substring(7));
    }
}
