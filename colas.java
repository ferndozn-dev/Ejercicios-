import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

public class colas {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        Queue<Integer> pares = new LinkedList<>();
        Queue<Integer> impares = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(100) + 1;
            cola.add(numero);
        }

        System.out.println("Cola original:");
        System.out.println(cola);

        while (!cola.isEmpty()) {
            int num = cola.poll();

            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        System.out.println("Cola de pares:");
        System.out.println(pares);

        System.out.println("Cola de impares:");
        System.out.println(impares);
    }
}
