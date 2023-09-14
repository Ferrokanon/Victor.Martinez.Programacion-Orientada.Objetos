package VicH.reto2.Boletos.ui;
import java.util.Scanner;

public class cli {
    public static void main(String[] args) {
        char opcion;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("BIENVENIDO A LA MÁQUINA DE BOLETOS");
            System.out.println("-------------------------------");
            System.out.println("Clave para el boleto de Adulto (A): $100");
            System.out.println("Clave para el boleto de Niño (N): $70");
            System.out.println("Clave para el boleto del INAPAM (I): $50");
            System.out.println("Clave para el boleto de Adulto mayor sin credencial (B): $70");
            System.out.println("-------------------------------");
            System.out.print("Introduce la clave del boleto que deseas comprar: ");
            opcion = scanner.next().charAt(0);

            double precio = calcularPrecioBoleto(opcion);
            if (precio > 0) {
                System.out.println("El precio del boleto es: $" + precio);
            } else {
                System.out.println("Clave no válida. Introduce una clave válida.");
            }

            System.out.print("¿Deseas comprar otro boleto? (S/N): ");
            opcion = scanner.next().charAt(0);
        } while (opcion == 'S' || opcion == 's');

        System.out.println("Gracias por usar nuestra máquina de boletos. ¡Diviértete en el parque!");
        scanner.close();
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
                precio = 70; // Adulto mayor sin credencial INAPAM cuesta lo mismo que un niño
                break;

            default:
                precio = -1; // Clave no válida
        }
        return precio;
    }
}
