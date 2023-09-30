package edu.VicH.reto6_reto5.Process;

import java.util.Scanner;

public class JuegoAdivinarPalabras {

    /**
     * @Autor: Víctor Martínez
     * Este método obtiene una palabra aleatoria basada en el nivel seleccionado.
     *
     * @param nivel El nivel de dificultad del juego.
     * @return Una palabra aleatoria correspondiente al nivel especificado.
     */
    public static String obtenerPalabra(int nivel) {
        // Definición de listas de palabras para diferentes niveles
        String[] palabrasFacil = {"tina", "casa", "piedra", "flor", "lago"};
        String[] palabrasIntermedio = {"elefante", "computadora", "canción", "universo", "montaña"};
        String[] palabrasAvanzado = {"computacional", "ingeniería", "extraterrestre", "elecciones", "revolucionario"};

        // Generación de un índice aleatorio para seleccionar una palabra de la lista
        int indiceAleatorio = (int) (Math.random() * 5);

        // Selección de la palabra basada en el nivel
        switch (nivel) {
            case 1:
                return palabrasFacil[indiceAleatorio];
            case 2:
                return palabrasIntermedio[indiceAleatorio];
            case 3:
                return palabrasAvanzado[indiceAleatorio];
            default:
                return "";
        }
    }

    /**
     * Este método reemplaza una letra en la palabra adivinada si es correcta.
     *
     * @param palabraBase       La palabra que se está adivinando.
     * @param palabraAdivinada  La palabra adivinada hasta el momento.
     * @param letra             La letra propuesta por el jugador.
     * @return La nueva palabra adivinada después de reemplazar las letras correctas.
     */
    public static String reemplazarLetra(String palabraBase, String palabraAdivinada, char letra) {
        // Creación de un StringBuilder a partir de la palabra adivinada
        StringBuilder nuevaPalabra = new StringBuilder(palabraAdivinada);

        // Recorre la palabra base para verificar si la letra está presente y la reemplaza en la palabra adivinada
        for (int i = 0; i < palabraBase.length(); i++) {
            if (palabraBase.charAt(i) == letra) {
                nuevaPalabra.setCharAt(i, letra);
            }
        }

        // Devuelve la nueva palabra adivinada
        return nuevaPalabra.toString();
    }
}
