public class Main {
    public static void main(String[] args) {

        Nodo raiz = new Nodo(50);

        raiz.izquierdo = new Nodo(30);
        raiz.izquierdo.izquierdo = new Nodo(20);
        raiz.izquierdo.derecho = new Nodo(40);

        raiz.derecho = new Nodo(70);
        raiz.derecho.derecho = new Nodo(80);
        raiz.derecho.izquierdo = new Nodo(60);

        System.out.println("Raíz: " + raiz.dato);
        System.out.println("Hijo izquierdo: " + raiz.izquierdo.dato);
        System.out.println("Hijo derecho: " + raiz.derecho.dato);
        System.out.println("Hijo iqzuierdo izquierdo: " + raiz.izquierdo.izquierdo.dato);
        System.out.println("Hijo iqzuierdo derecho: " + raiz.izquierdo.derecho.dato);
        System.out.println("Hijo derecho derecho: " + raiz.derecho.derecho.dato);
        System.out.println("Hijo derecho izquierdo: " + raiz.derecho.izquierdo.dato);

    }
}
