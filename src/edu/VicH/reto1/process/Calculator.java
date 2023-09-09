package edu.VicH.reto1.process;

/**
 * @Author Victor Marintez
 * Esta clase contiene la logica de los operadores aritmeticos basicos:
 * suma, resta, multiplicacion, division y modulo
 **/
public class Calculator {
    /**
     * @param num1 primer operando de la suma
     * @param num2 segundo operando de la suma
     * @return resultado de la suma de num1 y num2
     * <p>
     * este metodo sirve para sumar 2 numeros enteros
     */

    public static int sumaEnteros(int num1, int num2) {

        return num1 + num2;
    }

    /**
     * @param num1 primer operando de la resta
     * @param num2 segundo operando de la resta
     * @return resultado de la resta de num1 y num2
     * <p>
     * este metodo sirve para restar 2 numeros enteros
     */

    public static int restaEnteros(int num1, int num2) {

        return num1 - num2;
    }

    public static int multiplicacionEnteros(int num1, int num2) {

        return num1 * num2;
    }

    public static int divisionEnteros(int num1, int num2) {

        return num1 / num2;
    }

    public static int moduloEnteros(int num1, int num2) {

        return num1 % num2;
    }
}


