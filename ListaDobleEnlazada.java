public class ListaDobleEnlazada {

    NodoDoble cabeza;

    // Agregar al inicio
    public void agregarNodoInicio(String datoNodo) {
        NodoDoble nuevo = new NodoDoble(datoNodo);

        if (cabeza != null) {
            cabeza.anterior = nuevo;
            nuevo.siguiente = cabeza;
        }

        cabeza = nuevo;
    }

    // Recorrido de inicio a fin
    public void recorrido() {
        NodoDoble actual = cabeza;

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    // Agregar al final
    public void agregarFinal(String datoNodo) {
        NodoDoble nuevo = new NodoDoble(datoNodo);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        NodoDoble actual = cabeza;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo;
        nuevo.anterior = actual;
    }

    // Eliminar nodo
    public boolean eliminarNodo(String datoEliminar) {

        if (cabeza == null) {
            return false;
        }

        // Si el primer nodo es el que se elimina
        if (cabeza.dato.equals(datoEliminar)) {
            cabeza = cabeza.siguiente;

            if (cabeza != null) {
                cabeza.anterior = null;
            }

            return true;
        }

        NodoDoble actual = cabeza;

        while (actual != null) {

            if (actual.dato.equals(datoEliminar)) {

                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                }

                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                }

                return true;
            }

            actual = actual.siguiente;
        }

        return false;
    }

    // Buscar nodo
    public boolean buscarNodo(String datoBuscar) {

        NodoDoble actual = cabeza;

        while (actual != null) {
            if (actual.dato.equals(datoBuscar)) {
                return true;
            }
            actual = actual.siguiente;
        }

        return false;
    }

    // Actualizar nodo
    public boolean actualizarNodo(String datoActual, String datoNuevo) {

        NodoDoble actual = cabeza;

        while (actual != null) {
            if (actual.dato.equals(datoActual)) {
                actual.dato = datoNuevo;
                return true;
            }
            actual = actual.siguiente;
        }

        return false;
    }

    // Recorrido de fin a inicio
    public void recorridoInverso() {

        if (cabeza == null) {
            return;
        }

        NodoDoble actual = cabeza;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.anterior;
        }
    }
}
