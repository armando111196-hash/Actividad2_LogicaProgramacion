package paquete_ejercicio6;
import java.util.Scanner;

public class ConsolidadoVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de vendedores (N): "); int n = sc.nextInt();
        System.out.print("Años de operación (M): "); int m = sc.nextInt();

        double[][] matrizVentas = new double[n][m];
        double totalEmpresa = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Vendedor " + (i + 1) + ":");
            for (int j = 0; j < m; j++) {
                System.out.print("  Año " + (j + 1) + ": ");
                matrizVentas[i][j] = sc.nextDouble();
                totalEmpresa += matrizVentas[i][j];
            }
        }

        // a. Ventas por vendedor
        for (int i = 0; i < n; i++) {
            double sumaVendedor = 0;
            for (int j = 0; j < m; j++) sumaVendedor += matrizVentas[i][j];
            System.out.println("Total Vendedor " + (i + 1) + ": " + sumaVendedor);
        }

        // b. Ventas por año
        for (int j = 0; j < m; j++) {
            double sumaAnio = 0;
            for (int i = 0; i < n; i++) sumaAnio += matrizVentas[i][j];
            System.out.println("Total Año " + (j + 1) + ": " + sumaAnio);
        }

        // c. Total empresa
        System.out.println("Venta Total de la Empresa: " + totalEmpresa);
    }
}
