package edu.VicH.reto10.process;

/**
 * @Autor: Victor Hugo Martinez Esparza
 * Clase que representa una operación aritmética básica.
 */

/**
 * Clase abstracta que representa una operación aritmética genérica.
 */
public abstract class OperacionAritmetica {
    /**
     * Método para realizar una operación aritmética entre dos números.
     *
     * @param num1 Primer número
     * @param num2 Segundo número
     * @return Resultado de la operación aritmética
     */
    public abstract double calcular(double num1, double num2);
}


