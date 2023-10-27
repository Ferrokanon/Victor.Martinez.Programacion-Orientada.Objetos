package edu.VicH.reto10.process;

/**
 * Clase que representa la operación de logaritmo, hereda de Resta.
 */
public class Logaritmo extends Resta {
    @Override
    public double calcular(double num1, double num2) {
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Los logaritmos solo son válidos para números positivos.");
            return 0;
        }
        return Math.log(num1) / Math.log(num2);
    }
}