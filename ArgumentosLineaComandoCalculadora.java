public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {
        if (args.length != 3){
            System.err.println("Por favor ingrasar una operación" +
                            "(suma, resta, div o multi y 2 numeros");
            System.exit(-1);
        }
        String operación = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;
        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);

        }catch (NumberFormatException e){
            System.err.println("Cuidado a y b debe ser enteros, vuelva a intentar");
            System.exit(-1);
        }
        switch (operación){
            case "suma":
                resultado = (a + b);
                break;
            case "resta":
                resultado = (a - b);
                break;
            case "div":
                if (b == 0){
                    System.err.println("no se puede dividir por 0");
                    System.exit(-1);
                }
                resultado = ((double) a / b);
                break;
            case "multipli":
                resultado = (a * b);
                break;
            default:
                resultado =(a+b);

        }
        System.out.println("Resultado de la operación '" + operación + "' es: " + resultado);
    }
}
