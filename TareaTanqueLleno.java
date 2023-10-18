import java.util.Scanner;

public class TareaTanqueLleno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //solicitar estado del tanque
        System.out.println("Ingrese la capacidad actual del tanque en litros: ");
        double capacidadActual = sc.nextDouble();

        //Determinar el estado del tanque
        String estado;
        if (capacidadActual == 70){
            estado = "Lleno";
        } else if (capacidadActual >= 60 ){
            estado = "Casi lleno";
        } else if (capacidadActual >= 40) {
            estado = "3/4";
        } else if (capacidadActual >= 35) {
            estado = "Medio tanque";
        } else if (capacidadActual >= 20) {
            estado = "Suficiente";
        } else {
            estado = "Insuficiente";
        }


        System.out.println("El estado del tanque es: "+ estado);
    }
}