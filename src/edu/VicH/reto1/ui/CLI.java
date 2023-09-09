package edu.VicH.reto1.ui;

import edu.VicH.reto1.process.Calculator; // Importa la clase Calculator desde el paquete process
import java.util.Scanner;

public class CLI {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SELECCIONA LA OPERACIÓN DESEADA:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.println("6. Salir");

        int opcionMenu = scanner.nextInt();

        switch (opcionMenu) {
            case 1:
                realizarOperacion("suma");
                break;
            case 2:
                realizarOperacion("resta");
                break;
            case 3:
                realizarOperacion("multiplicacion");
                break;
            case 4:
                realizarOperacion("division");
                break;
            case 5:
                realizarOperacion("modulo");
                break;
            case 6:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        scanner.close();
    }

    public static void realizarOperacion(String operacion) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número:");
        int num2 = scanner.nextInt();

        int resultado = 0;

        switch (operacion) {
            case "suma":
                resultado = Calculator.sumaEnteros(num1, num2);
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case "resta":
                resultado = Calculator.restaEnteros(num1, num2);
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case "multiplicacion":
                resultado = Calculator.multiplicacionEnteros(num1, num2);
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            case "division":
                if (num2 != 0) {
                    resultado = Calculator.divisionEnteros(num1, num2);
                    System.out.println("Resultado de la división: " + resultado);
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            case "modulo":
                if (num2 != 0) {
                    resultado = Calculator.moduloEnteros(num1, num2);
                    System.out.println("Resultado del módulo: " + resultado);
                } else {
                    System.out.println("Error: Módulo por cero.");
                }
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }

        scanner.close();
    }

    public static void main(String[] args) {
        showMenu();
    }
}
