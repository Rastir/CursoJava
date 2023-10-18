import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "$" + nombreA.substring(nombreA.length()-2);
        int numero;

        try {
            numero = Integer.parseInt(scanner.next());
            System.out.println("numero = " + numero);
        }catch (NumberFormatException e){
            System.out.println("No es un numero, es una cadena");
        }

    }
}