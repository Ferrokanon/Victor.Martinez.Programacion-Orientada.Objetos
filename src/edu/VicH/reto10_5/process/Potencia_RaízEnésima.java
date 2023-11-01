package edu.VicH.reto10_5.process;

/**
 * L//**La clase Potencia hereda de Raíz Enésima
 * y sobrescribe el método calcular para calcular
 * la potencia utilizando propiedades de la Raíz Enésima
 */
public class Potencia_RaízEnésima extends RaizEnesima {
    @Override
    public double calcular(double base, double exponente) {
        double resultado = 1.0;
        for (int i = 0; i < exponente; i++) {
            resultado = super.calcular(resultado, base);  // Llama a la raíz enésima para calcular la potencia
        }
        return resultado;
    }
}

