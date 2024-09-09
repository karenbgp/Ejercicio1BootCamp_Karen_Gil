package ejercicios;

public class PalindromoNro {

    public static void main(String[] args) {

        int a=1221;
        int invertido = 0;
        int resto;

        while (a > 0) {
            resto = a % 10;
            invertido = invertido * 10 + resto;
            a /= 10;
        }

        a = 1221;
        if (invertido == a)
        { System.out.println("El numero " + a + " es Palindromo");}
        else
        { System.out.println("El numero " + a + " NO es Palindromo");}
    }
}
