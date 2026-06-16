import java.util.*;

public class Cafeteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<String> colaClientes = new LinkedList<>();
        Stack<String> pedidosCancelados = new Stack<>();

        int opcion;
        String nombre;

        do {
            System.out.println("\n--- MENU CAFETERIA ---");
            System.out.println("1. Llegar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Cancelar pedido");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Mostrar cancelaciones");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    nombre = sc.nextLine();
                    colaClientes.add(nombre);
                    System.out.println(nombre + " entró a la cola.");
                    break;

                case 2:
                    if (!colaClientes.isEmpty()) {
                        String atendido = colaClientes.poll();
                        System.out.println("Atendiendo a: " + atendido);
                    } else {
                        System.out.println("No hay clientes en espera.");
                    }
                    break;

                case 3:
                    if (!colaClientes.isEmpty()) {
                        String cancelado = colaClientes.poll();
                        pedidosCancelados.push(cancelado);
                        System.out.println("Pedido cancelado de: " + cancelado);
                    } else {
                        System.out.println("No hay pedidos para cancelar.");
                    }
                    break;

                case 4:
                    if (colaClientes.isEmpty()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("Clientes en cola: " + colaClientes);
                    }
                    break;

                case 5:
                    if (pedidosCancelados.isEmpty()) {
                        System.out.println("No hay cancelaciones.");
                    } else {
                        System.out.println("Pedidos cancelados: " + pedidosCancelados);
                    }
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}
