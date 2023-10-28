package edu.VicH.reto10.process;

public class Logaritmo extends RaizEnesima {
    private int base;

    public Logaritmo(int base) {
        super(base);
        this.base = base;
    }

    @Override
    public double calcular(double num1, double num2) {
        if (num1 <= 0 || num2 <= 1) {
            throw new IllegalArgumentException("El número o la base del logaritmo no son válidos.");
        }
        return Math.log(num1) / Math.log(this.base);
    }
}
