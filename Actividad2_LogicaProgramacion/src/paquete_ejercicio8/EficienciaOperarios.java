package paquete_ejercicio8;
import java.util.Scanner;

public class EficienciaOperarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de operarios (N): "); int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nDatos Operario " + (i + 1) + ":");
            System.out.print("Código: "); String cod = sc.next();
            System.out.print("Horas ausencia: "); int h = sc.nextInt();
            System.out.print("Pupitres defectuosos: "); int d = sc.nextInt();
            System.out.print("Pupitres producidos: "); int p = sc.nextInt();

            boolean c1 = (h <= 3);
            boolean c2 = (d < 300);
            boolean c3 = (p > 10000);

            int grado;
            if (c1 && c2 && c3) grado = 20;
            else if (c2 && c3) grado = 15;
            else if (c1 && c3) grado = 13;
            else if (c1 && c2) grado = 12;
            else if (c3) grado = 9;
            else if (c2) grado = 8;
            else if (c1) grado = 7;
            else grado = 5;

            System.out.println("RESULTADO: El operario " + cod + " tiene un Grado de Eficiencia: " + grado);
        }
    }
}
