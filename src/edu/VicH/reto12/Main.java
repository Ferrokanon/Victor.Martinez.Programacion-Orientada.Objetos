package edu.VicH.reto12;
import edu.VicH.reto12.ui.Cli;
import edu.VicH.reto12.ui.Resultado;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Crear la carpeta "RESULTADOS" si no existe
        File resultadosFolder = new File("RESULTADOS");
        if (!resultadosFolder.exists()) {
            resultadosFolder.mkdir();
        }

        // Ejecutar el programa CLI
        Cli cli = Cli.getInstance();
        cli.run();

        // Obtener el objeto Resultado y leer el contenido del archivo
        Resultado resultado = new Resultado();
        resultado.leerContenidoArchivo();

        // Guardar el resultado en un archivo
        resultado.guardarResultado();
    }
}
