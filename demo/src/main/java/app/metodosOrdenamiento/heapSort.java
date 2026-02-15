package app.metodosOrdenamiento;
import app.services.GeneradorDeArchivo;
public class heapSort {
    private int[] arr;
    private int size;
    private GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();

    public heapSort(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }

        public void ordenar(){
        generadorDeArchivo.crearArchivo("heapSort.txt");
        generadorDeArchivo.escribirTextoEnArchivo("Numeros ordenados con algoritmo Heap Sort\n", "heapSort.txt");
        ordenarMonticulos(arr);
        for(int i=0;i<size;i++){
            generadorDeArchivo.escribirNumeroEnArchivo(String.valueOf(arr[i]), "heapSort.txt");
        }
        System.out.println("Archivo heapSort.txt generado correctamente.");
    }

        private void heapify(int[] arr, int size, int i) {
        int masGrande = i;       // Inicializar como raíz
        int izquierda = 2 * i + 1;  // hijo izquierdo
        int derecha = 2 * i + 2; // hijo derecho

        // Si el hijo izquierdo es mayor que la raíz
        if (izquierda < size && arr[izquierda] > arr[masGrande]) {
            masGrande = izquierda;
        }

        // Si el hijo derecho es mayor que el mayor actual
        if (derecha < size && arr[derecha] > arr[masGrande]) {
            masGrande = derecha;
        }

        // Si el mayor no es la raíz
        if (masGrande != i) {
            int intercambio = arr[i];
            arr[i] = arr[masGrande];
            arr[masGrande] = intercambio;

            // Recursivamente heapify el subárbol afectado
            heapify(arr, size, masGrande);
        }
    }

        private void ordenarMonticulos(int[] arr) {
        int size = arr.length;

        // 1. Construir el max-heap
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, size, i);
        }

        // 2. Extraer elementos uno por uno
        for (int i = size - 1; i > 0; i--) {
            // Mover raíz actual al final
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Llamar heapify en el heap reducido
            heapify(arr, i, 0);
        }
    }
    
}
