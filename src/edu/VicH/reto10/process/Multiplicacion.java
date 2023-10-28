package edu.VicH.reto10.process;

/**
 * Clase que representa la operación de multiplicación, hereda de Suma.
 */

public class Multiplicacion extends Suma {
    @Override
    public double calcular(double num1, double num2) {
        double resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado = super.calcular(resultado, num1);
        }
        return resultado;
    }
}
