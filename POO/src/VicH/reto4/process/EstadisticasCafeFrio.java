package VicH.reto4.process;

public class EstadisticasCafeFrio {
    public EstadisticasCafeFrio() {
    }

    public static int[][] obtenerVentasCafeFrio() {
        int[][] ventasCafeFrio = new int[][]{{111, 483, 471, 427}, {192, 500, 355, 158}, { 289, 470, 474, 160}, { 415, 114, 161, 308}};
        return ventasCafeFrio;
    }

    public static String[] obtenerSabores() {
        return new String[]{"Chocolate", "Vainilla", "Fresa", "Oreo"};
    }

    public static String[] obtenerTrimestres() {
        return new String[]{"Enero - Marzo", "Abril - Junio", "Julio - Septiembre", "Octubre - Diciembre"};
    }

    public static String obtenerTrimestreMasVendidoPorSabor(int[][] ventasCafeFrio, String[] sabores, String[] trimestres, int saborIndex) {
        int maxVentas = 0;
        int trimestreMasVendido = -1;

        for(int j = 0; j < trimestres.length; ++j) {
            if (ventasCafeFrio[saborIndex][j] > maxVentas) {
                maxVentas = ventasCafeFrio[saborIndex][j];
                trimestreMasVendido = j;
            }
        }

        return "El trimestre que más se vende por " + sabores[saborIndex] + " es: " + trimestres[trimestreMasVendido];
    }

    public static String obtenerTrimestreMasVendidoGeneral(int[][] ventasCafeFrio, String[] sabores, String[] trimestres) {
        int maxVentasGenerales = 0;
        int trimestreMasVendidoGeneral = -1;

        for(int j = 0; j < trimestres.length; ++j) {
            int ventasTrimestre = 0;

            for(int i = 0; i < sabores.length; ++i) {
                ventasTrimestre += ventasCafeFrio[i][j];
            }

            if (ventasTrimestre > maxVentasGenerales) {
                maxVentasGenerales = ventasTrimestre;
                trimestreMasVendidoGeneral = j;
            }
        }

        return "El trimestre que más producto vende en general es: " + trimestres[trimestreMasVendidoGeneral];
    }
}
