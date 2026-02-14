package app.metodosOrdenamiento;

public class shellSort {
    private int[] arr;
    private int size;

    public shellSort(int[] arr){
        this.arr = arr;
        this.size = arr.length;
    }

    public void ordenar(){
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
    System.out.println("Arreglo ordenado con Shell Sort:");
    for(int i=0;i<size;i++){
        System.out.print(arr[i] + " ");
    }
        System.out.println(); 
    }
        
}
