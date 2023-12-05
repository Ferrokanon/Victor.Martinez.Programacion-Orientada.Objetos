package edu.VicH.RetoFinal.process;

import java.util.Random;


//** Desarrollo de la clase CPU, encargada de mostrar la logica por la cual la computadora interactuará con el tablero y con el usuario humano
//** SE DESARROLLA POR MEDIO DE UNA MAQUINA DE ESTADO


public class CPU {
    public void realizarJugada(char[][] tablero, char x) {
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
}
