import java.util.Scanner;

public class TareaCalcularAreaDeCirculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        System.out.println("Ingrese el diametro de un circulo en centimetros: ");

        double diametro = sc.nextDouble();
        double radio = (diametro/2);
        double pi = Math.PI; // Utiliza la constante PI de la clase Math
        double area = pi * Math.pow(radio, 2); // Corrige el cálculo del área

        System.out.println("El area del circulo es de: = " + area);
    }
}