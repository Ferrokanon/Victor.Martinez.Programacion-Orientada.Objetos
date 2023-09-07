package VicH.reto3.ui;

import java.util.Scanner;

public class ConversionDeUnidades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("** Programa de Conversión de Unidades **");
            mostrarMenu();

            System.out.print("Tipo de conversión (a/b/c/d/e/f): ");
            char opcion = scanner.next().charAt(0);

            if (opcion == 'a' || opcion == 'b' || opcion == 'c' || opcion == 'd' || opcion == 'e' || opcion == 'f') {
                System.out.print("Número a convertir: ");
                int numero = scanner.nextInt();

                String resultado = realizarConversion(numero, opcion);
                System.out.println("Respuesta: El número " + numero + " en base a " + opcion + " es: " + resultado);
            } else {
                System.out.println("Opción no válida");
            }

            System.out.print("¿Desea realizar otra conversión (s/n)? ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("¡Programa de Conversión de Unidades finalizado!");
    }

    public static void mostrarMenu() {
        System.out.println("a. Convertir de Decimal a Binario");
        System.out.println("b. Convertir de Decimal a Octal");
        System.out.println("c. Convertir de Decimal a Hexadecimal");
        System.out.println("d. Convertir de Binario a Decimal");
        System.out.println("e. Convertir de Octal a Decimal");
        System.out.println("f. Convertir de Hexadecimal a Decimal");
    }

    public static String realizarConversion(int numero, char opcion) {
        String resultado = "";

        if (opcion >= 'a' && opcion <= 'c') {
            resultado = convertirDecimal(numero, opcion);
        } else if (opcion >= 'd' && opcion <= 'e') {
            resultado = convertirSistema(numero, opcion);
        } else if (opcion == 'f') {
            resultado = convertirSistema(numero, opcion);
        }
        return resultado;
    }

    public static String convertirDecimal(int numero, char opcion) {
        if (opcion == 'a') {
            return Integer.toBinaryString(numero);
        } else if (opcion == 'b') {
            return Integer.toOctalString(numero);
        } else if (opcion == 'c') {
            return Integer.toHexString(numero);
        }
        return "";
    }

    public static String convertirSistema(int numero, char opcion) {
        if (opcion == 'd') {
            return Integer.toString(numero, 2);
        } else if (opcion == 'e') {
            return Integer.toString(numero, 8);
        } else if (opcion == 'f') {
            return Integer.toString(numero, 16);
        }
        return "";
    }
}

