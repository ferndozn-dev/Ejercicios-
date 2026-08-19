public class Arbol {

    Nodo raiz;

    //Inserción recursiva
    public Nodo insertar(Nodo nodo, int dato) {

        if (nodo == null) {
            return new Nodo(dato);
        }

        if (dato < nodo.dato) {
            nodo.izquierdo = insertar(nodo.izquierdo, dato);
        } else if (dato > nodo.dato) {
            nodo.derecho = insertar(nodo.derecho, dato);
        }

        return nodo;
    }

    //Método para insertar desde main
    public void insertar(int dato) {
        raiz = insertar(raiz, dato);
    }

    //Recorrido PreOrden
    public void preOrden(Nodo nodo) {

        if (nodo != null) {

            System.out.print(nodo.dato + " ");

            preOrden(nodo.izquierdo);

            preOrden(nodo.derecho);
        }
    }

    public void preOrden() {
        preOrden(raiz);
    }
}
