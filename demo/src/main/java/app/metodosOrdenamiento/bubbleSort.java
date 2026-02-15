package app.metodosOrdenamiento;
import app.services.GeneradorDeArchivo;
public class bubbleSort {
    private int[] arr;
    private GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();

    public bubbleSort(int[] arr) {
        this.arr = arr;
    }
public void ordenar(){
        generadorDeArchivo.crearArchivo("bubbleSort.txt");
        generadorDeArchivo.escribirTextoEnArchivo("Numeros ordenados con algoritmo Bubble Sort\n", "bubbleSort.txt");
            int temporal;
        for(int j = 0; j<arr.length-1;++j){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                temporal = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temporal;
            }
        }
    }
    for(int i = 0; i<arr.length; i++){
        generadorDeArchivo.escribirNumeroEnArchivo(Integer.toString(arr[i]), "bubbleSort.txt");
    }
    System.out.println("Archivo bubbleSort.txt generado correctamente.");
}

}
