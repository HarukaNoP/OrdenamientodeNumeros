package app.metodosOrdenamiento;
import app.services.GeneradorDeArchivo;
import app.services.Contador;
public class countingSort {
    private int[] arr;
    private int size;
    private GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();
    private Contador contadorT = new Contador();

    public countingSort(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }

    public void ordenar(){
        generadorDeArchivo.crearArchivo("countingSort.txt");
        generadorDeArchivo.escribirTextoEnArchivo("Numeros ordenados con algoritmo Counting Sort\n", "countingSort.txt");
        System.out.println("Ordenando con Counting Sort, espere...");
        contadorT.iniciarTiempo();
        int maximo = arr[0];
        int minimo = arr[0];
        for(int i = 1; i < size; i++){
            if(arr[i] > maximo){
                maximo = arr[i];
            }
            if(arr[i] < minimo){
                minimo = arr[i];
            }
        }
        //cuento la cantidad de veces que se repite cada numero
        int rango = maximo - minimo + 1;
        int[] contador = new int[rango];
        int[] ordenado = new int[size];
        for(int i = 0; i<size; i++){
            contador[arr[i] - minimo]++;
        }

        //Suma de cada posición en el contador secuencialmente
        for(int i = 1; i<rango; i++){
            contador[i] += contador[i-1];
        }
        
        //Ordeno los números según su indice
        for(int i = 0; i< size; i++){
            ordenado[contador[arr[i] - minimo]-1] = arr[i];
            contador[arr[i] - minimo]--;
        }
        contadorT.finalizarTiempo();
        for(int i=0;i<ordenado.length;i++){
            generadorDeArchivo.escribirNumeroEnArchivo(Integer.toString(ordenado[i]), "countingSort.txt");
        }
        generadorDeArchivo.escribirTextoEnArchivo("\n\nRealizado en: " + contadorT.getTiempoDeEjecucion() + " milisegundos", "countingSort.txt");
        System.out.println("Archivo countingSort.txt generado correctamente.");
    }
}
