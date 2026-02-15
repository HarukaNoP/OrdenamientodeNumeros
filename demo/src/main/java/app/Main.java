package app;
import app.metodosOrdenamiento.*;
import app.services.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcion; int opcion2;
        int[] arr = null;
        Scanner uScanner = new Scanner(System.in);
        Reproductor reproductor = new Reproductor();
        reproductor.reproducirMusica("AntiEstres.wav");

        do{
            System.out.println("------MENU PRINCIPAL------");
            System.out.println("Generar números aleatoriamente, seleccione el rango: \n"
                +"1. -10,000 a 10,000\n"
                +"2. -100,000 a 100,000\n"
                +"3. -10,000,000 a 10,000,000\n"
                +"4. Salir"
            );
            System.out.print("Ingrese el rango para generar números:");
            opcion2 = uScanner.nextInt();
            switch(opcion2){
                case 1:
                    arr = new int[10000];
                    GeneradorDeNumeros generador1 = new GeneradorDeNumeros(10000);
                    arr = generador1.generarNumeros(-10000, 10000);
                    System.out.println("Numeros generados correctamente.");
                    opcion2 = 0; // Salir del menú de generación después de generar los números
                    break;
                case 2:
                    arr = new int[100000];
                    GeneradorDeNumeros generador2 = new GeneradorDeNumeros(100000);
                    arr = generador2.generarNumeros(-100000, 100000);
                    System.out.println("Numeros generados correctamente.");
                    opcion2 = 0; // Salir del menú de generación después de generar los números
                    break;
                case 3:
                    arr = new int[10000000];
                    GeneradorDeNumeros generador3 = new GeneradorDeNumeros(10000000);
                    arr = generador3.generarNumeros(-10000000, 10000000);
                    System.out.println("Numeros generados correctamente.");
                    opcion2 = 0; // Salir del menú de generación después de generar los números
                    break;
                case 4:
                    opcion2 = 0; 
                    break;
                default:
                    System.out.println("Opción invalida.");
                    break;
            }

        }while(opcion2 != 0);
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
    }
}