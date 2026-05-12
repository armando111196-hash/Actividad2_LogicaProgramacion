package paquete_ejercicio9;
import java.util.Scanner;

public class InventarioFarmacia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos medicamentos registrará?: "); int n = sc.nextInt();

        String[] nombres = new String[n];
        int[] stock = new int[n];
        int[] stockMin = new int[n];
        double[] precios = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nombre: "); nombres[i] = sc.next();
            System.out.print("Stock Actual: "); stock[i] = sc.nextInt();
            System.out.print("Stock Mínimo: "); stockMin[i] = sc.nextInt();
            System.out.print("Precio Unitario: "); precios[i] = sc.nextDouble();
        }

        // b. Stock por debajo del mínimo
        System.out.println("\n--- ALERTAS DE STOCK BAJO ---");
        for (int i = 0; i < n; i++) {
            if (stock[i] < stockMin[i]) System.out.println(nombres[i] + " requiere reabastecimiento.");
        }

        // c. Valor económico total
        double totalInv = 0;
        for (int i = 0; i < n; i++) totalInv += stock[i] * precios[i];
        System.out.println("\nValor total del inventario: $" + totalInv);
        
        // d. Simulación de venta básica
        System.out.print("\nIngrese nombre del medicamento vendido: "); String buscar = sc.next();
        for (int i = 0; i < n; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                System.out.print("Cantidad vendida: "); int cant = sc.nextInt();
                stock[i] -= cant;
                System.out.println("Venta realizada. Nuevo stock: " + stock[i]);
            }
        }
    }
}