package edu.VicH.reto12.ui;

import java.io.*;

public class Resultado {
    private StringBuilder registro;

    public Resultado() {
        registro = new StringBuilder();
    }

    public void agregarRegistro(String texto) {
        registro.append(texto).append("\n");
    }

    public void guardarResultado() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("RESULTADOS/ProgramOutput.txt", true))) {
            writer.println(registro.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerContenidoArchivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader("RESULTADOS/ConsoleOutput.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                agregarRegistro(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}