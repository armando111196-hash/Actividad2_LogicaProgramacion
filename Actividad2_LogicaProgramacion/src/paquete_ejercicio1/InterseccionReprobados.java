package paquete_ejercicio1;
import java.util.Scanner;

public class InterseccionReprobados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de estudiantes (N): ");
        int n = sc.nextInt();

        String[] mate = new String[n];
        String[] ingles = new String[n];

        System.out.println("\n--- Cédulas Reprobados Matemática ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            mate[i] = sc.next();
        }

        System.out.println("\n--- Cédulas Reprobados Inglés ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            ingles[i] = sc.next();
        }

        // Lógica para encontrar los que están en ambos (Vector 3)
        String[] ambos = new String[n];
        int contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mate[i].equals(ingles[j])) {
                    ambos[contador] = mate[i];
                    contador++;
                    break;
                }
            }
        }

        // Imprimir resultados
        System.out.println("\n--- REPORTE FINAL ---");
        imprimir("Vector Matemática: ", mate, n);
        imprimir("Vector Inglés: ", ingles, n);
        imprimir("Vector Ambos (Reprobados en las dos): ", ambos, contador);
    }

    public static void imprimir(String titulo, String[] arr, int limite) {
        System.out.print(titulo + "[ ");
        for (int i = 0; i < limite; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}