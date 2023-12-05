package edu.VicH.RetoFinal.process;


//** Desarrollo de la clase Scoreboard, el comportamiento de la tabla de puntajes por cada partida

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Scoreboard {
    private String nombreJugador1;
    private String nombreJugador2;
    private int jugador1Victorias;
    private int jugador2Victorias;
    private int cpuVictorias;
    private int empates;

    private Map<String, Integer> victoriasPorJugador;

    public Scoreboard(String nombreJugador1, String nombreJugador2) {
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
        this.victoriasPorJugador = new HashMap<>();
    }

    public void reiniciarPuntajes() {
        jugador1Victorias = 0;
        jugador2Victorias = 0;
        cpuVictorias = 0;
        empates = 0;
        victoriasPorJugador.clear();
    }

    public void actualizarPuntajes(String ganador) {
        switch (ganador) {
            case "Jugador 1":
                jugador1Victorias++;
                actualizarVictorias(nombreJugador1);
                break;
            case "Jugador 2":
                jugador2Victorias++;
                actualizarVictorias(nombreJugador2);
                break;
            case "Computadora":
                cpuVictorias++;
                actualizarVictorias("Computadora");
                break;
            case "Empate":
                empates++;
                break;
        }
    }

    private void actualizarVictorias(String jugador) {
        int victoriasActuales = victoriasPorJugador.getOrDefault(jugador, 0);
        victoriasPorJugador.put(jugador, victoriasActuales + 1);
    }

    public void mostrarResultados() {
        System.out.println("Resultados acumulativos:");
        System.out.println(nombreJugador1 + " - Victorias: " + jugador1Victorias);
        System.out.println(nombreJugador2 + " - Victorias: " + jugador2Victorias);
        System.out.println("Computadora - Victorias: " + cpuVictorias);
        System.out.println("Empates: " + empates);
    }

    public void jugarNuevamente(Scanner scanner) {
        System.out.print("¿Deseas jugar nuevamente? (S/N): ");
        String respuesta = scanner.nextLine().toUpperCase();
        if (respuesta.equals("S")) {
            // No reiniciamos los puntajes, se mantienen acumulados
        }
    }

    public Map<String, Integer> getVictoriasPorJugador() {
        return victoriasPorJugador;
    }
}

