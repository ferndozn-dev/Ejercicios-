import java.util.Arrays;

public class QuickSortEjemplo {

    // Método principal del algoritmo QuickSort
    public static void ordenarQuickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            // Obtiene la posición final del pivote tras reorganizar los elementos
            int posicionPivote = reorganizarYObtenerPivote(arreglo, inicio, fin);

            // Llamadas recursivas para ordenar la sublista izquierda y derecha
            ordenarQuickSort(arreglo, inicio, posicionPivote - 1);
            ordenarQuickSort(arreglo, posicionPivote + 1, fin);
        }
    }

    // Método auxiliar encargado de dividir y colocar el pivote en su lugar correcto
    private static int reorganizarYObtenerPivote(int[] arreglo, int inicio, int fin) {
        int pivote = arreglo[fin]; // Seleccionamos el último elemento como pivote
        int indiceMenores = inicio - 1; // Marca el límite de los números menores al pivote

        for (int indiceActual = inicio; indiceActual < fin; indiceActual++) {
            // Si encontramos un elemento menor o igual al pivote, lo movemos a la izquierda
            if (arreglo[indiceActual] <= pivote) {
                indiceMenores++;
                intercambiar(arreglo, indiceMenores, indiceActual);
            }
        }

        // Colocamos el pivote en su posición final (justo después de todos los menores)
        intercambiar(arreglo, indiceMenores + 1, fin);

        return indiceMenores + 1; // Retorna la posición exacta donde quedó el pivote
    }

    // Método auxiliar sencillo para intercambiar dos valores dentro del arreglo
    private static void intercambiar(int[] arreglo, int i, int j) {
        int temporal = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temporal;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 7, 8, 9, 1, 5};

        // Mostrar los datos ANTES de procesar
        System.out.println("Arreglo ANTES de ordenar: " + Arrays.toString(numeros));

        // Proceso de ordenamiento
        ordenarQuickSort(numeros, 0, numeros.length - 1);

        // Mostrar los datos DESPUÉS de procesar
        System.out.println("Arreglo DESPUÉS de ordenar: " + Arrays.toString(numeros));
    }
}
