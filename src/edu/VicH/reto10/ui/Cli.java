package edu.VicH.reto10.ui;

import java.util.Scanner;

public class Cli {
    public static int mostrarMenu() {
        System.out.println("Seleccione una operación aritmética:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.println("6. RaizEnesima");
        System.out.println("7. Exponente");
        System.out.println("8. Logaritmo");
        System.out.println("9. Salir del programa");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double[] obtenerOperandos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();
        return new double[]{num1, num2};
    }
}

