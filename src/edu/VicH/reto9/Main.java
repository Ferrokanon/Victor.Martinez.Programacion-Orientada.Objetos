package edu.VicH.reto9;

import edu.VicH.reto9.process.Ayudante;
import edu.VicH.reto9.ui.Cli;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Genera una lista de 5 Ayudantes aleatorios utilizando la interfaz Cli
        List<Ayudante> listaAyudantes = Cli.generarAyudantesAleatorios(5);

        // Imprime los detalles de los Ayudantes utilizando la interfaz Cli
        Cli.imprimirDetallesAyudantes(listaAyudantes);
    }
}
