package ejercicios;

public class SumPares {

    public static void main(String[] args) {

        int a = 1;
        int b = 100;
        double residuo;
        int suma = 0;

        for (int i=a;i<=b;i++)
        {
            residuo = i % 2;
            if (residuo == 0) {
            suma = suma + i;}
        }

           System.out.println("La suma de los pares da como resultado: " + suma);
    }
}
