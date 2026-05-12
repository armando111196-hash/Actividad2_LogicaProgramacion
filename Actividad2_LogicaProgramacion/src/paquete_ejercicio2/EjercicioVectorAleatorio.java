import java.util.Scanner;
import java.util.Random;

public class EjercicioVectorAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[] original = new int[20];

        // Llenado aleatorio (ejemplo entre 1 y 50)
        System.out.print("Vector Original: ");
        for (int i = 0; i < 20; i++) {
            original[i] = rd.nextInt(50) + 1;
            System.out.print(original[i] + " ");
        }

        // a. Buscar posición de un número
        System.out.print("\n\nIngrese número a buscar: ");
        int buscar = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < 20; i++) {
            if (original[i] == buscar) {
                System.out.println("Encontrado en la posición (índice): " + i);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("El número no está en el vector.");

        // b. Crear vector con elementos de índices impares (1, 3, 5...)
        // Hay 10 índices impares en un vector de 20 (del 1 al 19)
        int[] impares = new int[10];
        int j = 0;
        System.out.print("\nVector de índices impares: ");
        for (int i = 1; i < 20; i += 2) {
            impares[j] = original[i];
            System.out.print(impares[j] + " ");
            j++;
        }

        // c. Contar elementos mayores a 20 en el segundo vector
        int mayores20 = 0;
        for (int num : impares) {
            if (num > 20) mayores20++;
        }
        System.out.println("\nElementos mayores a 20 en el segundo vector: " + mayores20);
    }
}