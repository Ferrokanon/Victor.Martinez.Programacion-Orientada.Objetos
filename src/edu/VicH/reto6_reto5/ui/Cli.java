package edu.VicH.reto6_reto5.ui;

import edu.VicH.reto6_reto5.Process.JuegoAdivinarPalabras;
import java.util.Scanner; // Agrega esta importación
import java.util.InputMismatchException; // Agrega esta importación

public class Cli {

    /**
     * Este método muestra el menú de selección de nivel.
     */
    private static void showMenu() {
        System.out.println("Elige un nivel (1: Fácil, 2: Intermedio, 3: Avanzado, 0: Salir):");
    }

    /**
     * Este método implementa el menú principal del juego.
     */
    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al Juego de Adivinar Palabras!");

        while (true) {
            int nivel = 0;
            try {
                showMenu(); // Muestra el menú de selección de nivel
                nivel = scanner.nextInt();

                if (nivel == 0) {
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    break;
                } else if (nivel < 0 || nivel > 3) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, elige un nivel válido (0, 1, 2 o 3).");
                scanner.nextLine(); // Limpia el búfer de entrada.
                continue;
            }

            String palabraBase = JuegoAdivinarPalabras.obtenerPalabra(nivel);
            String palabraAdivinada = "X".repeat(palabraBase.length());

            System.out.println("Palabra a adivinar: " + palabraAdivinada);

            while (!palabraAdivinada.equals(palabraBase)) {
                System.out.print("Introduce una letra: ");
                char letra = scanner.next().charAt(0);

                if (Character.isLetter(letra)) {
                    if (palabraBase.contains(String.valueOf(letra))) {
                        palabraAdivinada = JuegoAdivinarPalabras.reemplazarLetra(palabraBase, palabraAdivinada, letra);
                        System.out.println("Palabra adivinada: " + palabraAdivinada);
                    } else {
                        System.out.println("¡INTÉNTALO DE NUEVO!");
                    }
                } else if (letra != '0') {
                    System.out.println("Por favor, introduce solo letras o 0 para salir.");
                } else {
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    return; // Sale del juego si se introduce 0.
                }
            }

            System.out.println("¡Has adivinado la palabra!");
        }
    }
}

