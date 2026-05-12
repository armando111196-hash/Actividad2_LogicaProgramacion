package paquete_ejercicio7;
import java.util.Scanner;

public class UniversidadPromedios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de estudiantes (N): "); int n = sc.nextInt();
        int materias = 8;
        double[][] notas = new double[n][materias];

        // Ingreso de datos
        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < materias; j++) {
                System.out.print("  Nota Materia " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        // a. Promedio por estudiante y c. Estudiante con mayor promedio
        double mayorPromedio = -1;
        int indiceMejorEstudiante = 0;
        System.out.println("\n--- PROMEDIOS ESTUDIANTES ---");
        for (int i = 0; i < n; i++) {
            double suma = 0;
            for (int j = 0; j < materias; j++) suma += notas[i][j];
            double prom = suma / materias;
            System.out.println("Estudiante " + (i + 1) + ": " + prom);
            if (prom > mayorPromedio) {
                mayorPromedio = prom;
                indiceMejorEstudiante = i + 1;
            }
        }
        System.out.println("El mejor promedio es del Estudiante " + indiceMejorEstudiante + " con " + mayorPromedio);

        // b, d, e. Análisis por materia
        System.out.println("\n--- REPORTE POR MATERIA ---");
        for (int j = 0; j < materias; j++) {
            double sumaMat = 0;
            int aprobados = 0, reprobados = 0;
            for (int i = 0; i < n; i++) {
                sumaMat += notas[i][j];
                if (notas[i][j] >= 7) aprobados++;
                else reprobados++;
            }
            System.out.println("Materia " + (j + 1) + ": Promedio: " + (sumaMat / n) + 
                               " | Aprobados: " + aprobados + " | Reprobados: " + reprobados);
        }
    }
}