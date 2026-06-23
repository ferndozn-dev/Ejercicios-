
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<>();
        Stack<String> historial = new Stack<>();

        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE CURSOS UTC ---");
            System.out.println("1. Agregar curso");
            System.out.println("2. Mostrar cursos");
            System.out.println("3. Buscar curso por clave");
            System.out.println("4. Inscribir estudiante");
            System.out.println("5. Dar de baja estudiante");
            System.out.println("6. Eliminar curso");
            System.out.println("7. Mostrar historial");
            System.out.println("8. Mostrar cursos con cupo disponible");
            System.out.println("9. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Clave: ");
                    String clave = sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Docente: ");
                    String docente = sc.nextLine();

                    System.out.print("Cupo máximo: ");
                    int cupo = sc.nextInt();
                    sc.nextLine();

                    Curso nuevo = new Curso(clave, nombre, docente, cupo);
                    cursos.add(nuevo);
                    historial.push("Se agregó el curso " + nombre);
                    break;

                case 2:
                    if (cursos.isEmpty()) {
                        System.out.println("No hay cursos.");
                    } else {
                        for (Curso c : cursos) {
                            c.mostrar();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese clave: ");
                    String buscar = sc.nextLine();

                    for (Curso c : cursos) {
                        if (c.getClave().equals(buscar)) {
                            c.mostrar();
                        }
                    }
                    break;

                case 4:
                    System.out.print("Clave del curso: ");
                    String claveIns = sc.nextLine();

                    for (Curso c : cursos) {
                        if (c.getClave().equals(claveIns)) {
                            c.inscribir();
                            historial.push("Se inscribió un estudiante en " + c.getNombre());
                        }
                    }
                    break;
                                case 5:
                    System.out.print("Clave del curso: ");
                    String claveBaja = sc.nextLine();

                    for (Curso c : cursos) {
                        if (c.getClave().equals(claveBaja)) {
                            c.baja();
                            historial.push("Se dio de baja un estudiante de " + c.getNombre());
                        }
                    }
                    break;

                case 6:
                    System.out.print("Clave del curso a eliminar: ");
                    String eliminar = sc.nextLine();

                    for (int i = 0; i < cursos.size(); i++) {
                        if (cursos.get(i).getClave().equals(eliminar)) {
                            historial.push("Se eliminó el curso " + cursos.get(i).getNombre());
                            cursos.remove(i);
                            System.out.println("Curso eliminado.");
                            break;
                        }
                    }
                    break;

                case 7:
                    if (historial.isEmpty()) {
                        System.out.println("Historial vacío.");
                    } else {
                        for (String accion : historial) {
                            System.out.println(accion);
                        }
                    }
                    break;

                case 8:
                    System.out.println("Cursos con cupo disponible:");
                    for (Curso c : cursos) {
                        if (c.getInscritos() < c.getCupoMaximo()) {
                            c.mostrar();
                        }
                    }
                    break;

                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 9);

        sc.close();
    }
}
