import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arbol arbol = new Arbol();

        System.out.print("¿Cuántos números desea ingresar?: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Número: ");
            int dato = sc.nextInt();

            arbol.insertar(dato);
        }

        System.out.println("\nRecorrido PreOrden:");
        arbol.preOrden();
    }
}
