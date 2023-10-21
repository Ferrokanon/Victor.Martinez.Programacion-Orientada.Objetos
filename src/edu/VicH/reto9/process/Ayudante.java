package edu.VicH.reto9.process;
// Importación de la clase Random de la librería java.util
import java.util.Random;
// Definición de la clase Ayudante

/**
 * @Autor: Víctor Martínez
 * Este código cominza a hacer uso de la sentencia "Override" apartir de herencias.
 */
import java.util.Random;

public class Ayudante {
    private int numOjos;
    private String colorPiel;
    private String altura;

    public Ayudante() {
        Random random = new Random();
        this.numOjos = random.nextInt(2) + 1;
        String[] coloresPiel = {"amarilla", "morada"};
        this.colorPiel = coloresPiel[random.nextInt(coloresPiel.length)];
        String[] alturas = {"mediano", "alto"};
        this.altura = alturas[random.nextInt(alturas.length)];
    }

    public int crearObjetos() {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }

    public int arreglarCosas() {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }

    public int nivelDestructivo() {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }

    @Override
    public String toString() {
        return "Número de ojos: " + numOjos + ", Color de piel: " + colorPiel + ", Altura: " + altura + ", Nivel para crear objetos: " + crearObjetos() + ", Nivel para arreglar cosas: " + arreglarCosas() + ", Nivel destructivo: " + nivelDestructivo();
    }

    public static class AyudanteEspecializado extends Ayudante {
        public AyudanteEspecializado() {
            super();
        }

        @Override
        public int crearObjetos() {
            Random random = new Random();
            return random.nextInt(3) + 3;
        }

        @Override
        public int arreglarCosas() {
            Random random = new Random();
            return random.nextInt(2) + 4;
        }

        @Override
        public int nivelDestructivo() {
            Random random = new Random();
            return random.nextInt(2) + 1;
        }
    }
}
