package edu.VicH.reto12.process;


/**
 * La clase Potencia hereda de Multiplicacion
 * y sobrescribe el método calcular para calcular
 * la potencia utilizando propiedades de la multiplicación
 */


public class Potencia extends Multiplicacion {
    @Override
    public double calcular(double a, double b) {
        // Calcula la potencia aplicando la propiedad de la multiplicación
        double resultado = 1.0;

        for (int i = 0; i < b; i++) {
            resultado = super.calcular(resultado, b);
        }

        return resultado;
    }
}
