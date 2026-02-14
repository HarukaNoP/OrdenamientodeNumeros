package app.metodosOrdenamiento;

public class selectionSort {
    private int[] arr;
    private int size;

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
        System.out.println("Arreglo ordenado con Selection Sort:");
        for(int i=0;i<size;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println(); 
}
}
