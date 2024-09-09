package ejercicios;

public class SerieFibonacci {

    public static void main(String[] args) {

        int N = 10;
        int nro1 = 0;
        int nro2 = 1;
        int fib = '\0';

        System.out.println("Los primeros " + N +" números de la serie Fibonacci son: ");

        for (int i = 2; i < N; i++) {

            fib = nro1 + nro2;
            System.out.print(fib + " ");

            nro1 = nro2;
            nro2 = fib;
        }


    }
}
