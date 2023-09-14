package edu.VicH.reto1.ui;

import java.util.Random;
import java.util.Scanner;

public class CLI {
    private static Random scanner;

    public static void showMenu() {

        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para entrada del usuario

        System.out.println("SELECCIONA LA OPERACIÓN DESEADA:");
        System.out.println("1. Suma:");
        System.out.println("2. Resta:");
        System.out.println("3. Multiplicacion:");
        System.out.println("4. Division:");
        System.out.println("5. Moudulo:");
        System.out.println("6. Salir");

        int opcionMenu = scanner.nextInt();


    }

}
