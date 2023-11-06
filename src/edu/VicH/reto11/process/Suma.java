package edu.VicH.reto11.process;




/**
 * Esta clase Suma hereda de OperacionAritmetica y
 * sobrescribe el método calcular para realizar una suma aritmética.
 */



public abstract class Suma extends OperacionAritmetica {
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }


    @Override
    public abstract String getOperayionType();

}

