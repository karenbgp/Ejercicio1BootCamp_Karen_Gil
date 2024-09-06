package ejercicios;

public class AreaTriangulo {

    public static void main(String[] args) {

        int base = 5;
        int alt = 8;


        double area = (0.5 * base * alt);

        System.out.println("El área del triangulo es: " + String.format("%.2f", area));
    }
}
