package edu.VicH.reto10;

import edu.VicH.reto10.ui.Cli;

import edu.VicH.reto10.process.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            int opcion = Cli.mostrarMenu(); // Debes importar la clase Cli correctamente
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
                    // Raíz Enésima - Solicita el índice
                    int indiceRaiz = Cli.obtenerIndiceRaiz(scanner); // Debes importar la clase Cli
                    operacion = new RaizEnesima(indiceRaiz) {
                        /**
                         * @param numero
                         * @param indice
                         * @return
                         */
                        @Override
                        public double calcularRaiz(double numero, int indice) {
                            return 0;
                        }
                    }; // Asegúrate de que RaizEnesima esté importada
                    break;
                case 7:
                    // Exponente - Solicita el índice
                    int indiceExponente = Cli.obtenerIndiceExponente(scanner); // Debes importar la clase Cli
                    operacion = new Exponente(indiceExponente) {
                        /**
                         * @param numero
                         * @param indice
                         * @return
                         */
                        @Override
                        public double calcularRaiz(double numero, int indice) {
                            return 0;
                        }
                    }; // Asegúrate de que Exponente esté importada
                    break;
                case 8:
                    // Logaritmo - Solicita la base
                    double baseLogaritmo = Cli.obtenerBaseLogaritmo(scanner); // Debes importar la clase Cli
                    operacion = new Logaritmo(baseLogaritmo) {
                        /**
                         * @param numero
                         * @param indice
                         * @return
                         */
                        @Override
                        public double calcularRaiz(double numero, int indice) {
                            return 0;
                        }

                        /**
                         * @param base
                         * @param numero
                         * @return
                         */
                        @Override
                        public double calcularLogaritmo(double base, double numero) {
                            return 0;
                        }
                    }; // Asegúrate de que Logaritmo esté importada
                    break;
                case 9:
                    continuar = false;
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            if (operacion != null) {
                double[] operandos = Cli.obtenerOperandos(scanner); // Debes importar la clase Cli
                double resultado = operacion.calcular(operandos[0], operandos[1]);
                System.out.println("El resultado es: " + resultado);
            }
        }
    }
}

