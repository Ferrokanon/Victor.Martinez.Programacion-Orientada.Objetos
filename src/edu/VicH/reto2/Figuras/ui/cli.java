package edu.VicH.reto2.Figuras.ui;

import java.util.Scanner;

public class cli {

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SELECCIONA UNA FIGURA:");
        System.out.println("1. Línea");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Pirámide");
        System.out.println("5. Rombo");
        System.out.println("6. Salir");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                imprimirLinea();
                break;
            case 2:
                imprimirRectangulo();
                break;
            case 3:
                imprimirTriangulo();
                break;
            case 4:
                System.out.print("Introduce la altura de la pirámide: ");
                int alturaPiramide = scanner.nextInt();
                imprimirPiramide(alturaPiramide);
                break;
            case 5:
                System.out.print("Introduce la altura del rombo: ");
                int alturaRombo = scanner.nextInt();
                imprimirRombo(alturaRombo);
                break;
            case 6:
                System.exit(0); // Salir del programa
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }

    public static void imprimirLinea() {
        int i = 0;
        while (i < 10) {
            System.out.print("-");
            i++;
        }
        System.out.println();
    }

    public static void imprimirRectangulo() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void imprimirTriangulo() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void imprimirPiramide(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("o");
            }
            System.out.println();
        }
    }

    public static void imprimirRombo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("9");
            }
            System.out.println();
        }

        for (int i = altura - 1; i >= 1; i--) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("6");
            }
            System.out.println();
        }
    }
}

