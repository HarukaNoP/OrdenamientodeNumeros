package app.services;
import java.util.concurrent.ThreadLocalRandom;
public class GeneradorDeNumeros {
    private int rango;

    public GeneradorDeNumeros(int rango) {
        this.rango = rango;
    }

    public int[] generarNumeros(int inferior, int superior){
        int[] numeros = new int[rango];
        for(int i = 0; i < (rango); i++){
            int numeroGenerado = ThreadLocalRandom.current().nextInt(inferior, superior);
            numeros[i] = numeroGenerado;
        }
        return numeros;
    }
}
