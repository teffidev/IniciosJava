//Ingresa tu nombre y apellido por separado, a partir de
//estas variables, debes obtener en una tercera tus inciiales:

package semana_1;

import java.util.Scanner;

public class ScannerIngresoDatos {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        String nombre;
        String apellido;
        String iniciales;

        System.out.println("Ingrese su nombre");
        nombre = scanner.next();

        System.out.println("Ingrese su apellido");
        apellido = scanner.next();

    }

}
