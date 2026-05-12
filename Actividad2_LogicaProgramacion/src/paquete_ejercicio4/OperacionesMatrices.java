package paquete_ejercicio4;

import java.util.Scanner;
import java.util.Random;

public class OperacionesMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Filas (M): "); int m = sc.nextInt();
        System.out.print("Columnas (N): "); int n = sc.nextInt();

        int[][] A = generarMatriz(m, n);
        int[][] B = generarMatriz(m, n);

        System.out.println("\nMatriz A generada.");
        System.out.println("Matriz B generada.");

        System.out.println("\n1. Sumar\n2. Restar\n3. Trasponer A\n4. Multiplicar (A * B)");
        int opcion = sc.nextInt();

        switch(opcion) {
            case 1: mostrarMatriz(operar(A, B, '+')); break;
            case 2: mostrarMatriz(operar(A, B, '-')); break;
            case 3: mostrarMatriz(trasponer(A)); break;
            case 4: 
                if (n == m) mostrarMatriz(multiplicar(A, B));
                else System.out.println("Para multiplicar, Columnas A debe ser igual a Filas B.");
                break;
        }
    }

    public static int[][] generarMatriz(int f, int c) {
        Random rd = new Random();
        int[][] mat = new int[f][c];
        for(int i=0; i<f; i++)
            for(int j=0; j<c; j++) mat[i][j] = rd.nextInt(10);
        return mat;
    }

    public static int[][] operar(int[][] a, int[][] b, char op) {
        int f = a.length, c = a[0].length;
        int[][] res = new int[f][c];
        for(int i=0; i<f; i++)
            for(int j=0; j<c; j++)
                res[i][j] = (op == '+') ? a[i][j] + b[i][j] : a[i][j] - b[i][j];
        return res;
    }

    public static int[][] trasponer(int[][] a) {
        int f = a.length, c = a[0].length;
        int[][] res = new int[c][f];
        for(int i=0; i<f; i++)
            for(int j=0; j<c; j++) res[j][i] = a[i][j];
        return res;
    }

    public static void mostrarMatriz(int[][] m) {
        for (int[] fila : m) {
            for (int val : fila) System.out.print(val + " ");
            System.out.println();
        }
    }
    
    // Nota: Multiplicar requiere lógica de sumatoria de productos, 
    // la añadimos si tu profesor exige multiplicación de matrices formal.
    public static int[][] multiplicar(int[][] a, int[][] b) {
        int f1 = a.length, c1 = a[0].length, c2 = b[0].length;
        int[][] res = new int[f1][c2];
        for (int i = 0; i < f1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }
}