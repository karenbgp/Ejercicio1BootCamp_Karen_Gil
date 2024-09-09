package ejercicios;

public class InversionNro {

    public static void main(String[] args) {

        int numero=54321;
        int invertido = 0;
        int resto;

        while (numero > 0) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }

        System.out.println("Número invertido: " + invertido);
    }
}
