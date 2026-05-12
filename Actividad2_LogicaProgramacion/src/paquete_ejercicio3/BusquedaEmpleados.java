package paquete_ejercicio3;

import java.util.Scanner;

public class BusquedaEmpleados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados (N): ");
        int n = sc.nextInt();

        String[] codigos = new String[n];
        String[] nombres = new String[n];

        // Ingreso de datos
        for (int i = 0; i < n; i++) {
            System.out.print("Código del empleado " + (i + 1) + ": ");
            codigos[i] = sc.next();
            sc.nextLine(); // Limpiar buffer
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        // Búsqueda
        System.out.print("\nIngrese el código a buscar: ");
        String buscarCod = sc.next();
        boolean hallado = false;

        for (int i = 0; i < n; i++) {
            if (codigos[i].equalsIgnoreCase(buscarCod)) {
                System.out.println("Empleado encontrado: " + nombres[i]);
                hallado = true;
                break;
            }
        }

        if (!hallado) System.out.println("Código no registrado.");
    }
}   