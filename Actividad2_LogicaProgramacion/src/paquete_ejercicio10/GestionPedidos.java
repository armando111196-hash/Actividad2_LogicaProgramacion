package paquete_ejercicio10;
import java.util.Scanner;

public class GestionPedidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de pedidos: "); int n = sc.nextInt();

        String[] clientes = new String[n];
        double[] totales = new double[n];
        double ingresoTotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("\nNombre Cliente: "); clientes[i] = sc.next();
            System.out.print("Plato: "); String plato = sc.next();
            System.out.print("Cantidad: "); int cant = sc.nextInt();
            System.out.print("Precio Unitario: "); double precio = sc.nextDouble();

            double subtotal = cant * precio;
            if (subtotal > 50) {
                subtotal *= 0.90; // Aplicar 10% de descuento
                System.out.println("¡Descuento del 10% aplicado!");
            }
            totales[i] = subtotal;
            ingresoTotal += subtotal;
            System.out.println("Total pedido: $" + subtotal);
        }

        // e. Pedido de mayor valor
        double max = 0; int indiceMax = 0;
        for (int i = 0; i < n; i++) {
            if (totales[i] > max) {
                max = totales[i];
                indiceMax = i;
            }
        }

        System.out.println("\n--- REPORTE FINAL ---");
        System.out.println("Ingreso total del restaurante: $" + ingresoTotal);
        System.out.println("Pedido de mayor valor: " + clientes[indiceMax] + " con $" + max);
    }
}