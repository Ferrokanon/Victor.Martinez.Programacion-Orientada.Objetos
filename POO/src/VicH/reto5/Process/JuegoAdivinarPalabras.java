package VicH.reto5.Process;


import java.util.Scanner;

public class JuegoAdivinarPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al Juego de Adivinar Palabras!");

        while (true) {
            System.out.println("Elige un nivel (1: Fácil, 2: Intermedio, 3: Avanzado, 0: Salir):");
            int nivel = scanner.nextInt();

            if (nivel == 0) {
                System.out.println("Gracias por jugar. ¡Hasta luego!");
                break;
            }

            String palabraBase = obtenerPalabra(nivel);
            String palabraAdivinada = "X".repeat(palabraBase.length());

            System.out.println("Palabra a adivinar: " + palabraAdivinada);

            while (!palabraAdivinada.equals(palabraBase)) {
                System.out.print("Introduce una letra: ");
                char letra = scanner.next().charAt(0);

                if (palabraBase.contains(String.valueOf(letra))) {
                    palabraAdivinada = reemplazarLetra(palabraBase, palabraAdivinada, letra);
                    System.out.println("Palabra adivinada: " + palabraAdivinada);
                } else {
                    System.out.println("¡INTENTALO DE NUEVO!!!!");
                }
            }

            System.out.println("¡Has adivinado la palabra!");
        }
    }

    private static String obtenerPalabra(int nivel) {
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

    private static String reemplazarLetra(String palabraBase, String palabraAdivinada, char letra) {
        StringBuilder nuevaPalabra = new StringBuilder(palabraAdivinada);
        for (int i = 0; i < palabraBase.length(); i++) {
            if (palabraBase.charAt(i) == letra) {
                nuevaPalabra.setCharAt(i, letra);
            }
        }
        return nuevaPalabra.toString();
    }
}
