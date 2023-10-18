import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

      /*  String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "aqualover";
        passwords[0] = "aqualover";

        usernames[1] = "morelia";
        passwords[1] = "marion";

        usernames[2] = "pepe";
        passwords[2] = "pepe"; */

        String[] usernames = {"aqualover", "morelia", "pepe"};
        String[] passwords = {"aqualover", "marion", "pepe"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario");
        String u = scanner.next();

        System.out.println("ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true : esAutenticado;


            /*if ((usernames[i].equals(u) && passwords[i].equals(p))) {
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bienvenido usuario : ".concat(u).concat("!"):
                "user o contraseña incorrecta pendejo!\nLo sentimos, pero te la pelaste";
        System.out.println("mensaje = " + mensaje);

        /*if (esAutenticado) {
            System.out.println("Bienvenido Usuario: ".concat(u).concat("!"));
        } else {
            System.out.println("user o contraseña incorrecta pendejo!");
            System.out.println("Te la pelaste perro!");
        }*/
    }
}