package edu.VicH.RetoFinal.ui;


        import java.util.HashMap;
        import java.util.Map;

public class SpanishLanguage {
    private static final Map<String, String> translations = new HashMap<>();

    static {
        translations.put("title", "******\n*  TRES EN RAYA  *\n******\n");
        translations.put("welcome", "¡Bienvenido al juego Tres en Raya!\n");
        translations.put("gameModes", "Modos de Juego:");
        translations.put("playerVsPlayer", "1. Jugador vs Jugador");
        translations.put("playerVsComputer", "2. Jugador vs Computadora");
        translations.put("selectMode", "Selecciona el modo de juego: ");
        translations.put("enterPlayerName", "Ingresa el nombre de ");
        translations.put("playerX", " Jugador X: ");
        translations.put("playerO", " Jugador O: ");
        translations.put("turnX", ", es tu turno (X)");
        translations.put("turnO", ", es tu turno (O)");
        translations.put("cpuTurn", "Turno de la computadora (O)");
        translations.put("playAgain", "¿Deseas jugar otra vez? (S/N): ");
        translations.put("thanksForPlaying", "¡Gracias por jugar!");
        translations.put("results", "Registro de Resultados:");
        translations.put("victoriesX", "Victorias de Jugador X: ");
        translations.put("victoriesO", "Victorias de Jugador O: ");
        translations.put("draws", "Empates: ");
        translations.put("invalidSelection", "Selección inválida");
        translations.put("coordinatePrompt", "Ingresa la coordenada (Ejemplo: A1, B2, C3): ");
        translations.put("winner", " ha ganado!");
        translations.put("gameDrawn", "¡El juego ha terminado en empate!");
        translations.put("languageSelection", "Seleccione un idioma / Select a language:");
        translations.put("english", "1. English");
        translations.put("spanish", "2. Español / Spanish");
        translations.put("languageChoice", "Ingrese su elección / Enter your choice: ");
        translations.put("translationNotFound", "Traducción no encontrada");
    }

    public static String getTranslation(String key) {
        return translations.getOrDefault(key, "Traducción no encontrada");
    }

    public static void loadLanguage() {
    }
}

