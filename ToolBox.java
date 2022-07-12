package semana_1;

import java.util.Scanner;

public class ToolBox {

    public void calculadoraOperacionesBasicas () {
        System.out.println("Esta calculadora permite hacer las operaciones basicas con dos numeros enteros!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero entero: ");
        int numeroUno = scanner.nextInt();

        System.out.println("Ingrese el segundo numero entero: ");
        int numeroDos = scanner.nextInt();

        int suma = numeroUno + numeroDos;
        System.out.println("El resultado de la suma es: " + suma);

        int resta = numeroUno - numeroDos;
        System.out.println("El resultado de la resta es: " + resta);

        int multiplicacion = numeroUno * numeroDos;
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);

        int division = numeroUno / numeroDos;
        System.out.println("El resultado de la division es: " + division);

    }

    public void determinarSiUnNumerosEsPrimo () {
        System.out.println("Veamos si un numero ingresado es Primo o no!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("El número entero que desea saber si es primo o no.");
        int num1 = scanner.nextInt();


        }

                    //ToolBox esPrimo = new ToolBox();
        //        esPrimo.determinarSiUnNumerosEsPrimo();


    public void alimentosPerritos () {
        System.out.println("Alimentemos a los Perritos");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su perrito: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la cantidad de comida en kilogramos que ingiere su perrito: ");
        int cantidadComida = scanner.nextInt();

        System.out.println("");

        for (int i = 1; i < cantidadComida; i++) {

        }

    }

    public void cualGana (String jugador1, String jugador2) {



    }





























}
