import java.util.Scanner;

public class MenuDobleListaEnlazada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ListaDobleEnlazada lista = new ListaDobleEnlazada();

        int opcion;
        String dato, nuevoDato;

        do {
            System.out.println("\n");
            System.out.println("   LISTA DOBLE ENLAZADA   ");
            System.out.println("");
            System.out.println("1. Agregar nodo al inicio");
            System.out.println("2. Agregar nodo al final");
            System.out.println("3. Mostrar lista de inicio a fin");
            System.out.println("4. Buscar nodo");
            System.out.println("5. Actualizar nodo");
            System.out.println("6. Eliminar nodo");
            System.out.println("7. Mostrar lista de fin a inicio");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el dato a agregar: ");
                    dato = entrada.nextLine();
                    lista.agregarNodoInicio(dato);
                    System.out.println("Nodo agregado correctamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el dato del nodo a agregar al final: ");
                    String datoFinal = entrada.nextLine();
                    lista.agregarFinal(datoFinal);
                    break;

                case 3:
                    System.out.println("\n      LISTA      ");
                    lista.recorrido();
                    break;

                case 4:
                    System.out.print("Ingrese el dato del nodo a buscar: ");
                    String datoBuscar = entrada.nextLine();
                    if (lista.buscarNodo(datoBuscar)) {
                        System.out.println("Nodo encontrado.");
                    } else {
                        System.out.println("Nodo no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese el dato que desea actualizar: ");
                    dato = entrada.nextLine();

                    System.out.print("Ingrese el nuevo dato: ");
                    nuevoDato = entrada.nextLine();

                    lista.actualizarNodo(dato, nuevoDato);
                    break;

                case 6:
                    System.out.print("Ingrese el dato que desea eliminar: ");
                    dato = entrada.nextLine();
                    lista.eliminarNodo(dato);
                    break;
                case 7:
                    System.out.println("\n      LISTA      ");
                    lista.recorridoInverso();
                    break;
                case 8:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 8);

        entrada.close();
    }
}
