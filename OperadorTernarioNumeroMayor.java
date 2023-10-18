import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1 = s.nextInt();

        System.out.println("ingrese un segundo numero");
        int num2 = s.nextInt();

        System.out.println("ingrese un tercer numero");
        int num3 = s.nextInt();

        System.out.println("ingrese un cuarto numero");
        int num4 = s.nextInt();

        max = (num1 > num2)? num1: num2;
        max = (max > num3)? max: num3;
        max = (max > num4)? max: num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("El numero mayor es: " + max);

    }
}
