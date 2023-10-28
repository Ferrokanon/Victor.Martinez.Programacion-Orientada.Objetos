package edu.VicH.reto10.process;

/**
 * Clase que representa la operación de división, hereda de Resta.
 */

public class Division extends Resta {
    @Override
    public double calcular(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN; // Manejo de división por cero
        }
        double resultado = 0;

        while (num1 >= num2) {
            num1 = super.calcular(num1, num2);
            resultado++;
        }

        return resultado;
    }
}
