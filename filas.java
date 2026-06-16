import java.util.LinkedList;
import java.util.Queue;

public class filas {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Agregar elementos a la fila
        fila.add("Paco");
        fila.add("Papoi");
        fila.add("Pepe");
        fila.add("Pedro");
        fila.add("Poncho");

        System.out.println("Fila original:");
        System.out.println(fila);

        // Atender a las personas en la fila
        while (!fila.isEmpty()) {
            String personaAtendida = fila.poll();
            System.out.println("Atendiendo a: " + personaAtendida);
        }

    }
}
