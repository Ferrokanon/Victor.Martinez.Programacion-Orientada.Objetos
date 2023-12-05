package edu.VicH.RetoFinal.ui;

import java.util.HashMap;
import java.util.Map;
public class EnglishLanguage {
    private static final Map<String, String> translations = new HashMap<>();

    static {
        translations.put("title", "******\n*  TIC TAC TOE   *\n******\n");
        translations.put("welcome", "Welcome to the Tic Tac Toe game!\n");
        translations.put("gameModes", "Game Modes:");
        translations.put("playerVsPlayer", "1. Player vs Player");
        translations.put("playerVsComputer", "2. Player vs Computer");
        translations.put("selectMode", "Select game mode: ");
        translations.put("enterPlayerName", "Enter the name of ");
        translations.put("playerX", " Player X: ");
        translations.put("playerO", " Player O: ");
        translations.put("turnX", ", it's your turn (X)");
        translations.put("turnO", ", it's your turn (O)");
        translations.put("cpuTurn", "Computer's turn (O)");
        translations.put("playAgain", "Do you want to play again? (Y/N): ");
        translations.put("thanksForPlaying", "Thank you for playing!");
        translations.put("results", "Results Record:");
        translations.put("victoriesX", "Victories of Player X: ");
        translations.put("victoriesO", "Victories of Player O: ");
        translations.put("draws", "Draws: ");
        translations.put("invalidSelection", "Invalid selection");
        translations.put("coordinatePrompt", "Enter the coordinate (Example: A1, B2, C3): ");
        translations.put("winner", " has won!");
        translations.put("gameDrawn", "The game has ended in a draw!");
        translations.put("languageSelection", "Select a language / Seleccione un idioma:");
        translations.put("english", "1. English");
        translations.put("spanish", "2. Español / Spanish");
        translations.put("languageChoice", "Enter your choice / Ingrese su elección: ");
        translations.put("translationNotFound", "Translation not found");
    }

    public static String getTranslation(String key) {
        return translations.getOrDefault(key, "Translation not found");
    }

    public static void loadLanguage() {
    }
}
