package edu.VicH.reto11.process;


import java.util.Scanner;

/**
 * La clase RaizEnesima hereda de Multiplicacion y sobrescribe
 * el método calcular para calcular la raiz enésima de un numero
 * teniendo en cuenta el índice 0 - cero.
 */


public class RaizEnesima extends Multiplicacion {
    public RaizEnesima() {
        super();
    }

    @Override
    public double calcular(double radicando, double indice) {
        if (indice != 0) {
            if (indice == 1) {
                return radicando; // La raíz de índice 1 es el propio número
            } else {
                double estimado = 1.0; // Estimado inicial
                double epsilon = 1e-15; // Tolerancia para la precisión

                while (true) {
                    double siguienteEstimado = ((indice - 1.0) * estimado + radicando / super.calcular(estimado, indice - 1)) / indice;
                    double diferencia = siguienteEstimado - estimado;

                    // Verificar si la diferencia es muy pequeña (usando epsilon) para detener la iteración
                    if (diferencia < 0) {
                        diferencia = -diferencia;
                    }

                    if (diferencia < epsilon) {
                        return siguienteEstimado;
                    }

                    estimado = siguienteEstimado;
                }
            }
        } else {
            System.out.println("No se puede calcular una raíz con índice igual a cero.");
            return Double.NaN; // Valor especial para indicar error
        }
    }

    public double broke() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radicando: ");
        double radicando = scanner.nextDouble();
        System.out.print("Ingrese el índice de la raíz (radical): ");
        double indice = scanner.nextDouble();

        double resultado = calcular(radicando, indice);
        System.out.println("El resultado de la raíz es: " + resultado);
        return radicando;
    }
}
