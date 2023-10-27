package edu.VicH.reto10;

import edu.VicH.reto10.ui.Cli;
import edu.VicH.reto10.process.OperacionAritmetica;
import edu.VicH.reto10.process.Suma;
import edu.VicH.reto10.process.Resta;
import edu.VicH.reto10.process.Multiplicacion;
import edu.VicH.reto10.process.Division;
import edu.VicH.reto10.process.Modulo;
import edu.VicH.reto10.process.Raiz;
import edu.VicH.reto10.process.Exponente;
import edu.VicH.reto10.process.Logaritmo;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            int opcion = Cli.mostrarMenu();
            if (opcion == 9) {
                continuar = false; // Opción 9: Salir del programa
                continue;
            }

            double[] operandos = Cli.obtenerOperandos();
            OperacionAritmetica operacion = null;

            switch (opcion) {
                case 1:
                    operacion = new Suma();
                    break;
                case 2:
                    operacion = new Resta();
                    break;
                case 3:
                    operacion = new Multiplicacion();
                    break;
                case 4:
                    operacion = new Division();
                    break;
                case 5:
                    operacion = new Modulo();
                    break;
                case 6:
                    operacion = new Raiz();
                    break;
                case 7:
                    operacion = new Exponente();
                    break;
                case 8:
                    operacion = new Logaritmo();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            if (operacion != null) {
                double resultado = operacion.calcular(operandos[0], operandos[1]);
                System.out.println("El resultado de la operación es: " + resultado);
            }
        }
    }
}

