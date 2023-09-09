package edu.VicH.reto2.Boletos.process;

public class Boletos{

    public static void main(String[] args) {
        char opcion;

        do {
            System.out.println("BIENVENIDO A LA MÁQUINA DE BOLETOS");
            System.out.println("-------------------------------");
            System.out.println("Clave para el boleto de Adulto (A): $100");
            System.out.println("Clave para el boleto de Niño (N): $70");
            System.out.println("Clave para el boleto del INAPAM (I): $50");
            System.out.println("Clave para el boleto de Adulto mayor sin credencial (B): $70");
            System.out.println("-------------------------------");
            System.out.print("Introduce la clave del boleto que deseas comprar: ");
            opcion = obtenerOpcion();

            double precio = calcularPrecioBoleto(opcion);
            if (precio > 0) {
                System.out.println("El precio del boleto es: $" + precio);
            } else {
                System.out.println("Clave no válida. Introduce una clave válida.");
            }

            System.out.print("¿Deseas comprar otro boleto? (S/N): ");
            opcion = obtenerOpcion();
        } while (opcion == 'S' || opcion == 's');

        System.out.println("Gracias por usar nuestra máquina de boletos. ¡Diviértete en el parque!");
    }

    public static char obtenerOpcion() {
        // Esta función será implementada en la segunda parte del código
        return ' '; // Dejamos un espacio en blanco temporalmente
    }

    public static double calcularPrecioBoleto(char opcion) {
        double precio = 0;

        switch (opcion) {
            case 'A':
                precio = 100;
                break;

            case 'N':
                precio = 70;
                break;

            case 'I':
                precio = 50;
                break;

            case 'B':
                precio = 70; // Adulto mayor sin credencial cuesta lo mismo que un niño
                break;

            default:
                precio = -1; // Clave no válida
        }
        return precio;
    }
}
