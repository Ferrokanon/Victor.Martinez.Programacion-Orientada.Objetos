package VicH.reto4.ui;

import VicH.reto4.process.EstadisticasCafeFrio;

public class cli {
    public cli() {
    }

    public static void main(String[] args) {
        System.out.println("Ana pertenece a un grupo de analistas de mercado y le han encargado obtener ciertas estadísticas sobre un determinado número de datos, estos datos están ordenados en filas y columnas, de la siguiente manera:\n");
        int[][] ventasCafeFrio = EstadisticasCafeFrio.obtenerVentasCafeFrio();
        String[] sabores = EstadisticasCafeFrio.obtenerSabores();
        String[] trimestres = EstadisticasCafeFrio.obtenerTrimestres();
        System.out.println("\t\tTrimestre");
        System.out.print("\t\t");
        String[] var4 = trimestres;
        int var5 = trimestres.length;

        int j;
        for(j = 0; j < var5; ++j) {
            String trimestre = var4[j];
            System.out.print(trimestre + "\t");
        }

        System.out.println();

        int i;
        String trimestreMasVendido;
        for(i = 0; i < sabores.length; ++i) {
            trimestreMasVendido = sabores[i];
            System.out.print(trimestreMasVendido + "\t");

            for(j = 0; j < trimestres.length; ++j) {
                System.out.print(ventasCafeFrio[i][j] + "\t");
            }

            System.out.println();
        }

        for(i = 0; i < sabores.length; ++i) {
            trimestreMasVendido = EstadisticasCafeFrio.obtenerTrimestreMasVendidoPorSabor(ventasCafeFrio, sabores, trimestres, i);
            System.out.println(trimestreMasVendido);
        }

        String trimestreMasVendidoGeneral = EstadisticasCafeFrio.obtenerTrimestreMasVendidoGeneral(ventasCafeFrio, sabores, trimestres);
        System.out.println(trimestreMasVendidoGeneral);
    }
}

