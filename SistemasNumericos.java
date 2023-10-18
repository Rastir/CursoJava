import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "No seas puto, tu sabes lo que va aquí");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,  "No mames we!");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de  = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b1100100;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de = " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHexadecimal = "numero hexadecimal de = " + numeroOctal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje +="\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
