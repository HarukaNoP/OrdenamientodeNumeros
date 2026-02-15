package app.services;
import java.io.File;
import javax.sound.sampled.*;

public class Reproductor {
    private Clip clip;
    
    public void reproducirMusica(String ruta){
        try{
            File archivo = new File(ruta);
            if(!archivo.exists()){
                System.out.println("El archivo de audio no existe o no se encontró: " + ruta);
                return;
            }
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(archivo);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            System.out.println("No se puede reproducir el archivo de audio: " + e.getMessage());
        }
    }
}

