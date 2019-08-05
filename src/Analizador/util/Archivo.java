/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emely
 */
public class Archivo {

    private Archivo() {
    }
 
    /**
     * Metodo para abrir ficheros
     * @param archivo objeto tipo File con información del fichero a abrir
     * @return el contenido del fichero
     */
    public static String AbrirArchivo(File archivo) {
        String aux, texto = "";
        if (archivo != null) {
            try {
                FileReader archivos = new FileReader(archivo);
                try (BufferedReader lee = new BufferedReader(archivos)) {
                    while ((aux = lee.readLine()) != null) {
                        texto += aux + "\n";
                    }
                }
                return texto;
            } catch (IOException ex) {
                System.err.println("Error en Archivo: " + ex.getMessage());
            }
        }
        return null;
    }

    /**
     * Metodo que guarda contenido en los directorios de la computadora
     * @param contenido que se quiere guardar
     * @param path url del archivo en donde se guarda la información
     */
    public static void GuardarArchivo(String contenido,String path){
    File archivo = new File(path);
    try {
            FileWriter archivos = new FileWriter(archivo);
            try (BufferedWriter w = new BufferedWriter(archivos)) {
                w.write(contenido);
            }
        } catch (IOException ex) {
            System.err.println("Error en Archivo: " + ex.getMessage());
        }
    }
    
    /**
     * Escribe un archivo temporal en la carpeta del progama
     * @param nombre del archivo
     * @param contenido que se desea guardar temporalmente
     */
    public static void EscribirArchivoTemporal(String nombre,String contenido){
        try {
            File tempFile = File.createTempFile(nombre,null);
            try (BufferedWriter out = new BufferedWriter(new FileWriter(tempFile))) {
                out.write(contenido);
                out.close();
                //codigo para borrar el archivo temporal
                //tempFile.deleteOnExit();
            }
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
