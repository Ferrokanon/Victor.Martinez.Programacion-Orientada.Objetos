package edu.VicH.reto6_reto5.Process;

import java.util.Scanner;

public class JuegoAdivinarPalabras {

    /** @ Autor Victor **/
    /** El objetivo de este reto es generar una alternativa al reto anterior, tomando a consideracion las posibilidades de la generaci[on de una excepcion **/
    /** Excepcion: Errores en tiempo de ejecucion. Se produce un eror en alguna de las instrucciones del programa **/

    // Obtiene una palabra aleatoria basada en el nivel seleccionado
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

    // Reemplaza una letra en la palabra adivinada si es correcta
    public static String reemplazarLetra(String palabraBase, String palabraAdivinada, char letra) {
        // Creación de un StringBuilder a partir de la palabra adivinada
        StringBuilder nuevaPalabra = new StringBuilder(palabraAdivinada);

        // Recorre la palabra base para verificar si la letra está presente y la reemplaza en la palabra adivinada
        for (int i = 0; i < palabraBase.length(); i++) {
            if (palabraBase.charAt(i) == letra) {
                nuevaPalabra.setCharAt(i, letra);
            }
        }
        return nuevaPalabra.toString(); // Devuelve la nueva palabra adivinada
    }
}



