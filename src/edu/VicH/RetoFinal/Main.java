package edu.VicH.RetoFinal;

public class Main {
   public static void main(String[] args) {
        edu.VicH.RetoFinal.ui.Cli cli = new edu.VicH.RetoFinal.ui.Cli();
        char[][] nuevoTablero = new char[0][];
        cli.iniciarJuego(nuevoTablero);
        cli.mostrarMenuIdiomas();
    }
}