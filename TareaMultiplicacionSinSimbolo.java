import java.util.Scanner;

public class TareaMultiplicacionSinSimbolo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el numero a multiplicar");
        int a = scanner.nextInt();

        System.out.println("Ingrese el numero por el que será multiplicado");
        int b = scanner.nextInt();

        int resultado = 0;

        for (int i = 0; i < Math.abs(b); i++){
            resultado += a;
        }

        if ((a < 0 && b > 0 || ( a > 0 && b < 0))){
            resultado = -resultado;
        }

        System.out.println("El resultado de multiplicar " + a + " por " + b + " es: " + resultado);
    }
}
