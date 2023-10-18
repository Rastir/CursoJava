import javax.swing.*;
import java.util.Scanner;

public class TareaNombreFamiliares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombreA, nombreA2 = null, nombreB, nombreB2, nombreC, nombreC2, resultado;

        try {
            System.out.println("ingrese un nombre de familiar");
            nombreA = scanner.nextLine();
            nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length() - 2);
        } catch (Exception e) {

            System.out.println("Ingresa un nombre, no un numero");
            main(args);
            System.exit(0);
        }

        try {
            System.out.println("ingrese otro nombre de familiar");
            nombreB = scanner.nextLine();
            nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length() - 2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
            try {
                System.out.println("ingrese un ultimo nombre de familiar");
                nombreC = scanner.nextLine();
                nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length() - 2);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

                resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

                System.out.println("resultado = " + resultado);
            }
        }

