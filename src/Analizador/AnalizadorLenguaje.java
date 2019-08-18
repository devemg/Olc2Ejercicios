/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

import Analizador.E1.*;
import Analizador.E2.*;
import Analizador.E3.*;
import Analizador.E5.*;
import Analizador.E6.*;
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
    //private static LinkedList<Importar> importaciones;
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
        }
        return null;
    }

    private AnalizadorLenguaje() {
        errores = new ArrayList<>();
    }

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

    public static AnalizadorLenguaje getInstancia() {
        if (analizador == null) {
            analizador = new AnalizadorLenguaje();
        }
        return analizador;
    }

    public static void LimpiarInstancia() {
        if (analizador != null) {
            AnalizadorLenguaje.setErrores(new ArrayList<>());
        } else {
            System.out.println("No existe un analizador");
        }
    }

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
