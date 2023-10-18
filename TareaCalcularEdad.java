import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class TareaCalcularEdad {
    public static void main(String[] args) {

        try {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese fecha de nacimiento en formato 'yyyy-mm-dd' ");

        String userDate = s.nextLine();

        System.out.println("fecha ingresada : " + userDate);


            SimpleDateFormat usrDate = new SimpleDateFormat("yyyy-MM-dd");
            Date date = usrDate.parse(userDate);

            System.out.println("Fecha ingresada en formato : " + userDate);

            LocalDate currentTime = LocalDate.now();
            Period timePassed = Period.between(LocalDate.parse(userDate), currentTime);

            int years = timePassed.getYears();
            int months = timePassed.getMonths();
            int days = timePassed.getDays();

            System.out.println(years + " years," + months + " months and " + days + " days, have past since the date provided");

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
