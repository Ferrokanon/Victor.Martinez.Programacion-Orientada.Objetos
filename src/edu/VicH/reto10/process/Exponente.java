package edu.VicH.reto10.process;

/**
 * Clase que representa la operación de exponente, hereda de Suma.
 */
public class Exponente extends Suma {
    @Override
    public double calcular(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
