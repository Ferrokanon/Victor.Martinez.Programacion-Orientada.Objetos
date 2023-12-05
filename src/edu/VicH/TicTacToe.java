package edu.VicH;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {



    public static void imprimirTablero(char[][] tablero) {
        System.out.println("  A   B   C");
        System.out.println("1 " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2]);
        System.out.println("  ---------");
        System.out.println("2 " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2]);
        System.out.println("  ---------");
        System.out.println("3 " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2]);
    }

    public static char[][] inicializarTablero() {
        return new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    }

    public static String[] asignarJugadores(int modoJuego, Scanner scanner) {
        String[] jugadores = new String[2];
        if (modoJuego == 1) {
            System.out.print("Ingrese el nombre del Jugador 1: ");
            jugadores[0] = scanner.nextLine();
            System.out.print("Ingrese el nombre del Jugador 2: ");
            jugadores[1] = scanner.nextLine();
        } else {
            System.out.print("Ingrese su nombre: ");
            jugadores[0] = scanner.nextLine();
            jugadores[1] = "Computadora";
        }
        return jugadores;
    }

    public static int asignarTurnoInicio() {
        return new Random().nextInt(2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int victoriasJugador1 = 0;
        int victoriasJugador2 = 0;
        int victoriasComputadora = 0;
        int empates = 0;

        char simboloJugador1;

        while (true) {
            System.out.println("TIC TAC TOE");
            System.out.println("¿Qué modo de juego desea?");
            System.out.println("1. Jugador vs Jugador");
            System.out.println("2. Jugador vs Computadora");
            System.out.print("Ingrese el número correspondiente al modo de juego: ");

            int modoJuego = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            if (modoJuego != 1 && modoJuego != 2) {
                System.out.println("Opción inválida. Por favor, elige 1 o 2.");
                continue;
            }

            char simboloJugador2;
            if (modoJuego == 1) {
                simboloJugador1 = 'O'; // Jugador 1 usa 'O' en modo Jugador vs Jugador
                simboloJugador2 = 'X'; // Jugador 2 usa 'X' en modo Jugador vs Jugador
            } else {
                simboloJugador1 = 'O'; // Jugador usa 'O' en modo Jugador vs Computadora
                simboloJugador2 = 'X'; // Computadora usa 'X' en modo Jugador vs Computadora
            }

            char[][] tablero = inicializarTablero();
            imprimirTablero(tablero);

            String[] jugadores = asignarJugadores(modoJuego, scanner);
            int turno = asignarTurnoInicio();
            boolean juegoActivo = true;

            while (juegoActivo) {
                System.out.println(jugadores[turno] + ", es tu turno.");

                if ((modoJuego == 1) || (modoJuego == 2 && turno == 0)) {
                    realizarJugada(tablero, scanner, jugadores[turno], (turno == 0) ? simboloJugador1 : simboloJugador2);
                } else {
                    realizarJugadaComputadora(tablero);
                }

                imprimirTablero(tablero);

                if (hayGanador(tablero)) {
                    System.out.println("¡" + jugadores[turno] + " ha ganado!");
                    if (modoJuego == 1) {
                        if (jugadores[turno].equals("Jugador 1")) {
                            victoriasJugador1++;
                        } else {
                            victoriasJugador2++;
                        }
                    } else {
                        if (jugadores[turno].equals("Jugador")) {
                            victoriasJugador1++;
                        } else {
                            victoriasComputadora++;
                        }
                    }
                    juegoActivo = false;
                } else if (esEmpate(tablero)) {
                    System.out.println("¡Es un empate!");
                    empates++;
                    juegoActivo = false;
                } else {
                    turno = 1 - turno;
                }
            }

            System.out.println("Victoria Jugador 1: " + victoriasJugador1);
            System.out.println("Victoria Jugador 2: " + victoriasJugador2);
            System.out.println("Victoria Computadora: " + victoriasComputadora);
            System.out.println("Empates: " + empates);

            System.out.print("¿Deseas jugar de nuevo? (S/N): ");
            String respuesta = scanner.nextLine().toUpperCase();

            if (respuesta.equals("N")) {
                System.out.println("Gracias por jugar. ¡Hasta luego!");
                break;
            }
        }
    }

    public static void realizarJugada(char[][] tablero, Scanner scanner, String jugador, char simboloJugador1) {
        char simbolo;
        if (jugador.equals("Jugador 1")) {
            simbolo = simboloJugador1;
        } else {
            simbolo = (simboloJugador1 == 'X') ? 'O' : 'X';
        }

        boolean jugadaValida = false;
        while (!jugadaValida) {
            System.out.print("Ingrese la coordenada (Ejemplo: A1, B2, C3): ");
            String coordenada = scanner.nextLine().toUpperCase();

            int fila = coordenada.charAt(1) - '1';
            int columna = coordenada.charAt(0) - 'A';

            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
                tablero[fila][columna] = simbolo;
                jugadaValida = true;
            } else {
                System.out.println("Movimiento inválido. Inténtalo de nuevo.");
            }
        }
    }

    public static void realizarJugadaComputadora(char[][] tablero) {
        // Bloquear jugadas del jugador humano en filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == 'X' && tablero[i][1] == 'X' && tablero[i][2] == ' ') {
                tablero[i][2] = 'O'; // Bloquear la fila i, columna 2 para evitar la victoria del jugador
                return;
            } else if (tablero[i][0] == 'X' && tablero[i][2] == 'X' && tablero[i][1] == ' ') {
                tablero[i][1] = 'O'; // Bloquear la fila i, columna 1 para evitar la victoria del jugador
                return;
            } else if (tablero[i][1] == 'X' && tablero[i][2] == 'X' && tablero[i][0] == ' ') {
                tablero[i][0] = 'O'; // Bloquear la fila i, columna 0 para evitar la victoria del jugador
                return;
            }
        }

        // Bloquear jugadas del jugador humano en columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == 'X' && tablero[1][j] == 'X' && tablero[2][j] == ' ') {
                tablero[2][j] = 'O'; // Bloquear la columna j, fila 2 para evitar la victoria del jugador
                return;
            } else if (tablero[0][j] == 'X' && tablero[2][j] == 'X' && tablero[1][j] == ' ') {
                tablero[1][j] = 'O'; // Bloquear la columna j, fila 1 para evitar la victoria del jugador
                return;
            } else if (tablero[1][j] == 'X' && tablero[2][j] == 'X' && tablero[0][j] == ' ') {
                tablero[0][j] = 'O'; // Bloquear la columna j, fila 0 para evitar la victoria del jugador
                return;
            }
        }

        // Bloquear jugadas del jugador humano en diagonales principales
        if (tablero[0][0] == 'X' && tablero[1][1] == 'X' && tablero[2][2] == ' ') {
            tablero[2][2] = 'O'; // Bloquear la diagonal principal, esquina inferior derecha
            return;
        } else if (tablero[0][0] == 'X' && tablero[2][2] == 'X' && tablero[1][1] == ' ') {
            tablero[1][1] = 'O'; // Bloquear la diagonal principal, centro
            return;
        } else if (tablero[1][1] == 'X' && tablero[2][2] == 'X' && tablero[0][0] == ' ') {
            tablero[0][0] = 'O'; // Bloquear la diagonal principal, esquina superior izquierda
            return;
        }

        // Bloquear jugadas del jugador humano en diagonales secundarias
        if (tablero[0][2] == 'X' && tablero[1][1] == 'X' && tablero[2][0] == ' ') {
            tablero[2][0] = 'O'; // Bloquear la diagonal secundaria, esquina inferior izquierda
            return;
        } else if (tablero[0][2] == 'X' && tablero[2][0] == 'X' && tablero[1][1] == ' ') {
            tablero[1][1] = 'O'; // Bloquear la diagonal secundaria, centro
            return;
        } else if (tablero[1][1] == 'X' && tablero[2][0] == 'X' && tablero[0][2] == ' ') {
            tablero[0][2] = 'O'; // Bloquear la diagonal secundaria, esquina superior derecha
            return;
        }

        // Buscar oportunidades de victoria para la computadora en filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == 'O' && tablero[i][1] == 'O' && tablero[i][2] == ' ') {
                tablero[i][2] = 'O'; // Intentar ganar colocando 'O' en la casilla vacía
                return;
            } else if (tablero[i][0] == 'O' && tablero[i][2] == 'O' && tablero[i][1] == ' ') {
                tablero[i][1] = 'O'; // Intentar ganar colocando 'O' en la casilla vacía
                return;
            } else if (tablero[i][1] == 'O' && tablero[i][2] == 'O' && tablero[i][0] == ' ') {
                tablero[i][0] = 'O'; // Intentar ganar colocando 'O' en la casilla vacía
                return;
            }
        }

        // Buscar oportunidades de victoria para la computadora en columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == 'O' && tablero[1][j] == 'O' && tablero[2][j] == ' ') {
                tablero[2][j] = 'O'; // Intentar ganar colocando 'O' en la casilla vacía
                return;
            } else if (tablero[0][j] == 'O' && tablero[2][j] == 'O' && tablero[1][j] == ' ') {
                tablero[1][j] = 'O'; // Intentar ganar colocando 'O' en la casilla vacía
                return;
            } else if (tablero[1][j] == 'O' && tablero[2][j] == 'O' && tablero[0][j] == ' ') {
                tablero[0][j] = 'O'; // Intentar ganar colocando 'O' en la casilla vacía
                return;
            }
        }

        // Buscar oportunidades de victoria para la computadora en diagonales principales
        if (tablero[0][0] == 'O' && tablero[1][1] == 'O' && tablero[2][2] == ' ') {
            tablero[2][2] = 'O'; // Intentar ganar colocando 'O' en la casilla vacía
            return;
        } else if (tablero[0][0] == 'O' && tablero[2][2] == 'O' && tablero[1][1] == ' ') {
            tablero[1][1] = 'O'; // Intentar ganar colocando 'O' en la casilla vacía
            return;
        } else if (tablero[1][1] == 'O' && tablero[2][2] == 'O' && tablero[0][0] == ' ') {
            tablero[0][0] = 'O'; // Intentar ganar colocando 'O' en la casilla vacía
            return;
        }

        // Buscar oportunidades de victoria para la computadora en diagonales secundarias
        if (tablero[0][2] == 'O' && tablero[1][1] == 'O' && tablero[2][0] == ' ') {
            tablero[2][0] = 'O'; // Intentar ganar colocando 'O' en la casilla vacía
            return;
        } else if (tablero[0][2] == 'O' && tablero[2][0] == 'O' && tablero[1][1] == ' ') {
            tablero[1][1] = 'O'; // Intentar ganar colocando 'O' en la casilla vacía
            return;
        } else if (tablero[1][1] == 'O' && tablero[2][0] == 'O' && tablero[0][2] == ' ') {
            tablero[0][2] = 'O'; // Intentar ganar colocando 'O' en la casilla vacía
            return;
        }

        // Si ninguna jugada estratégica es posible, realizar una jugada aleatoria
        int fila, columna;
        do {
            fila = new Random().nextInt(3);
            columna = new Random().nextInt(3);
        } while (tablero[fila][columna] != ' ');
        tablero[fila][columna] = 'O';
    }

    public static boolean hayGanador(char[][] tablero) {
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

    public static boolean esEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; // Todavía hay casillas vacías, no es empate
                }
            }
        }
        return !hayGanador(tablero); // Si no hay casillas vacías y no hay ganador, es empate
    }
}
