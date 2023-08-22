package edu.VicH.reto1.ui;

import edu.VicH.reto1.preocess.Calculator;

import java.util.Random;
import java.util.Scanner;

public class CLI {
    private static Random scanner;

    public static void showMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("SELECCIONA LA OPERACIÓN DESEADA:");
        System.out.println("1. Suma:");
        System.out.println("2. Resta:");
        System.out.println("3. Multiplicacion:");
        System.out.println("4. Division:");
        System.out.println("5. Moudulo:");
        System.out.println("6. Salir");

        int opcionMenu = scanner.nextInt();

        if (opcionMenu >= 1 && opcionMenu <= 5) {
            System.out.println("Ingrese el primer número: ");
            int num1 = scanner.nextInt(); // Read the first number
            System.out.println("Ingrese el segundo número: ");
            int num2 = scanner.nextInt(); // Read the second number

            switch (opcionMenu) {
                case 1:
                    System.out.println(num1 + "+" + num2 + "=" + Calculator.sumaEnteros(num1, num2));
                    break;
                case 2:
                    System.out.println(num1 + "-" + num2 + "=" + Calculator.restaEnteros(num1, num2));
                    break;
                case 3:
                    System.out.println(num1 + "*" + num2 + "=" + Calculator.multiplicacionEnteros(num1, num2));
                    break;
                case 4:
                    System.out.println(num1 + "/" + num2 + "=" + Calculator.divisionEnteros(num1, num2));
                    break;
                case 5:
                    System.out.println(num1 + "%" + num2 + "=" + Calculator.moduloEnteros(num1, num2));
                    break;
            }
        } else if (opcionMenu == 6) {
            System.out.println("Saliendo del programa.");
        } else {
            System.out.println("Opción inválida.");
        }


    }
}

