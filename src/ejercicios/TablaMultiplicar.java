package ejercicios;

public class TablaMultiplicar {

    public static void main(String[] args) {

        int a = 7;

        System.out.println("Tabla de multiplicar del nro: " + a);
        for (int i=1;i<=10;i++)
        {
            System.out.println(a + "x" + i + " = " + a*i);
        }
    }
}
