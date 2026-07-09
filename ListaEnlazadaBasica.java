public class ListaEnlazadaBasica {
    static void main(){
        Nodo n1 = new Nodo("A");
        Nodo n2 = new Nodo("B");
        Nodo n3 = new Nodo("C");
        Nodo n4 = new Nodo("D");
        Nodo n5 = new Nodo("E");
        Nodo cabeza = n1;
        n1.SiguienteNodo = n2;
        n2.SiguienteNodo = n3;
        n3.SiguienteNodo = n4;
        n4.SiguienteNodo = n5;
    }
}
    
