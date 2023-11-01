package edu.VicH.reto10_5.process;

/**
 * La clase RaizEnesima hereda de Multiplicacion y sobrescribe
 * el método calcular para calcular la raíz enésima,
 * que es equivalente a elevar a la inversa del índice.
 */


public class RaizEnesima extends Multiplicacion {
    @Override
    public double calcular(double radicando, double indice) {
        return super.calcular(radicando, 1.0 / indice);
    }
}
