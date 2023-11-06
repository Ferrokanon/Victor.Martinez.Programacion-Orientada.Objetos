package edu.VicH.reto11.process;


/**
 * La clase Multiplicacion hereda de Suma y sobrescribe el método calcular
 * para realizar una multiplicación aritmética utilizando sumas sucesivas.
 */

public class Multiplicacion extends Suma {
    @Override
    public double calcular(double a, double b) {
        double resultado = 0.0;
        for (int i = 0; i < a; i++) {
            resultado = super.calcular(resultado, b);
        }
        return resultado;
    }

    /**
     * @return
     */
    @Override
    public String getOperayionType() {
        return null;
    }
}
