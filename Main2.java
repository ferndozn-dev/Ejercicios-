import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaSimple lista = new ListaSimple();
        ListaDoble listaDoble = new ListaDoble();
        Stack<String> historial = new Stack<>();

        int opcion;

        do {

            System.out.println("\n===== SISTEMA DE GESTIÓN DE CURSOS UTC 2.0 =====");
            System.out.println("1. Agregar curso");
            System.out.println("2. Mostrar cursos");
            System.out.println("3. Buscar curso por clave");
            System.out.println("4. Eliminar curso");
            System.out.println("5. Inscribir estudiante");
            System.out.println("6. Dar de baja estudiante");
            System.out.println("7. Mostrar cursos de inicio a fin");
            System.out.println("8. Mostrar cursos de fin a inicio");
            System.out.println("9. Navegador de cursos");
            System.out.println("10. Contar cursos (Recursividad)");
            System.out.println("11. Buscar curso (Recursividad)");
            System.out.println("12. Mostrar historial");
            System.out.println("13. Salir");
            System.out.print("Seleccione una opción: ");

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

                    if (lista.agregar(nuevo)) {

                        listaDoble.cargarDesdeListaSimple(lista);

                        historial.push("Se agregó el curso: " + nombre);

                        System.out.println("Curso registrado correctamente.");

                    } else {

                        System.out.println("Ya existe un curso con esa clave.");

                    }

                    break;


                case 2:

                    lista.mostrar();

                    break;

                case 3:

                    System.out.print("Ingrese la clave: ");
                    String buscar = sc.nextLine();

                    Curso encontrado = lista.buscar(buscar);

                    if (encontrado != null) {
                        encontrado.mostrar();

                    } else {

                        System.out.println("Curso no encontrado.");

                    }

                    break;

                case 4:

                    System.out.print("Clave del curso a eliminar: ");
                    String eliminar = sc.nextLine();

                    Curso cursoEliminar = lista.buscar(eliminar);

                    if (cursoEliminar != null) {
                        if (lista.eliminar(eliminar)) {
                            listaDoble.cargarDesdeListaSimple(lista);
                            historial.push("Se eliminó el curso: "
                                    + cursoEliminar.getNombre());
                            System.out.println("Curso eliminado.");

                        }

                    } else {

                        System.out.println("El curso no existe.");

                    }

                    break;
              
                case 5:

                    System.out.print("Clave del curso: ");
                    String claveInscribir = sc.nextLine();

                    Curso cursoInscribir = lista.buscar(claveInscribir);

                    if (cursoInscribir != null) {
                        if (cursoInscribir.inscribir()) {
                            historial.push("Se inscribió un estudiante en: "
                                    + cursoInscribir.getNombre());
                            listaDoble.cargarDesdeListaSimple(lista);
                            System.out.println("Estudiante inscrito correctamente.");
                        } else {
                            System.out.println("No hay cupo disponible.");
                        }
                    } else {
                        System.out.println("Curso no encontrado.");
                    }

                    break;

                case 6:

                    System.out.print("Clave del curso: ");
                    String claveBaja = sc.nextLine();

                    Curso cursoBaja = lista.buscar(claveBaja);

                    if (cursoBaja != null) {
                        if (cursoBaja.baja()) {
                            historial.push("Se dio de baja un estudiante de: "
                                    + cursoBaja.getNombre());
                            listaDoble.cargarDesdeListaSimple(lista);
                            System.out.println("Estudiante dado de baja.");
                        } else {
                            System.out.println("El curso no tiene estudiantes inscritos.");
                        }
                    } else {
                        System.out.println("Curso no encontrado.");
                    }
                    break;

 
                case 7:

                    listaDoble.cargarDesdeListaSimple(lista);
                    listaDoble.mostrarInicioFin();
                    break;

                case 8:

                    listaDoble.cargarDesdeListaSimple(lista);
                    listaDoble.mostrarFinInicio();

                    break;

                case 9:

                    listaDoble.cargarDesdeListaSimple(lista);
                    listaDoble.navegador();

                    break;
                                    
                case 10:

                    System.out.println("Total de cursos registrados: "
                            + lista.contarCursos());

                    break;

                case 11:

                    System.out.print("Ingrese la clave: ");
                    String claveRec = sc.nextLine();

                    Curso cursoRec = lista.buscarRecursivo(claveRec);

                    if (cursoRec != null) {
                        System.out.println("\nCurso encontrado:");
                        cursoRec.mostrar();

                    } else {

                        System.out.println("Curso no encontrado.");

                    }

                    break;

                case 12:

                    if (historial.isEmpty()) {

                        System.out.println("No hay acciones registradas.");

                    } else {

                        System.out.println("\n===== HISTORIAL =====");

                        for (String accion : historial) {
                            System.out.println(accion);
                        }

                    }

                    break;

                case 13:

                    System.out.println("Gracias por utilizar el Sistema de Gestión de Cursos UTC 2.0");

                    break;

                default:

                    System.out.println("Opción inválida.");

            }

        } while (opcion != 13);

        sc.close();

    }

}
