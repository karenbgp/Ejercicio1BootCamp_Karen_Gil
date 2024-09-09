package ejercicios;

public class DecimalBinario {

    public static void main(String[] args) {

        int a = 45;
        String binario;
        binario = Integer.toBinaryString(a);

        System.out.println("El binario de "+ a + " es: "+ binario);
    }
}
