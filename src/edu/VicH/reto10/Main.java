package edu.VicH.reto10;

import edu.VicH.reto10.process.*;
import edu.VicH.reto10.ui.Cli;

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

            if (opcion == 6) {
                System.out.print("Ingresa el valor de n para la raíz n-ésima: ");
                int n = Integer.parseInt(System.console().readLine());
                operacion = new RaizEnesima(n); // Debes tener la clase RaizEnesima definida.
            } else {
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
                    case 7:
                        operacion = new Exponente(2); // Debes proporcionar el valor para el exponente.
                        break;
                    case 8:
                        int base = 10; // Add a base for the logarithm
                        operacion = new Logaritmo(base); // Debes tener la clase Logaritmo definida.
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            }

            if (operacion != null) {
                double resultado = operacion.calcular(operandos[0], operandos[1]);
                System.out.println("El resultado de la operación es: " + resultado);
            }
        }
    }
}
