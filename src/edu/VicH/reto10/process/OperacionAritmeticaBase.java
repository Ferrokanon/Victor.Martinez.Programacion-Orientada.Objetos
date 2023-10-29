package edu.VicH.reto10.process;


/**
 * @Autor: Victor Hugo Martinez Esparza
 * Clase que representa una operación aritmética básica.
 */

/**
 * Clase abstracta que representa una operación aritmética genérica.
 */
public abstract class OperacionAritmeticaBase implements OperacionAritmetica {
    @Override
    public double calcular(double num1, double num2) {
        return num1;
    }
}
