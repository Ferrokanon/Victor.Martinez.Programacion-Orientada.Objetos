package edu.VicH.reto10_5.process;

/**
 * La clase Modulo hereda de Resta y sobrescribe
 * el método calcular para calcular el módulo (residuo)
 * teniendo en cuenta la división por cero.
 */

public class Modulo extends Resta {
    @Override
    public double calcular(double a, double b) {
        if (b != 0) {
            while (a >= b) {
                a = super.calcular(a, b);
            }

            return a;
        } else {
            System.out.println("No se puede calcular el módulo (residuo) por cero.");
            return Double.NaN;
        }
    }
}