package ejercicios;

public class NumeroPerfecto {

    public static void main(String[] args) {

        int a = 28;
        int suma = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == a) {
            System.out.println("El nro " + a + " es Perfecto");
        } else {
            System.out.println("El nro " + a + " No es perfecto");
        }
    }

}
