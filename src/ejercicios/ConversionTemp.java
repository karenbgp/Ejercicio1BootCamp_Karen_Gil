package ejercicios;

public class ConversionTemp {

    public static void main(String[] args) {
        int c = 25;
        double fact = 1.8;

        double f = (c * 9/5) + 32;

        System.out.println("La temperatura equivalente en grados Fahrenheit para " + c+"°C " + "es: " + String.format("%.2f", f));
    }
}
