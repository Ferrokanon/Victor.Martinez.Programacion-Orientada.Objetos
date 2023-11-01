package edu.VicH.reto10_5.process;


/**
 * La clase Logaritmo hereda de RaizEnesima
 * y sobrescribe el método calcular para calcular el logaritmo,
 * que es equivalente a calcular la raíz enésima con un índice inverso
 */



public class Logaritmo extends RaizEnesima {
    @Override
    public double calcular(double argumento, double base) {
        return super.calcular(argumento, 1.0 / base);
    }
}


