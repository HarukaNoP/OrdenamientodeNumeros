package app;
import app.metodosOrdenamiento.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6}; //arreglo temporal para pruebas
        int opcion;
        Scanner uScanner = new Scanner(System.in);

        do{
            System.out.println("------MENU DE ORDENAMIENTO------");
            System.out.println("1. Bubble Sort\n"
                             + "2. Counting Sort\n"
                             + "3. Heap Sort\n"
                             + "4. Insertion Sort\n"
                             + "5. Merge Sort\n"
                             + "6. Quick Sort\n"
                             + "7. Selection Sort\n"
                             + "8. Shell Sort\n"
                             + "9. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = uScanner.nextInt();
                       
            switch(opcion){
                case 1:
                    bubbleSort bubbleSort = new bubbleSort(arr);
                    bubbleSort.ordenar();
                    espera();
                    break;
                case 2:
                    countingSort countingSort = new countingSort(arr);
                    countingSort.ordenar();
                    espera();
                    break;    
                case 3:
                    heapSort heapSort = new heapSort(arr);
                    heapSort.ordenar();
                    espera();
                    break;
                case 4:
                    insertionSort insertionSort = new insertionSort(arr);
                    insertionSort.ordenar();
                    espera();
                    break;
                case 5:
                    mergeSort mergeSort = new mergeSort(arr);
                    mergeSort.ordenar();
                    espera();
                    break;
                case 6:
                    quickSort quickSort = new quickSort(arr);
                    quickSort.ordenar();
                    espera();
                    break;
                case 7:
                    selectionSort selectionSort = new selectionSort(arr);
                    selectionSort.ordenar();
                    espera();
                    break;
                case 8:
                    shellSort shellSort = new shellSort(arr);
                    shellSort.ordenar();
                    espera();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    opcion = 0; 
                    break;
                default:
                    System.out.println("Opción invalida.");
                    break;
            }
        }while(opcion != 0);
        uScanner.close();
    }

    public static void espera(){
        Scanner tecla = new Scanner(System.in);
        System.out.println("Presione Enter para continuar...");
        if (tecla.hasNextLine()) {
            tecla.nextLine();
        }
        tecla.close();
    }
}