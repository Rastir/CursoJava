import java.util.Scanner;

public class TareaNumerosOrdenados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Pedimos numeros al usuario
        System.out.println("Ingrese primer numero");
        int a = scanner.nextInt();
        System.out.println("Ingrese segundo numero");
        int b = scanner.nextInt();

        //ordenamos los numeros
        int menor = a;
        int mayor = b;

        if (b > a) {
            menor = b;
            mayor = a;
        }
        System.out.println("Los numeros ordenados son : " + menor + " " + mayor);
    }
}
