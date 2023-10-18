import java.util.Scanner;

public class TareaNotasDeAlumnos {
    public static void main(String[] args) {

        /* Con el metodo main argumentamos y utiliamos el metodo Scanner para pedir las notas finales de nuestros
         alumnos*/
        Scanner scanner = new Scanner(System.in);

        // Imprimiendo en consola solicitamos que nos diga el número de notas a evaluar y a su vez con un arreglo
        //pedimos que nos almacene 20 notas
        System.out.println("Ingrese la cantidad de notas a promediar");
        double [] notas = new double[20];

        // Ahora agregamos todas las variables solicitadas
        double sumaTotal = 0;
        double sumaMayores = 0;
        double sumaMenores = 0;

        // Utilizamos un int para contar cuantas notas tenemos de cada uno, ya sea mayor o menor
        int contadorMayor = 0;
        int contadorMenor = 0;
        int contadorUnos = 0;

        // Ahora si pedimos que se nos pida las 20 notas a promediar
        for (int i = 0; i < 20; i++) {
            System.out.println("ingrese la nota " + (i + 1) + ": ");

            // Importante tomar la nota y combertirla a un double pués arriba está plasmada como un entero
            double nota = scanner.nextDouble();
            // Agregamos la condición, si es 0 salir del programa
            if (nota == 0) {
                System.out.println("Error: nota invalida");
                break;
                // Damos la orden para pedir el almacenamiento de las notas y a su vez aumentamos los contadores
            } else if (nota < 1 || nota > 7) {
                System.out.println("Advertencia: nota fuera del rango");
                break;
                // Si la nota cumple con las condiciones se almacena y actualiza las variables
            } else {
                notas[i] = nota;
                sumaTotal += nota;
                if (nota > 5) {
                    sumaMayores += nota;
                    contadorMayor++;
                } else if (nota < 4) {
                    sumaMenores += nota;
                    contadorMenor++;
                }
                if (nota == 1) {
                    contadorUnos++;
                }
            }
        }
        // calculamos los promedios con los valores double previamente almacenados
        double promedioTotal = (sumaTotal / 20);
        double promedioMayor = (sumaMayores / contadorMayor);
        double promedioMenor = (sumaMenores / contadorMenor);

        // imprimimos resultados
        System.out.println("El promedio total de las notas es:  = " + promedioTotal);
        System.out.println("Hay un total de " + contadorMayor + " alumnos con notas mayores a 5 con el promedio de = " + promedioMayor);
        System.out.println("Hay un total de " + contadorMenor + " alumnos con notas menores a 4 con el promedio de = " + promedioMenor);
        System.out.println("La cantidad de notas 1 es = " + contadorUnos);
    }
}