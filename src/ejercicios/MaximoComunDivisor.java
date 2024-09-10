package ejercicios;

public class MaximoComunDivisor {

    public static void main(String[] args) {

        int a = 48;
        int b = 18;
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("El Máximo comun divisor es " + a);

    }
}
