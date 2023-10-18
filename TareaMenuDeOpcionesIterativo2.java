import java.util.Scanner;

public class TareaMenuDeOpcionesIterativo2 {
    public static void main(String[] args) {

        //Empezamos creando las clases tanto de inteeger como de String para los nombres
        int menu = 0;
        String a = "Agregar", b = "Actualizar", c = "Consultar", d = "Borrar", e = "Salir";
        int aa = 1, bb = 2, cc = 3, dd = 4, ee = 5;

        //Utilizando el metodo scanner, le pediremos a la consola que nos pregunte que chingados queremos
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa de acqualovers ¿que deseas hacer?");
        int respuesta = scanner.nextInt();

        if (respuesta == Integer.parseInt(null)){
            System.out.println("Debe decirnos que hacer....");
        } else {
            do {
                switch (menu){
                    case 1:
                        System.out.println("Aqualover agregado exitosamente");
                    case 2:
                        System.out.println("Aqualover actualizado exitosamente");
                    case 3:
                        System.out.println("Aqualover consultado exitosamente");
                    case 4:
                        System.out.println("Aqualover eliminado exitosamente");
                    case 5:
                        System.out.println("El programa se cerrará en breve");
                }
            } while (ee == Integer.valueOf(5));
            System.out.println("e = " + e);
        }

    }
}
