package semana_1;

public class CompararCadenaTexto {

    public static void main(String[] args) {

        String nombre1 = "Ana";
        String nombre2 = "Lore";

        //nombre1 = nombre1.toUpperCase();
        //nombre2 = nombre2.toUpperCase();


        if (nombre1.equals("Ana")) {
            System.out.println("Perefecto, son los mismos!");
        }else {
            System.out.println("Lo siento, no coincide.");
        }

        if (nombre2.equals("Lore")) {
            System.out.println("Excelente, son los mismos!");
        }else {
            System.out.println("Lo sentimos, nada que ver con el otro.");
        }

    }

}
