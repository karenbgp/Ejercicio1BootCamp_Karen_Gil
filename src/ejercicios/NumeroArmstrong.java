package ejercicios;

public class NumeroArmstrong {

    public static void main(String[] args) {

        int a = 153;

            int temp = a;
            int dig =0;
            int ultimoDig = 0;
            int suma = 0;

            dig = (int) (Math.log10(a) + 1);
            temp = a;

            while (temp >0){
                ultimoDig = temp % 10;
                suma+= Math.pow(ultimoDig, dig);
                temp = temp / 10;

            }

            if (a == suma){
                System.out.println("El numero " + a + " es Armstrong ");
            }
            else {
                System.out.println("El numero " + a + " NO es Armstrong ");
            }
    }
}
