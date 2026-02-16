package app.metodosOrdenamiento;
import app.services.GeneradorDeArchivo;
import app.services.Contador;
public class mergeSort {
    private int[] arr;
    private int size;
    private GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();
    private Contador contadorT = new Contador();

    public mergeSort(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
     }

        public void ordenar(){
                generadorDeArchivo.crearArchivo("mergeSort.txt");
                generadorDeArchivo.escribirTextoEnArchivo("Numeros ordenados con algoritmo Merge Sort\n", "mergeSort.txt");
                System.out.println("Ordenando con Merge Sort, espere...");
                contadorT.iniciarTiempo();
                ordenarMezcla(arr, 0, size-1);
    for(int i=0;i<size;i++){
        generadorDeArchivo.escribirNumeroEnArchivo(String.valueOf(arr[i]), "mergeSort.txt");
        }
        contadorT.finalizarTiempo();
        generadorDeArchivo.escribirTextoEnArchivo("\n\nRealizado en: " + contadorT.getTiempoDeEjecucion() + " milisegundos", "mergeSort.txt");
        System.out.println("Archivo mergeSort.txt generado correctamente.");
    }

        private void ordenarMezcla(int[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) {
            // Encontrar el punto medio del arreglo
            int medio = izquierda + (derecha - izquierda) / 2;

            // Ordenar recursivamente las dos mitades
            ordenarMezcla(arr, izquierda, medio);
            ordenarMezcla(arr, medio + 1, derecha);

            // Combinar las mitades ordenadas
            merge(arr, izquierda, medio, derecha);
        }
    }

        private void merge(int[] arr, int izquierda, int medio, int derecha) {
        // Crear arreglos temporales
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[izquierda + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[medio + 1 + j];
        }

        // Combinar los arreglos temporales
        int i = 0, j = 0;
        int k = izquierda;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de L[], si hay alguno
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes de R[], si hay alguno
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
