package edu.VicH.reto10_5.process;

/**
 * La clase Potencia hereda de Multiplicacion
 * y sobrescribe el método calcular para calcular
 * la potencia utilizando propiedades de la multiplicación
 */


public class Potencia_Multiplicacion extends Multiplicacion {
    @Override
    public double calcular(double num1, double num2) {
        // Calcula la potencia aplicando la propiedad de la multiplicación
        double resultado = 1.0;

        for (int i = 0; i < num2; i++) {
            resultado = super.calcular(resultado, num1);
        }

        return resultado;
    }
}
