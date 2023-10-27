package edu.VicH.reto10.process;

/**
 * Clase que representa la operación de módulo, hereda de Resta.
 */
public class Modulo extends Resta {
    @Override
    public double calcular(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede calcular el módulo por cero.");
            return 0;
        }
        return num1 % num2;
    }
}