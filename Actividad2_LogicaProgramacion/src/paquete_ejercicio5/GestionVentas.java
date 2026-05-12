package paquete_ejercicio5;
import java.util.Scanner;

public class GestionVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de artículos (N): "); int n = sc.nextInt();
        System.out.print("Cantidad de sucursales (M): "); int m = sc.nextInt();

        double[][] precios = new double[n][m];
        int[][] ventas = new int[n][m];

        // Ingreso de Precios
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Precio Articulo " + (i + 1) + " en Sucursal " + (j + 1) + ": ");
                precios[i][j] = sc.nextDouble();
            }
        }

        // Ingreso de Cantidades Vendidas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Ventas Articulo " + (i + 1) + " en Sucursal " + (j + 1) + ": ");
                ventas[i][j] = sc.nextInt();
            }
        }

        // a. Total ventas por artículo
        System.out.println("\n--- TOTAL POR ARTÍCULO ---");
        for (int i = 0; i < n; i++) {
            double totalArt = 0;
            for (int j = 0; j < m; j++) {
                totalArt += precios[i][j] * ventas[i][j];
            }
            System.out.println("Artículo " + (i + 1) + ": $" + totalArt);
        }

        // b. Total ventas por sucursal
        System.out.println("\n--- TOTAL POR SUCURSAL ---");
        for (int j = 0; j < m; j++) {
            double totalSuc = 0;
            for (int i = 0; i < n; i++) {
                totalSuc += precios[i][j] * ventas[i][j];
            }
            System.out.println("Sucursal " + (j + 1) + ": $" + totalSuc);
        }
    }
}
