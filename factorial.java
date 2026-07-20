import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        MetodoRecursivo metodo = new MetodoRecursivo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.print("El factorial no existe en números negativos");
        } else {
            System.out.print("El factorial de " + num + " es: " + metodo.factorial(num));
        }
    }
}
