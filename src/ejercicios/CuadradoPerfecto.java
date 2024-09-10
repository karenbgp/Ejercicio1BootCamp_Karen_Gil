package ejercicios;

public class CuadradoPerfecto {

    public static void main(String[] args) {
        int a = 64;
        double valor, rest;

        valor = Math.sqrt(a);
        rest = valor;


        if (rest % 2 == 0) {
            if (valor * valor == a) {
                System.out.print(a + " es cuadrado Perfecto");
            }
        } else {
            System.out.print(a + " NO es cuadrado Perfecto");
        }
    }
}
