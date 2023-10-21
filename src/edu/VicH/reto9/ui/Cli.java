package edu.VicH.reto9.ui;

import edu.VicH.reto9.process.Ayudante;
import edu.VicH.reto9.process.Ayudante.AyudanteEspecializado;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa la interfaz de línea de comandos (CLI) para un juego con Ayudantes.
 */
public class Cli {

    /**
     * Este método crea una lista de Ayudantes aleatorios (regulares o especializados) y la devuelve.
     *
     * @param cantidad La cantidad de Ayudantes a crear.
     * @return Una lista de Ayudantes generados aleatoriamente.
     */
    public static List<Ayudante> generarAyudantesAleatorios(int cantidad) {
        List<Ayudante> listaAyudantes = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            Ayudante nuevoAyudante;
            // Generar un ayudante regular o especializado aleatoriamente
            double randomValue = Math.random();
            if (randomValue < 0.5) {
                nuevoAyudante = new Ayudante();  // Generar un ayudante regular
            } else {
                nuevoAyudante = new AyudanteEspecializado();  // Generar un ayudante especializado
            }
            listaAyudantes.add(nuevoAyudante);
        }

        return listaAyudantes;
    }

    /**
     * Este método imprime los detalles de los Ayudantes en la lista.
     *
     * @param listaAyudantes La lista de Ayudantes cuyos detalles se imprimirán.
     */
    public static void imprimirDetallesAyudantes(List<Ayudante> listaAyudantes) {
        for (int i = 0; i < listaAyudantes.size(); i++) {
            // Imprime los detalles de cada ayudante en la lista
            System.out.println("Ayudante " + (i + 1) + ": " + listaAyudantes.get(i));
        }
    }

    public static void main(String[] args) {
        List<Ayudante> listaAyudantes = generarAyudantesAleatorios(5);

        imprimirDetallesAyudantes(listaAyudantes);
    }
}

