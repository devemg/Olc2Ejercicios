/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;
/**
 *
 * @author Emely
 */
public class GeneradorCompilador {
    public static void main(String[] args){
        generarCompilador("E20");
    }

    /**
     * Metodo que genera los analizadores en función de los archivos .jlex y .cup
     * Colocar los archivos en carpetas separadas dentro del package Analizador
     * Ej. Analizador->
     *                  Analizador.Lenguaje->
     *                                      ScannerLenguaje.jlex
     *                                      ParserLenguaje.cup
     * @param subName nombre del analizador especificado en los archivos
     * reemplazando Lenguaje en ejemplo de arriba
     */
       public static void generarCompilador(String subName) {
        try {  
            String ruta="src/Analizador/"+subName+"/";
            String opcFlex[] = {ruta + "Scanner"+subName+".jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
           
            String opcCUP[] = {"-destdir", ruta,"-expect","3", "-parser", "Parser"+subName, ruta + "Parser"+subName+".cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
        }
        }

    
}
