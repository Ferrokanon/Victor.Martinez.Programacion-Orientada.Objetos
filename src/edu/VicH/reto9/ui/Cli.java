package edu.VicH.reto9.ui;


import edu.VicH.reto9.process.Ayudante;
import edu.VicH.reto9.process.Ayudante.AyudanteEspecializado;

import java.util.ArrayList;
import java.util.List;

public class Cli {
    public static void main(String[] args) {
        List<Ayudante> listaAyudantes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            // Generar un ayudante regular o especializado aleatoriamente
            double randomValue = Math.random();
            if (randomValue < 0.5) {
                listaAyudantes.add(new Ayudante());  // Generar un ayudante regular
            } else {
                listaAyudantes.add(new AyudanteEspecializado());  // Generar un ayudante especializado
            }
        }

        for (int i = 0; i < listaAyudantes.size(); i++) {
            // Imprime los detalles de cada ayudante en la lista
            System.out.println("Ayudante " + (i + 1) + ": " + listaAyudantes.get(i));
        }
    }
}
