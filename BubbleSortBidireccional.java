public class BubbleSortBidireccional {

    public static void bubbleSortBidireccional(int[] arr) {
        boolean intercambio = true;
        int inicio = 0;
        int fin = arr.length - 1;

        while (intercambio) {
            intercambio = false;

            // Pasada de izquierda a derecha
            // Mueve el elemento mayor al final
            for (int i = inicio; i < fin; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    intercambio = true;
                }
            }

            // Si no hubo intercambios, ya está ordenado
            if (!intercambio) {
                break;
            }

            fin--;

            intercambio = false;

            // Pasada de derecha a izquierda
            // Mueve el elemento menor al inicio
            for (int i = fin; i > inicio; i--) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;

                    intercambio = true;
                }
            }

            inicio++;
        }
    }

    public static void main(String[] args) {

        int[] numeros = {8, 1, 4, 2, 9, 3, 6};

        System.out.println("Arreglo original:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        bubbleSortBidireccional(numeros);

        System.out.println("\n\nArreglo ordenado:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
