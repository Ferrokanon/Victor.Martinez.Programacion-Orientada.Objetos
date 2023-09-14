package VicH.reto2.Figuras.process;

public class Figuras {

    public static void main(String[] args) {
        imprimirlinea();
        imprimirRectangulo();
        imprimirTriangulo();
        imprimirPiramide();
        imprimirRombo();

    }

    public static void imprimirlinea() {
        int i = 0;
        while (i < 10) {
            System.out.print("-");
            i++;
        }
        System.out.println();

    }

    public static void imprimirRectangulo() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void imprimirTriangulo() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

    public static void imprimirPiramide() {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("o");
            }
            System.out.println();
        }
    }

    public static void imprimirRombo() {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("9");
            }
            System.out.println();
        }

        for (int i = 10 - 1; i >= 1; i--) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("6");
            }

            System.out.println();
        }
    }

}

