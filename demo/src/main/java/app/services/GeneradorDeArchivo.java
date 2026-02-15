package app.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {
    

    public void crearArchivo(String nombre){
    File archivoNuevo = new File(nombre);
    try{
    if(archivoNuevo.createNewFile()){
        System.out.println("Archivo de texto creado correctamente");
        System.out.println("Guardado en la carpeta: " + archivoNuevo.getAbsolutePath());
    }    
    else{System.out.println("Ya existe un archivo con ese nombre, se van a sobreescribir los datos.");
        archivoNuevo.delete();
        archivoNuevo.createNewFile();
        System.out.println("Guardado en la carpeta: " + archivoNuevo.getAbsolutePath());
    }
    }catch(IOException e){System.out.println("Error en la creación. "); e.printStackTrace();}
    }


    public void escribirNumeroEnArchivo(String numero, String archivo){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))){ //true activa "append" para añadir las escrituras y no sobreescribir los números, por eso solo se escribe el último
            writer.write(numero);
            writer.write(", ");
        }catch(IOException e){System.out.println("No se escribió "); e.printStackTrace();}
 
 }

    public void escribirTextoEnArchivo(String texto, String archivo){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))){
            writer.write(texto);
        }catch(IOException e){System.out.println("No se escribió "); e.printStackTrace();}
    }
}
