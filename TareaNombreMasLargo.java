import javax.swing.*;

public class TareaNombreMasLargo {
    public static void main(String[] args) {

        //Importamos el paquete javax. Swing en el código para poder usar la clase JOptionPane
        // y al mismo tiempo preguntamos por los nombres
        String nombre1 = JOptionPane.showInputDialog("Escribe el nombre y apellido de tu Padre");
        String nombre2 = JOptionPane.showInputDialog("Escribe el nombre y apellido de tu Madre");
        String nombre3 = JOptionPane.showInputDialog("Escribe tu nombre y apellido");

        //Creamos una clase "String" para almacenar el nombre más largo
        String nombreMasLargo = nombre1;

        //Comparamos la longitud del segundo nombre con la del nombre más largo usando el método "length"
        if (nombre2.length() > nombreMasLargo.length()) {
            nombreMasLargo = nombre2;
            if (nombre3.length() > nombre2.length()) {
                nombreMasLargo = nombre3;
            }
        }
        //Finalmente imprimimos el resultado
        System.out.println("El nombre más largo es:  = " + nombreMasLargo);
    }

}
