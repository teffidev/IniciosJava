package semana_1;

public class Divisores {

    public static void main(String[] args) {

        //int numEntero1 = 8;
        //int numEntero2 = 4;
        //int divisible;

        //divisible = numEntero1 / numEntero2;

        //System.out.println("El resultado de la division entre " + numEntero1 / numEntero2 + " es " + divisible);

        int num = 128;
        int divisor = 2;
        boolean finished = false;

        while (!finished) {
            if (num % divisor == 0) {
                num /= divisor;
                System.out.println("Encontramos el divisor " + String.valueOf(divisor));
            }else {
                divisor += 1;
            }
            if (num == 1)
                finished = true;
        }
        System.out.println("Terminado!");
    }

}
