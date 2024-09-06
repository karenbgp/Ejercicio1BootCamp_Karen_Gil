package ejercicios;

public class NumerosPrimos {

    public static void main(String[] args) {

        int a=29;

        boolean esPrimo = true;
            for (int i=2;i<a;i++) {
                if (a%i==0)
                    esPrimo = false;
            }
       if (esPrimo)
           System.out.println("El numero " + a + " es primo");
       else
           System.out.println("El numero: " + a + " no es primo");

    }
}
