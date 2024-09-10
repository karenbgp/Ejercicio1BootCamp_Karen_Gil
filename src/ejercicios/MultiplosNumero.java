package ejercicios;

public class MultiplosNumero {

    public static void main(String[] args) {

        int a = 3;
        int sum = 0;
        int mult;

        for (int i=1;i<=50;i++)
        {
          mult = a * i;
          sum = sum + mult;
        }

        System.out.println("La suma de multiplos del nro " + a + " es " + sum);
    }
}
