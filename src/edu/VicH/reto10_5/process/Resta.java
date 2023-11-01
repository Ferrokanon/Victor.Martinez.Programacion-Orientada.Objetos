package edu.VicH.reto10_5.process;


/**
 * La clase Resta también hereda de OperacionAritmetica y
 *  sobrescribe el método calcular para realizar una resta aritmética.
 */
public class Resta extends OperacionAritmetica {
    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}


