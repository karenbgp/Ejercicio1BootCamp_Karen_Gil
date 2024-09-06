package ejercicios;

public class MaximoNumeros {

    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 9;
        int max = 0;

        int numeros [] = {a, b, c};

        for (int i=0;i<numeros.length;i++){

            if (numeros[i] > max){
                max = numeros[i];
            }
        }

        System.out.println("El numero maximo es " + max);



    }
}
