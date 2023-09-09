package edu.VicH.reto3.ui;

import java.util.Scanner;
import edu.VicH.reto3.process.ConversionDeUnidades;

public class cli {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            showMenu();

            char opcion = scanner.next().charAt(0);

            if (opcion == 'a' || opcion == 'b' || opcion == 'c' || opcion == 'd' || opcion == 'e' || opcion == 'f') {
                System.out.print("Número a convertir: ");
                int numero;
                try {
                    numero = scanner.nextInt();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Error: Ingrese un número válido.");
                    scanner.nextLine();
                    continuar = 's';
                    continue;
                }

                String resultado = ConversionDeUnidades.realizarConversion(numero, opcion);
                System.out.println("Respuesta: El número " + numero + " en base a " + opcion + " es: " + resultado);
            } else {
                System.out.println("Opción no válida");
            }

            System.out.print("¿Desea realizar otra conversión (s/n)? ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("¡Programa de Conversión de Unidades finalizado!");
    }

    public static void showMenu() {
        System.out.println("** Programa de Conversión de Unidades **");
        ConversionDeUnidades.mostrarMenu();
        System.out.print("Tipo de conversión (a/b/c/d/e/f): ");
    }
}
