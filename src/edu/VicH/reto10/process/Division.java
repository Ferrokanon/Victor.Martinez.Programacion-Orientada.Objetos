package edu.VicH.reto10.process;

/**
 * Clase que representa la operación de división, hereda de Resta.
 */
public class Division extends Resta {
    @Override
    public double calcular(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero.");
            return 0;
        }
        return num1 / num2;
    }
}