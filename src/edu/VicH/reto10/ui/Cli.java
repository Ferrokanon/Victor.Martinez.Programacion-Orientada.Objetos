package edu.VicH.reto10.ui;

import edu.VicH.reto10.process.*;

import java.util.Scanner;

public class Cli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();

            OperacionAritmeticaBase operacion = null;

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
                    int indiceRaiz = obtenerIndiceRaiz(scanner);
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
                    };
                    break;
                case 7:
                    // Exponente - Solicita el índice
                    int indiceExponente = obtenerIndiceExponente(scanner);
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
                    };
                    break;
                case 8:
                    // Logaritmo - Solicita la base
                    double baseLogaritmo = obtenerBaseLogaritmo(scanner);
                    operacion = new Logaritmo((int) baseLogaritmo) {
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
                    };
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
                double[] operandos = obtenerOperandos(scanner);
                double resultado = operacion.calcular(operandos[0], operandos[1]);
                System.out.println("El resultado es: " + resultado);
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("Elija una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.println("6. Raíz Enésima");
        System.out.println("7. Exponente");
        System.out.println("8. Logaritmo");
        System.out.println("9. Salir del programa");
        System.out.print("Opción: ");
    }

    private static double[] obtenerOperandos(Scanner scanner) {
        double[] operandos = new double[2];
        System.out.print("Ingresa el primer número: ");
        operandos[0] = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        operandos[1] = scanner.nextDouble();
        return operandos;
    }

    private static int obtenerIndiceRaiz(Scanner scanner) {
        System.out.print("Ingresa el índice para la raíz: ");
        return scanner.nextInt();
    }

    private static int obtenerIndiceExponente(Scanner scanner) {
        System.out.print("Ingresa el índice para el exponente: ");
        return scanner.nextInt();
    }

    private static double obtenerBaseLogaritmo(Scanner scanner) {
        System.out.print("Ingresa la base del logaritmo: ");
        return scanner.nextDouble();
    }
}
