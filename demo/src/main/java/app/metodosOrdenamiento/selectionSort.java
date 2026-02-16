package app.metodosOrdenamiento;
import app.services.GeneradorDeArchivo;
import app.services.Contador;
public class selectionSort {
    private int[] arr;
    private int size;
    private GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();
    private Contador contadorT = new Contador();

    public selectionSort(int[] arr){
        this.arr = arr;
        this.size = arr.length;
    }

    public void ordenar(){
        generadorDeArchivo.crearArchivo("selectionSort.txt");
        generadorDeArchivo.escribirTextoEnArchivo("Numeros ordenados con algoritmo Selection Sort\n", "selectionSort.txt");
        System.out.println("Ordenando con Selection Sort, espere...");
        int minimo;
        int temporal;
        contadorT.iniciarTiempo();
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
        contadorT.finalizarTiempo();
        for(int i=0;i<size;i++){
            generadorDeArchivo.escribirNumeroEnArchivo(Integer.toString(arr[i]), "selectionSort.txt");
        }
        generadorDeArchivo.escribirTextoEnArchivo("\n\nRealizado en: " + contadorT.getTiempoDeEjecucion() + " milisegundos", "selectionSort.txt");
        System.out.println("Archivo selectionSort.txt generado correctamente.");
}
}
