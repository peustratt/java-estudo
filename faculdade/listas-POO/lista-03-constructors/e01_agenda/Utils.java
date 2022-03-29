package e01_agenda;

public class Utils {
    public static String formataCelular(String celular) {
        return String.format("(%s) %s %s-%s (celular)", celular.substring(0, 2), celular.substring(2, 3), celular.substring(3, 7), celular.substring(7));
    }

    public static String formataCpf(String cpf) {
        return String.format("%s.%s.%s-%s (CPF)", cpf.substring(0, 3), cpf.substring(3, 6), cpf.substring(6, 9), cpf.substring(9, 11));
    }
}
