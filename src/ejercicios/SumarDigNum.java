package ejercicios;

public class SumarDigNum {

    public static void main(String[] args) {

        int a=5678;
        int sumaDig = 0;
        int resto;

        while (a > 0) {
            resto = a % 10;
            sumaDig = sumaDig + resto;
            a /= 10;
        }

        System.out.println("La suma de digitos es: " + sumaDig);
    }
}
