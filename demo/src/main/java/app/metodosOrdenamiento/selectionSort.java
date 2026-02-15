package app.metodosOrdenamiento;
import app.services.GeneradorDeArchivo;
public class selectionSort {
    private int[] arr;
    private int size;
    private GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();

    public selectionSort(int[] arr){
        this.arr = arr;
        this.size = arr.length;
    }

    public void ordenar(){
        int minimo;
        int temporal;
        for(int i = 0; i<size-1; i++){
        minimo = i;
        for(int j = i+1; j< size; j++){
            if(arr[j]<arr[minimo]){
                minimo = j;
            }
        }
        temporal = arr[i];
        arr[i] = arr[minimo];
        arr[minimo] = temporal;
    }
    generadorDeArchivo.crearArchivo("selectionSort.txt");
    generadorDeArchivo.escribirTextoEnArchivo("Numeros ordenados con algoritmo Selection Sort\n", "selectionSort.txt");
        for(int i=0;i<size;i++){
            generadorDeArchivo.escribirNumeroEnArchivo(Integer.toString(arr[i]), "selectionSort.txt");
        }
        System.out.println("Archivo selectionSort.txt generado correctamente.");
}
}
