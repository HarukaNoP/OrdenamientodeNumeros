package app.metodosOrdenamiento;
import app.services.GeneradorDeArchivo;
import app.services.Contador;
public class quickSort {
    private int[] arr;
    private int size;
    private GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();
    private Contador contadorT = new Contador();

    public quickSort(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
     }

        public void ordenar(){
                generadorDeArchivo.crearArchivo("quickSort.txt");
                generadorDeArchivo.escribirTextoEnArchivo("Numeros ordenados con algoritmo Quick Sort\n", "quickSort.txt");
                System.out.println("Ordenando con Quick Sort, espere...");
                contadorT.iniciarTiempo();
                ordenarRapido(arr, 0, size-1);
                for(int i=0;i<size;i++){
                 generadorDeArchivo.escribirNumeroEnArchivo(String.valueOf(arr[i]), "quickSort.txt");
                }
                contadorT.finalizarTiempo();
                generadorDeArchivo.escribirTextoEnArchivo("\n\nRealizado en: " + contadorT.getTiempoDeEjecucion() + " milisegundos", "quickSort.txt");
                System.out.println("Archivo quickSort.txt generado correctamente.");
        }

        private void ordenarRapido(int[] arr, int bajo, int alto) {
        if (bajo < alto) {
            int pi = partition(arr, bajo, alto);

            // Ordenar recursivamente los elementos antes y después de la partición
            ordenarRapido(arr, bajo, pi - 1);
            ordenarRapido(arr, pi + 1, alto);
        }
    }

        private int partition(int[] arr, int bajo, int alto) {
        int pivote = arr[alto]; // Elegir el último elemento como pivote
        int i = (bajo - 1); // Índice del elemento más pequeño

        for (int j = bajo; j < alto; j++) {
            // Si el elemento actual es menor o igual al pivote
            if (arr[j] <= pivote) {
                i++; // Incrementar el índice del elemento más pequeño
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambiar el pivote con el elemento en i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;

        return i + 1; // Retornar la posición del pivote
}
}
