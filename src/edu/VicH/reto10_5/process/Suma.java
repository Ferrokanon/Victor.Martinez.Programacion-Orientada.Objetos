package edu.VicH.reto10_5.process;


/**
 * Esta clase Suma hereda de OperacionAritmetica y
 * sobrescribe el método calcular para realizar una suma aritmética.
 */



public class Suma extends OperacionAritmetica {
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}

