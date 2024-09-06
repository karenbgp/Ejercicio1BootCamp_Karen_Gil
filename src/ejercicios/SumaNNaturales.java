package ejercicios;

public class SumaNNaturales {
    public static void main(String[] args) {
        int N = 50;
        int suma = 0;
        for (int i=0;i<=N;i++)
        {
            suma = suma + i;
        }

        System.out.println("La suma de los N numeros naturales da como resultado: " + suma);
    }
}
