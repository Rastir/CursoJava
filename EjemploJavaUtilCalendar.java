import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

       // calendario.set(4334, Calendar.SEPTEMBER, 25, 18, 20, 10);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        calendario.set(Calendar.HOUR, 11);
        calendario.set(Calendar.AM_PM, Calendar.AM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("Fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat( "yyy-MMMM-dd HH:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha Con Formato = " + fechaConFormato);
    }
}
