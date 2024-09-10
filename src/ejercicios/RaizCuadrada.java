package ejercicios;

public class RaizCuadrada {

    public static void main(String[] args) {
        int a = 49;
        double x = a/2;
        for (int j = 1; j <= 4; j++)
        {   x = (x + a/x)/2;}
        System.out.println("La raiz del nro " + a + " es "+ String.format("%.2f", x));
    }
}
