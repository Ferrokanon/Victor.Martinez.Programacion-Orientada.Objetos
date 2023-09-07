package VicH.reto1.ui;

import java.util.Scanner;

public class CLI {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para entrada del usuario

        System.out.println("SELECCIONA LA OPERACIÓN DESEADA:");
        System.out.println("1. Suma:");
        System.out.println("2. Resta:");
        System.out.println("3. Multiplicacion:");
        System.out.println("4. Division:");
        System.out.println("5. Moudulo:");
        System.out.println("6. Salir");

        int opcionMenu = scanner.nextInt(); // Leer la opción del usuario

        // Aquí puedes realizar acciones en función de la opción seleccionada por el usuario

        // No olvides cerrar el objeto Scanner al finalizar
        scanner.close();
    }

    public static void main(String[] args) {
        showMenu(); // Llama a showMenu() desde el método main
    }
}
