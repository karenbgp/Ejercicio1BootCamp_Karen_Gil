package ejercicios;

public class CalcPotencia {
    public static void main(String[] args) {

        int a = 2;
        int b = 8;
        double potencia;

        potencia = Math.pow(a,b);

        System.out.println("El calculo de la potencia de " + a + " elevado a la " + b + " da como resultado: " + String.format("%.2f", potencia));


    }
}
