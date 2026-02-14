package app.metodosOrdenamiento;

public class countingSort {
    private int[] arr;
    private int size;

    public countingSort(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }

    public void ordenar(){
        int maximo = arr[0];
        for(int i = 1; i < size; i++){
            if(arr[i] > maximo){
                maximo = arr[i];
            }
        }
        //cuento la cantidad de veces que se repite cada numero
        int[] contador = new int[maximo+1];
        int[] ordenado = new int[size];
        for(int i = 0; i<size; i++){
            contador[arr[i]]++;
        }

        //Suma de cada posición en el contador secuencialmente
        for(int i = 1; i<size+1; i++){
            contador[i] += contador[i-1];
        }
        
        //Ordeno los números según su indice
        for(int i = 0; i< size; i++){
            ordenado[contador[arr[i]]-1] = arr[i];
            contador[arr[i]]--;
        }
        System.out.println("Arreglo ordenado con Counting Sort:");
        for(int i=0;i<ordenado.length;i++){
            System.out.print(ordenado[i] + " ");
        }
        System.out.println();
    }
}
