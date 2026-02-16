package app.services;
import java.io.*;
public class Contador {
    private long inicio;
    private long fin;
    private long tiempoDeEjecucion;

    public void iniciarTiempo() {
        inicio = System.currentTimeMillis();
    }
    
    public void finalizarTiempo() {
        fin = System.currentTimeMillis();
        tiempoDeEjecucion = fin - inicio;
    }

    public long getTiempoDeEjecucion() {
        return tiempoDeEjecucion;
    }
}
