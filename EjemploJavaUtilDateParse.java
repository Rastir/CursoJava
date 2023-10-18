import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MMMM-dd");

        System.out.println("Ingrese una fecha con formato 'yyyy-MMMM-dd'");
        try {
            Date fecha = format.parse(s.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es despues que fecha2");
            } else if(fecha.before(fecha2)){
                System.out.println("Fecha es anterior que fecha2");
            } else if(fecha.equals((fecha2)));

            if(fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha ingresada por el usuario es despues que la fecha actual");
            } else if (fecha.compareTo(fecha2) < 0){
                System.out.println("Fecha ingresada por el usuario es anterior que la fecha actual");
            } else if(fecha.compareTo(fecha2) == 0){
                System.out.println("Las fechas son iguales");
            }

        } catch (ParseException e) {
            //e.printStackTrace();
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.err.println("El formato debe ser 'yyyy-MM-dd' ");
            System.exit(1);
            //main(args);
        }
    }
}
