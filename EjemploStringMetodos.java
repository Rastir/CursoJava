public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Aldo";

        System.out.println("nombre = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Aldo\") = " + nombre.equals("Aldo"));
        System.out.println("nombre.equals(\"aldo\") = " + nombre.equals("aldo"));
        System.out.println("nombre.equalsIgnoreCase(\"aldo\") = " + nombre.equalsIgnoreCase("aldo"));
        System.out.println("nombre.compareTo(\"Aldo\") = " + nombre.compareTo("Aldo"));
        System.out.println("nombre.compareTo(\"Aldo\") = " + nombre.compareTo("Maria"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1,3));
        System.out.println("nombre.substring(1) = " + nombre.substring(3));

        String trabalengua = "trabalenguas";
        System.out.println("trabalengua = " + trabalengua.replace("a", "."));
        System.out.println("trabalengua = " + trabalengua);
        System.out.println("trabalengua.indexOf('a') = " + trabalengua.indexOf('a'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalengua.indexOf('z') = " + trabalengua.indexOf("lenguas"));
        System.out.println("trabalengua.contains(\"z\") = " + trabalengua.contains("lenguas"));
        System.out.println("trabalengua.startsWith(\"t\") = " + trabalengua.startsWith("t"));
        System.out.println("trabalengua.endsWith(\"as\") = " + trabalengua.endsWith("as"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());

    }
}
