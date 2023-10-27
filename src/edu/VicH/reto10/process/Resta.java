package edu.VicH.reto10.process;

/**
 * Clase que representa la operación de resta.
 */
public class Resta extends OperacionAritmetica {
    @Override
    public double calcular(double num1, double num2) {
        return num1 - num2;
    }
}
