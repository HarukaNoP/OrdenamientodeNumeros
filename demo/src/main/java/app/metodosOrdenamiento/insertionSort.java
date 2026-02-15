package app.metodosOrdenamiento;
import app.services.GeneradorDeArchivo;
public class insertionSort {
    private int[] arr;
    private int size;
    private GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();

    public insertionSort(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
     }

     public void ordenar(){
        generadorDeArchivo.crearArchivo("insertionSort.txt");
        generadorDeArchivo.escribirTextoEnArchivo("Numeros ordenados con algoritmo Insertion Sort\n", "insertionSort.txt");
        int temporal;
    for(int i = 1; i<size; i++){
        if(arr[i] < arr[i-1]){
            temporal = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > temporal){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temporal;
        }
    }
    for(int i=0;i<size;i++){
        generadorDeArchivo.escribirNumeroEnArchivo(String.valueOf(arr[i]), "insertionSort.txt");
     }
     System.out.println("Archivo insertionSort.txt generado correctamente.");
    }
}
