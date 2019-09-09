/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

import Analizador.E1.*;
import Analizador.E17.*;
import Analizador.E19.*;
import Analizador.E2.*;
import Analizador.E3.*;
import Analizador.E5.*;
import Analizador.E6.*;
import Analizador.E7.*;
import Analizador.E18.*;
import Analizador.E16.*;
import Analizador.E20.*;
import Analizador.E8.*;
import Analizador.util.MiError;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java_cup.runtime.lr_parser;

/**
 *
 * @author Emely
 */
public class AnalizadorLenguaje {

    private static ArrayList<MiError> errores;
    private static AnalizadorLenguaje analizador;

    public static void addError(MiError miError) {
        getErrores().add(miError);
    }

    /**
     * @return the errores
     */
    public static ArrayList<MiError> getErrores() {
        return errores;
    }

    /**
     * @param aErrores the errores to set
     */
    public static void setErrores(ArrayList<MiError> aErrores) {
        errores = aErrores;
    }

    /**
     * Método que retorna un objeto tipo Parser LR en funcion de la entrada 
     * y el numero que indica el No. de ejercicio
     * @param entrada texto a analizar
     * @param num Número de ejercicio a probar
     * @return Parser LR 
     */
    private static lr_parser getParser(String entrada, int num) {
        switch (num) {
            case 1:
                return new ParserE1(new ScannerE1(new BufferedReader(new StringReader(entrada))));
            case 2:
                return new ParserE2(new ScannerE2(new BufferedReader(new StringReader(entrada))));
            case 3:
                return new ParserE3(new ScannerE3(new BufferedReader(new StringReader(entrada))));
            case 5:
                return new ParserE5(new ScannerE5(new BufferedReader(new StringReader(entrada))));
            case 6:
                return new ParserE6(new ScannerE6(new BufferedReader(new StringReader(entrada))));
            case 7:
                return new ParserE7(new ScannerE7(new BufferedReader(new StringReader(entrada))));
         case 8:
                return new ParserE8(new ScannerE8(new BufferedReader(new StringReader(entrada))));
             case 19:
                return new ParserE19(new ScannerE19(new BufferedReader(new StringReader(entrada))));
         case 17:
                return new ParserE17(new ScannerE17(new BufferedReader(new StringReader(entrada))));
             case 18:
                return new ParserE18(new ScannerE18(new BufferedReader(new StringReader(entrada))));
                 case 16:
                return new ParserE16(new ScannerE16(new BufferedReader(new StringReader(entrada))));
                     case 20:
                return new ParserE20(new ScannerE20(new BufferedReader(new StringReader(entrada))));
        }
        return null;
    }

    /***
     * Constructor privado de la clase estatica
     * así la clase no puede ser instanciada
     * Patrón de diseño Singleton
     */
    private AnalizadorLenguaje() {
        errores = new ArrayList<>();
    }

    /**
     * Metodo principal el cual genera el parser, analiza la entrada y produce resultados
     * @param entrada texto a analizar
     * @param num Número de ejercicio a probar
     * @return true si el análisis fue correcto y false si existió algún error
     */
    public static boolean Analizar(String entrada, int num) {
        try {

            getParser(entrada, num).parse();
            System.out.println("Sin errores");
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        //CleanEr
        ArrayList<MiError> mierr = new ArrayList<>();
        for (MiError er : AnalizadorLenguaje.getErrores()) {
            if (!er.getMensaje().contains("##")) {
                mierr.add(er);
            }
        }
        AnalizadorLenguaje.setErrores(mierr);
        return getErrores().isEmpty();
    }

    /**
     * Método utilizado para obtener acceso a la única instancia de la clase
     * Patrón de diseño singleton
     * @return 
     */
    public static AnalizadorLenguaje getInstancia() {
        if (analizador == null) {
            analizador = new AnalizadorLenguaje();
        }
        return analizador;
    }

    /**
     * Método que limpia la instancia del analizador para un nuevo análisis
     * Patrón de diseño singleton
     */
    public static void LimpiarInstancia() {
        if (analizador != null) {
            AnalizadorLenguaje.setErrores(new ArrayList<>());
        } else {
            System.out.println("No existe un analizador");
        }
    }

    /**
     * Método que evita que la clase pueda ser clonada
     * Patrón de diseño Singleton
     * @return
     * @throws CloneNotSupportedException 
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar");
        }
        return null;
    }

}
