public class PresedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k= 20;

        double promedio = (i + j + k) / 3d;
        System.out.println("Promedio = " + promedio);

        promedio = (i + j + k) / 3d * 10;
        System.out.println("Promedio = " + promedio);

        promedio = --i + j++ + k / 3d * 10; // (13+8) + 66.6
        System.out.println("Promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
