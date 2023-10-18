import java.util.Scanner;

public class TareaNumeroMenor {
    public static void main(String[] args) {

        /*Primero se creó la clase y se argumenta con el metodo main, posteriormente se crea la clase int para los enteros*/

        // Se utiliza Scanner para ingresar por consola la cantidad de numeros a comparar //
        Scanner scanner = new Scanner(System.in);

        //Imprimiendo en la consola pedimos que se nos indique la cantidad en este caso "10"
        System.out.println("Ingrese la cantidad de numeros a comparar");
        int cantidad = scanner.nextInt();

        //Con la función max value solicitamos que se nos indique el entero a tener como maximo
        int minimo = Integer.MAX_VALUE;

        /* En el ciclo for le pedimos al sistema que: 1- Solicite el primer numero, almacene e incremente en 1 la
        formula para así despues solicitar el siguiente hasta llegar al valor maximo, en este caso 10*/
        for (int i = 0; i < cantidad; i++) {
            System.out.println("ingresa el numero " + (i + 1) + ":");
            int numero = scanner.nextInt();

            // En el ciclo "If" le decimos al codigo: si nuestro número ingresado en el segundo scanner es menor que
            // todos los ingresador entonces ese se convierte en el más pequeño
            if (numero < minimo) {
                minimo = numero;

            }
        }

        // Solicitamos que imprima la leyenda qué numero es el mas pequeño
        System.out.println("El número más pequeño es: " + minimo);

        // Solicitamos que dependiendo el caso nos imprima si el número más pequeño es menor a 10 o mayor a 10
        if (minimo < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }
    }
}

