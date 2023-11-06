package edu.VicH.reto11.process;


/**
 * La clase Division hereda de Resta y sobrescribe
 * el método calcular para realizar una división aritmética,
 * tomando en cuenta la división por cero.
 */


public class Division extends Resta {
    @Override
    public double calcular(double a, double b) {
        if (b != 0) {
            double resultado = 0.0;

            while (a >= b) {
                a = super.calcular(a, b);
                resultado++;
            }

            return resultado;
        } else {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN;
        }
    }

    /**
     * @return
     */
    @Override
    public String getOperayionType() {
        return null;
    }
}