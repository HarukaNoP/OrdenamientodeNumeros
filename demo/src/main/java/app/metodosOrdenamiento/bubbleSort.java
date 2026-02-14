package app.metodosOrdenamiento;

public class bubbleSort {
    private int[] arr;

    public bubbleSort(int[] arr) {
        this.arr = arr;
    }
public void ordenar(){
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
    System.out.println("Arreglo ordenado con Bubble Sort:");
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println(); // Para una nueva línea al final
}

}
