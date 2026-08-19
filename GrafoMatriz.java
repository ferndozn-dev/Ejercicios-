import java.util.Scanner;

public class GrafoMatriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de vértices: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] vertices = new String[n];
        int[][] matriz = new int[n][n];

        System.out.println("\nIngrese el nombre de cada vértice:");
        for (int i = 0; i < n; i++) {
            System.out.print("Vértice " + (i + 1) + ": ");
            vertices[i] = sc.nextLine();
        }

        System.out.println("\nIngrese las relaciones entre los vértices.");
        System.out.println("Escriba 1 si existe relación y 0 si no existe.\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    System.out.print("¿Existe relación entre " + vertices[i] + " y " + vertices[j] + "? (1=Sí, 0=No): ");
                    matriz[i][j] = sc.nextInt();
                }
            }
        }

        System.out.println("\n===== MATRIZ DE ADYACENCIA =====");

        System.out.print("\t");
        for (int i = 0; i < n; i++) {
            System.out.print(vertices[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(vertices[i] + "\t");
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
