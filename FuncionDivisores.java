package semana_1;

import java.util.Scanner;

public class FuncionDivisores {

    public static boolean esDivisible (int numero1, int numero2) {

        boolean respuesta= true;

        for (int i = 2; i < numero1; i++) {
            if (numero1 % i == 0) {
                respuesta = true;
            }else if (numero2 % i == 1){
                respuesta = false;
            }
        }
        return respuesta;
    }

    public static void main(String[] args) {

        System.out.println("Vamos a probar si los numeros son divisibles");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese un numero: ");
        int numero2 = scanner.nextInt();

        System.out.println(esDivisible(numero1, numero2));
    }

}