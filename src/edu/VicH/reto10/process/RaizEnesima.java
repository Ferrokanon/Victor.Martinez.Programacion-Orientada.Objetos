package edu.VicH.reto10.process;
public class RaizEnesima extends OperacionAritmetica {
    private int indice;

    public RaizEnesima(int indice) {
        this.indice = indice;
    }

    @Override
    public double calcular(double num1, double num2) {
        if (num1 < 0 && num2 % 2 == 0) {
            throw new IllegalArgumentException("No se puede calcular una raíz par de un número negativo");
        }
        return Math.pow(num1, 1.0 / num2);
    }
}