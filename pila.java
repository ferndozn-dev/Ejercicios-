import java.util.Scanner;
import java.util.Stack;

public class pila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine().toUpperCase();

        // Guardar cada letra en la pila
        for (int i = 0; i < palabra.length(); i++) {
            pila.push(palabra.charAt(i));
        }

        // Sacar letras para invertir la palabra
        String invertida = "";

        while (!pila.isEmpty()) {
            invertida += pila.pop();
        }

        System.out.println("Palabra invertida: " + invertida);

        // Verificar si es palíndromo
        if (palabra.equals(invertida)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }

        sc.close();
    }
}
