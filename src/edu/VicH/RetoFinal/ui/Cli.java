package edu.VicH.RetoFinal.ui;

import edu.VicH.RetoFinal.process.CPU;
import edu.VicH.RetoFinal.process.Scoreboard;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Cli {
    private Scanner scanner;
    private Scoreboard scoreboard;
    private String nombreJugador1;
    private String nombreJugador2;
    private Map<String, Integer> victoriasPorJugador;
    private int victoriasJugador1;
    private int victoriasJugador2;
    private int empates;

    public Cli() {
        this.scanner = new Scanner(System.in);
        this.victoriasPorJugador = new HashMap<>();
        this.victoriasJugador1 = 0;
        this.victoriasJugador2 = 0;
        this.empates = 0;
    }


    public void mostrarMenuIdiomas() {
        System.out.println("Selecciona tu idioma / Select your language");
        System.out.println("1. English");
        System.out.println("2. Español");
        System.out.print("Choice / Elección: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                mostrarTextoEnIngles();
                break;
            case 2:
                mostrarTextoEnEspanol();
                break;
            default:
                System.out.println("Selección inválida / Invalid selection");
                return;
        }
    }

    private void mostrarTextoEnIngles() {
        EnglishLanguage.loadLanguage();
        System.out.println(EnglishLanguage.getTranslation("ticTacToe"));
        System.out.println(EnglishLanguage.getTranslation("welcomeToGame"));
        iniciarJuego(new char[0][]);
    }

    private void mostrarTextoEnEspanol() {
        SpanishLanguage.loadLanguage();
        System.out.println(SpanishLanguage.getTranslation("ticTacToe"));
        System.out.println(SpanishLanguage.getTranslation("welcomeToGame"));
        iniciarJuego(new char[0][]);
    }


    public void iniciarJuego(char[][] nuevoTablero) {
        mostrarTitulo();
        mostrarBienvenida();
        int modoJuego = mostrarMenuModoJuego();

        scanner.nextLine();

        nombreJugador1 = pedirNombreJugador("Jugador 1");
        nombreJugador2 = (modoJuego == 1) ? pedirNombreJugador("Jugador 2") : "Computadora";

        scoreboard = new Scoreboard(nombreJugador1, nombreJugador2);

        char[][] tablero = inicializarTablero();
        boolean esTurnoJugador1 = true;

        while (!esEmpate(tablero) && !hayGanador(tablero)) {
            imprimirTablero(tablero);

            if (esTurnoJugador1) {
                System.out.println(nombreJugador1 + ", es tu turno (X)");
                realizarJugada(tablero, 'X');
            } else {
                System.out.println(nombreJugador2 + ", es tu turno (O)");
                if (nombreJugador2.equals("Computadora")) {
                    CPU cpu = new CPU();
                    cpu.realizarJugada(tablero, 'O');
                } else {
                    realizarJugada(tablero, 'O');
                }
            }
            esTurnoJugador1 = !esTurnoJugador1;
        }

        imprimirTablero(tablero);
        determinarGanador(tablero);
    }

    private void determinarGanador(char[][] tablero) {
        String ganador = obtenerGanador(tablero);

        if (ganador != null) {
            System.out.println("¡" + ganador + " ha ganado!");
            if (ganador.equals(nombreJugador1)) {
                victoriasJugador1++;
            } else {
                victoriasJugador2++;
            }
        } else {
            System.out.println("¡El juego ha terminado en empate!");
            empates++;
        }

        mostrarRegistroResultados();
        pedirJugarOtraVez();
    }

    private void mostrarRegistroResultados() {
        System.out.println("Registro de Resultados:");
        System.out.println("Victorias de " + nombreJugador1 + ": " + victoriasJugador1);
        System.out.println("Victorias de " + nombreJugador2 + ": " + victoriasJugador2);
        System.out.println("Empates: " + empates);
    }

    private void pedirJugarOtraVez() {
        System.out.print("¿Deseas jugar otra vez? (S/N): ");
        String respuesta = scanner.nextLine().toUpperCase();
        if (respuesta.equals("S")) {
            char[][] nuevoTablero = inicializarTablero();
            iniciarJuego(nuevoTablero);
        } else {
            System.out.println("¡Gracias por jugar!");
        }
    }

    private void mostrarTitulo() {
        System.out.println("******************");
        System.out.println("*  TIC TAC TOE   *");
        System.out.println("******************");
        System.out.println();
    }

    private void mostrarBienvenida() {
        System.out.println("¡Bienvenido al juego Tic Tac Toe!");
    }

    private int mostrarMenuModoJuego() {
        System.out.println("Modos de Juego:");
        System.out.println("1. Jugador vs Jugador");
        System.out.println("2. Jugador vs Computadora");
        System.out.print("Selecciona el modo de juego: ");
        return scanner.nextInt();
    }

    private String pedirNombreJugador(String jugador) {
        System.out.print("Ingresa el nombre de " + jugador + ": ");
        return scanner.nextLine();
    }

    private char[][] inicializarTablero() {
        return new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    }

    private void imprimirTablero(char[][] tablero) {
        System.out.println("  A   B   C");
        System.out.println("1 " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2]);
        System.out.println("  ---------");
        System.out.println("2 " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2]);
        System.out.println("  ---------");
        System.out.println("3 " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2]);
    }

    private boolean esEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean hayGanador(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != ' ' && tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2]) {
                return true; // Verificar filas
            }
            if (tablero[0][i] != ' ' && tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i]) {
                return true; // Verificar columnas
            }
        }
        if (tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) {
            return true; // Verificar diagonal principal
        }
        if (tablero[0][2] != ' ' && tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0]) {
            return true; // Verificar diagonal secundaria
        }
        return false;
    }

    private String obtenerGanador(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            // Verificar filas
            if (tablero[i][0] != ' ' && tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2]) {
                return (tablero[i][0] == 'X') ? nombreJugador1 : nombreJugador2;
            }
            // Verificar columnas
            if (tablero[0][i] != ' ' && tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i]) {
                return (tablero[0][i] == 'X') ? nombreJugador1 : nombreJugador2;
            }
        }
        // Verificar diagonales
        if (tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) {
            return (tablero[0][0] == 'X') ? nombreJugador1 : nombreJugador2;
        }
        if (tablero[0][2] != ' ' && tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0]) {
            return (tablero[0][2] == 'X') ? nombreJugador1 : nombreJugador2;
        }
        return null; // Retorna null si no hay ganador
    }

    private void realizarJugada(char[][] tablero, char simbolo) {
        int fila, columna;
        do {
            System.out.print("Ingresa la coordenada (Ejemplo: A1, B2, C3): ");
            String coordenada = scanner.nextLine().toUpperCase();
            fila = coordenada.charAt(1) - '1';
            columna = coordenada.charAt(0) - 'A';
        } while (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != ' ');

        tablero[fila][columna] = simbolo;
    }

    public static void main(String[] args) {
        edu.VicH.RetoFinal.ui.Cli cli = new edu.VicH.RetoFinal.ui.Cli();
        char[][] nuevoTablero = new char[0][];
        cli.iniciarJuego(nuevoTablero);
        cli.mostrarMenuIdiomas();
    }
}

