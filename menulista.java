import java.util.Scanner;

public class menulista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Agregar nodo al inicio");
            System.out.println("2. Agregar nodo al final");
            System.out.println("3. Recorrer la lista");
            System.out.println("4. Eliminar nodo");
            System.out.println("5. Buscar nodo");
            System.out.println("6. Actualizar nodo");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato del nodo a agregar al inicio: ");
                    String datoInicio = scanner.nextLine();
                    lista.agregarNodoInicio(datoInicio);
                    break;
                case 2:
                    System.out.print("Ingrese el dato del nodo a agregar al final: ");
                    String datoFinal = scanner.nextLine();
                    lista.agregarFinal(datoFinal);
                    break;
                case 3:
                    lista.recorrido();
                    break;
                case 4:
                    System.out.print("Ingrese el dato del nodo a eliminar: ");
                    String datoEliminar = scanner.nextLine();
                    if (lista.eliminarNodo(datoEliminar)) {
                        System.out.println("Nodo eliminado correctamente.");
                    } else {
                        System.out.println("Nodo no encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el dato del nodo a buscar: ");
                    String datoBuscar = scanner.nextLine();
                    if (lista.buscarNodo(datoBuscar)) {
                        System.out.println("Nodo encontrado.");
                    } else {
                        System.out.println("Nodo no encontrado.");
                    }
                    break;
                case 6:
                    System.out.print("Ingrese el dato del nodo a actualizar: ");
                    String datoActual = scanner.nextLine();
                    System.out.print("Ingrese el nuevo dato: ");
                    String datoNuevo = scanner.nextLine();
                    if (lista.actualizarNodo(datoActual, datoNuevo)) {
                        System.out.println("Nodo actualizado correctamente.");
                    } else {
                        System.out.println("Nodo no encontrado.");
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }        
        } while (opcion != 7);
        
        scanner.close();
    }
}
