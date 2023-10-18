
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("No seas puto, tu sabes lo que va aquí");
      //  String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
        } catch (Exception e) {
            System.out.println("No mames we!");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de  = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHexadecimal = "numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;

        System.out.println(mensaje);
    }
}
