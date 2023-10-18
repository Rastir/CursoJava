public class SentenciaifElse {
    public static void main(String[] args) {

        float promedio = 3.8f;

        if (promedio >= 6.5) {
            System.out.println("Felicitaciones, excelente promedio = ");
        } else if (promedio >= 6.0) {
            System.out.println("Muy bien promedio");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio");
        } else if (promedio > 5.0) {
            System.out.println("Necesitas un poco más de esfuerzo");
        } else if (promedio >= 4.0) {
            System.out.println("Necesitas estudiar mas");
        } else {
            System.out.println("Reprobado!");
        }
        System.out.println("Tu promedio es:  = " + promedio);
    }
}
