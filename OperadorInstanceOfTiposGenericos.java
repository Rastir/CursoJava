public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = new String("creando un objeto de la clase String ... que tal!");
        
        Number num = Integer.valueOf ("7");//7;
        
        Boolean b1 = texto instanceof String;

        System.out.println("texto es del tipo object = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("Texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("texto es del tipo object = " + b1);

        b1 = num instanceof Number;
        System.out.println("texto es del tipo object = " + b1);

        b1 = num instanceof Object;
        System.out.println("texto es del tipo object = " + b1);

        b1 = num instanceof Long;
        System.out.println("Num es del tipo long " + b1);

        b1 = num instanceof Double;
        System.out.println("Num es del tipo double " + b1);

        Number decimal = 45.54f;
        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double: " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float: " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo number: " + b1);




        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);


    }
}
