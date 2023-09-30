package edu.VicH.reto5.Process;

        import java.util.Scanner;

public class JuegoAdivinarPalabras {

    public  static String obtenerPalabra(int nivel) {
        String[] palabrasFacil = {"tina", "casa", "piedra", "flor", "lago"};
        String[] palabrasIntermedio = {"elefante", "computadora", "canción", "universo", "montaña"};
        String[] palabrasAvanzado = {"computacional", "ingeniería", "extraterrestre", "elecciones", "revolucionario"};

        int indiceAleatorio = (int) (Math.random() * 5);

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

    public static String reemplazarLetra(String palabraBase, String palabraAdivinada, char letra) {
        StringBuilder nuevaPalabra = new StringBuilder(palabraAdivinada);
        for (int i = 0; i < palabraBase.length(); i++) {
            if (palabraBase.charAt(i) == letra) {
                nuevaPalabra.setCharAt(i, letra);
            }
        }
        return nuevaPalabra.toString();
    }
}


