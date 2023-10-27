package edu.VicH.reto10.process;

/**
 * Clase que representa la operación de raíz cuadrada, hereda de Suma.
 */
public class Raiz extends Suma {
    @Override
    public double calcular(double num1, double num2) {
        if (num1 < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
            return 0;
        }
        return Math.sqrt(num1);
    }
}