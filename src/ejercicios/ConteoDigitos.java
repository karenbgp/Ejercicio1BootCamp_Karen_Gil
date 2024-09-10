package ejercicios;

public class ConteoDigitos {

    public static void main(String[] args) {

        int a = 987654;
        int temp = a;
        int ultimoDig;
        int cont = 0;

        while (temp >0){
            ultimoDig = temp % 10;
            if (ultimoDig > 0){
                cont = cont + 1;
            }
            temp = temp / 10;

        }

        System.out.println("La cantidad de digitos del nro " + a + " es " + cont);
    }
}
