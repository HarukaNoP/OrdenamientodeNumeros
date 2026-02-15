package app.metodosOrdenamiento;
import app.services.GeneradorDeArchivo;
public class shellSort {
    private int[] arr;
    private int size;
    private GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();
    public shellSort(int[] arr){
        this.arr = arr;
        this.size = arr.length;
    }

    public void ordenar(){
        generadorDeArchivo.crearArchivo("shellSort.txt");
        generadorDeArchivo.escribirTextoEnArchivo("Numeros ordenados con algoritmo Shell Sort\n", "shellSort.txt");
            int brecha = size/2;
    while(brecha > 0){
        for(int i = brecha; i<size; i++){
            int buffer = arr[i];
            int indice = i;
            while(indice >= brecha && arr[indice-brecha]>buffer){
                arr[indice] = arr[indice-brecha];
                indice -= brecha;
            }
            arr[indice] = buffer;
        }
        brecha /= 2;
    }
    for(int i=0;i<size;i++){
        generadorDeArchivo.escribirNumeroEnArchivo(Integer.toString(arr[i]), "shellSort.txt");
    }
        System.out.println("Archivo shellSort.txt generado correctamente."); 
    }
        
}
