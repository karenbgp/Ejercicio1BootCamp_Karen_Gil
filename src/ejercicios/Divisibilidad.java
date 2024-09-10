package ejercicios;

public class Divisibilidad {

    public static void main(String[] args) {

        int num = 45;
        int a = 2;
        int b = 3;
        int c = 5;

        int numeros [] = {a, b, c};

        for (int i=0;i<numeros.length;i++){

            if (num % numeros[i] == 0){
                System.out.println("El numero " + num + " es divisible por " + numeros[i]);
            }
            else {
                System.out.println("El numero " + num + " NO es divisible por " + numeros[i]);
            }
        }





    }
}
