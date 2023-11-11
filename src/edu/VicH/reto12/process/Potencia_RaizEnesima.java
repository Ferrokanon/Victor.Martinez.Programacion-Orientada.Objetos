package edu.VicH.reto12.process;


import java.util.Scanner;

/**La clase Potencia hereda de Raíz Enésima
/* y sobrescribe el método calcular para calcular
/* la potencia utilizando propiedades de la Raíz Enésima
*/
public class Potencia_RaizEnesima extends RaizEnesima {
    @Override
    public double calcular(double base, double exponente) {
        // Aquí implementa el cálculo de la potencia usando la jerarquía existente
        return super.calcular(base, exponente);
    }


    public double broke() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el exponente: ");
        double exponente = scanner.nextDouble();

        double resultado = calcular(base, exponente);
        System.out.println("El resultado de " + base + " elevado a la potencia " + exponente + " es: " + resultado);
        return resultado;
    }
}
