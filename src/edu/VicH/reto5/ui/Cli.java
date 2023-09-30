
package edu.VicH.reto5.ui;

        import edu.VicH.reto5.Process.JuegoAdivinarPalabras;

        import java.util.Scanner;

public class Cli {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al Juego de Adivinar Palabras!");

        while (true) {
            System.out.println("Elige un nivel (1: Fácil, 2: Intermedio, 3: Avanzado, 0: Salir):");
            int nivel = scanner.nextInt();

            if (nivel == 0) {
                System.out.println("Gracias por jugar. ¡Hasta luego!");
                break;
            }

            String palabraBase = JuegoAdivinarPalabras.obtenerPalabra(nivel);
            String palabraAdivinada = "X".repeat(palabraBase.length());

            System.out.println("Palabra a adivinar: " + palabraAdivinada);

            while (!palabraAdivinada.equals(palabraBase)) {
                System.out.print("Introduce una letra: ");
                char letra = scanner.next().charAt(0);

                if (palabraBase.contains(String.valueOf(letra))) {
                    palabraAdivinada = JuegoAdivinarPalabras.reemplazarLetra(palabraBase, palabraAdivinada, letra);
                    System.out.println("Palabra adivinada: " + palabraAdivinada);
                } else {
                    System.out.println("¡INTENTALO DE NUEVO!!!!");
                }
            }

            System.out.println("¡Has adivinado la palabra!");
        }
    }
}


