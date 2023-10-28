package edu.VicH.reto10.process;

/**
 * Clase que representa la operación de módulo, hereda de Resta.
 */

public class Modulo extends Resta {
    @Override
    public double calcular(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("El módulo no puede calcularse con divisor igual a cero.");
            return Double.NaN; // Manejo de módulo con divisor igual a cero
        }
        double resultado = num1;

        while (resultado >= num2) {
            resultado = super.calcular(resultado, num2);
        }

        return resultado;
    }
}

