package app.metodosOrdenamiento;
import app.services.GeneradorDeArchivo;
import app.services.Contador;
public class shellSort {
    private int[] arr;
    private int size;
    private GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();
    private Contador contadorT = new Contador();

    public shellSort(int[] arr){
        this.arr = arr;
        this.size = arr.length;
    }

    public void ordenar(){
        generadorDeArchivo.crearArchivo("shellSort.txt");
        generadorDeArchivo.escribirTextoEnArchivo("Numeros ordenados con algoritmo Shell Sort\n", "shellSort.txt");
        System.out.println("Ordenando con Shell Sort, espere...");
        contadorT.iniciarTiempo();
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
        contadorT.finalizarTiempo();
    for(int i=0;i<size;i++){
        generadorDeArchivo.escribirNumeroEnArchivo(Integer.toString(arr[i]), "shellSort.txt");
    }
    generadorDeArchivo.escribirTextoEnArchivo("\n\nRealizado en: " + contadorT.getTiempoDeEjecucion() + " milisegundos", "shellSort.txt");
        System.out.println("Archivo shellSort.txt generado correctamente."); 
    }
        
}
