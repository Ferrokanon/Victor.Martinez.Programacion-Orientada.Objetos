package edu.VicH.reto11.process;



/**
 * La clase Resta también hereda de OperacionAritmetica y
 *  sobrescribe el método calcular para realizar una resta aritmética.
 */
public abstract class Resta extends OperacionAritmetica {
    @Override
    public double calcular(double a, double b) {
        return a - b;
    }



    @Override
    public abstract String getOperayionType();

}


