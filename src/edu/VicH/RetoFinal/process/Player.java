package edu.VicH.RetoFinal.process;

//** Desarrollo de la clase jugador, encargada de mostrar la logica por la cual el usuario interactuará con el tablero


import java.util.Scanner;

public class Player {
    private String nombre;
    private Scanner scanner;

    public Player(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void realizarJugada(char[][] tablero, char simbolo) {
        while (true) {
            System.out.print(nombre + ", ingrese la coordenada (Ejemplo: A1, B2, C3): ");
            String coordenada = scanner.nextLine().toUpperCase();

            int fila = coordenada.charAt(1) - '1';
            int columna = coordenada.charAt(0) - 'A';

            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
                tablero[fila][columna] = simbolo;
                break;
            } else {
                System.out.println("Movimiento inválido. Inténtalo de nuevo.");
            }
        }
    }
}

