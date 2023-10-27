package edu.VicH.reto10.process;

/**
 * Clase que representa la operación de multiplicación, hereda de Suma.
 */
public class Multiplicacion extends Suma {
    @Override
    public double calcular(double num1, double num2) {
        return num1 * num2;
    }
}