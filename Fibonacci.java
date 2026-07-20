import java.util.Scanner;

public class Fibonacci {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetodoRecursivo metodo = new MetodoRecursivo();

        System.out.print("¿Cuántos términos de Fibonacci desea mostrar? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Debe ingresar un número mayor que 0.");
        } else {
            System.out.println("Serie de Fibonacci:");

            for (int i = 0; i < n; i++) {
                System.out.print(metodo.fibonacci(i) + " ");
            }
        }

        sc.close();
    }

}
