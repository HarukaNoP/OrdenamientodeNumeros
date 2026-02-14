package app.metodosOrdenamiento;

public class insertionSort {
    private int[] arr;
    private int size;

    public insertionSort(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
     }

     public void ordenar(){
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
    System.out.println("Arreglo ordenado con Insertion Sort:");
    for(int i=0;i<size;i++){
        System.out.print(arr[i] + " ");
     }
     System.out.println();
    }
}
