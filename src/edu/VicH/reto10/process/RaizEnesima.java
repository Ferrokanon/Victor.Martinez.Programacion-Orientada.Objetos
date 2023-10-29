package edu.VicH.reto10.process;

public abstract class RaizEnesima extends OperacionAritmeticaBase implements OperacionRaiz {

    protected int indice;

    /**
     * Constructor de RaizEnesima.
     *
     * @param indice El índice de la raíz (por ejemplo, 2 para raíz cuadrada, 3 para raíz cúbica, etc.).
     */
    public RaizEnesima(int indice) {
        this.indice = indice;
    }

    public RaizEnesima() {

    }

    /**
     * Calcula la raíz enésima de un número.
     *
     * @param numero El número del cual se calculará la raíz.
     * @return El resultado de la raíz enésima.
     */
    @Override
    public double calcular(double numero, double num2) {
        if (numero < 0 && indice % 2 == 0) {
            throw new IllegalArgumentException("No se puede calcular una raíz par de un número negativo");
        }
        return Math.pow(numero, 1.0 / indice);
    }
}
