package edu.VicH.reto10_5.ui;


/**
 * Este código representa una aplicación de línea de comandos (CLI)
 *     que permite al usuario seleccionar una operación aritmética y realizar cálculos.
 *         Es un programa interactivo que utiliza las clases anteriores para realizar operaciones aritméticas.
 */


import edu.VicH.reto10_5.process.*;

import java.util.Scanner;

public class Cli {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        double num1;
        double num2;

        do {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Módulo");
            System.out.println("6. Raíz Enésima");
            System.out.println("7. Potencia (Multiplicación)");
            System.out.println("8. Potencia (Raíz Enésima)");
            System.out.println("9. Logaritmo");
            System.out.println("0. Salir");
            System.out.print("Ingrese el número de la operación deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Suma suma = new Suma();
                    System.out.print("Ingrese primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese segundo número: ");
                    num2 = scanner.nextDouble();
                    double resultadoSuma = suma.calcular(num1, num2);
                    System.out.println("El resultado de la suma es: " + resultadoSuma);
                    break;
                case 2:
                    Resta resta = new Resta();
                    System.out.print("Ingrese primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese segundo número: ");
                    num2 = scanner.nextDouble();
                    double resultadoResta = resta.calcular(num1, num2);
                    System.out.println("El resultado de la resta es: " + resultadoResta);
                    break;
                case 3:
                    Multiplicacion multiplicacion = new Multiplicacion();
                    System.out.print("Ingrese el multiplicando: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el multiplicador: ");
                    num2 = scanner.nextDouble();
                    double resultadoMultiplicacion = multiplicacion.calcular(num1, num2);
                    System.out.println("El producto de la multiplicación es: " + resultadoMultiplicacion);
                    break;
                case 4:
                    Division division = new Division();
                    System.out.print("Ingrese el numerador: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el denominador: ");
                    num2 = scanner.nextDouble();
                    double resultadoDivision = division.calcular(num1, num2);
                    if (!Double.isNaN(resultadoDivision)) {
                        System.out.println("El cociente de la división es: " + resultadoDivision);
                    }
                    break;
                case 5:
                    Modulo modulo = new Modulo();
                    System.out.print("Ingrese el numerador: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el denominador: ");
                    num2 = scanner.nextDouble();
                    double resultadoModulo = modulo.calcular(num1, num2);
                    if (!Double.isNaN(resultadoModulo)) {
                        System.out.println("El módulo (residuo) de la división es: " + resultadoModulo);
                    }
                    break;
                case 6:
                    RaizEnesima raiz = new RaizEnesima();
                    System.out.print("Ingrese el radicando: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el índice de la raíz (radical): ");
                    num2 = scanner.nextDouble();
                    double resultadoRaiz = raiz.calcular(num1, num2);
                    System.out.println("El resultado de la raíz es: " + resultadoRaiz);
                    break;
                case 7:
                    Potencia_Multiplicacion potenciaMultiplicacion = new Potencia_Multiplicacion();
                    System.out.print("Ingrese la base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    num2 = scanner.nextDouble();
                    double resultadoPotenciaMultiplicacion = potenciaMultiplicacion.calcular(num1, num2);
                    System.out.println("El resultado de " + num1 + " elevado a la potencia " + num2 + " es: " + resultadoPotenciaMultiplicacion);
                    break;
                case 8:
                    Potencia_RaizEnesima potenciaRaiz = new Potencia_RaizEnesima();
                    System.out.print("Ingrese la base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    num2 = scanner.nextDouble();
                    double resultadoPotenciaRaiz = potenciaRaiz.calcular(num1, num2);
                    System.out.println("El resultado de " + num1 + " elevado a la potencia " + num2 + " es: " + resultadoPotenciaRaiz);
                    break;
                case 9:
                    Logaritmo logaritmo = new Logaritmo() {
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
                    System.out.print("Ingrese el argumento: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese la base del logaritmo: ");
                    num2 = scanner.nextDouble();
                    double resultadoLogaritmo = logaritmo.calcular(num1, num2);
                    System.out.println("El resultado del logaritmo base " + num2 + " de " + num1 + " es: " + resultadoLogaritmo);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }
}