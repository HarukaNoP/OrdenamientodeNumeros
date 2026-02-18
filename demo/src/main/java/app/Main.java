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
            System.out.println("------GENERADOR Y ANALIZADOR DE NÚMEROS ALEATORIOS------");
            System.out.println("-----MENÚ PRINCIPAL----- \n"
                +"1. Iniciar\n"
                +"2. Salir"
            );
            System.out.print("Seleccione una opción :");
            opcion2 = uScanner.nextInt();
            switch(opcion2){
                case 1:
                    arr = new int[10000];
                    GeneradorDeNumeros generador1 = new GeneradorDeNumeros(10000);//Cambiar para generar los 10 millones de números
                    arr = generador1.generarNumeros(-100000000, 100000000); 
                    System.out.println("Numeros generados correctamente.");
                    opcion2 = 0; // Salir del menú de generación después de generar los números
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    return; // Salir del programa
                default:
                    System.out.println("Opción invalida.");
                    break;
            }

        }while(opcion2 != 0);
        do{
            System.out.println("------MENU DE ORDENAMIENTO------");
            System.out.println("1. Bubble Sort\n" //intro y bubble Jeyling
                             + "2. Counting Sort\n" //Aarón 
                             + "3. Heap Sort\n" //Aarón
                             + "4. Insertion Sort\n" //paola
                             + "5. Merge Sort\n" //paola
                             + "6. Quick Sort\n" //Gerson
                             + "7. Selection Sort\n" //Gerson
                             + "8. Shell Sort\n" //yo :)
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