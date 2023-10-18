import javax.swing.*;
import java.util.Scanner;

public class detalleDeLaFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.nextLine();
        JOptionPane.showInputDialog("Ingrese un nombre para la factura");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese segundo precio de producto");
        double precio2 = scanner.nextDouble();

        double totalBruto = (precio1 + precio2);
        double impuesto = (totalBruto * 0.19);
        double totalNeto = (totalBruto + impuesto);

        String detalle = "La factura " + nombre + " Tiene un total bruto de " + totalBruto + ", con un impuesto de " + impuesto + " y el monto despues de impuesto es de " + totalNeto;

        System.out.println(detalle);
    }
}
