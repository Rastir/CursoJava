public class PrimitivosFloat {
    public static void main(String[] args) {

        float real = 0.00000000015f; // 0.0000000015f;
        System.out.println("real = " + real);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("Máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float = " + Float.MIN_VALUE);

        double  realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);

        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en byte a = " + Double.SIZE);
        System.out.println("Máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para double = " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
