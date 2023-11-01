package edu.VicH.reto10_5.process;


/**
 * La clase Division hereda de Resta y sobrescribe
 * el método calcular para realizar una división aritmética,
 * tomando en cuenta la división por cero.
 */

public class Division extends Resta {
    @Override
    public double calcular(double a, double b) {
        if (b != 0) {
            return super.calcular(a, b);
        } else {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN; // Valor especial para indicar error
        }
    }
}
