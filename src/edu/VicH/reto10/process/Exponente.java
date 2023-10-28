package edu.VicH.reto10.process;

/**
 * Clase que representa la operación de exponente, hereda de Suma.
 */


public class Exponente extends RaizEnesima {
    public Exponente(int base) {
        super(base);
    }

    @Override
    public double calcular(double num1, double num2) {
        if (num1 <= 0 || num2 <= 1) {
            throw new IllegalArgumentException("E numero o la base del logaritmo no son validos.");
        }
        return Math.pow(num1,num2);
    }
}


