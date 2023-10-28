package edu.VicH.reto10.process;

/**
 * Clase que representa la operación de suma.
 */

public class Suma extends OperacionAritmetica {
    @Override
    public double calcular(double num1, double num2) {
        return num1 + num2;
    }
}
