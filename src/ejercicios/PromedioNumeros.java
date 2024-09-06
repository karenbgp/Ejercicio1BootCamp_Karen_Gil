package ejercicios;

public class PromedioNumeros {

    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        int c = 13;


        double prom = ((a+b+c)/3.0);
        System.out.println("El promedio de los numeros es: "+ String.format("%.2f", prom));

    }
}
