/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador.util;

/**
 *
 * @author Emely
 */
    public class Palabra{
    private String palabra;
    private int contador;

        public Palabra(String palabra, int contador) {
            this.palabra = palabra;
            this.contador = contador;
        }

    public Palabra(String val) {
        //cuenta las letras de la palabra
        this.palabra=val;
        this.contador=val.length();
    }

        /**
         * @return the palabra
         */
        public String getPalabra() {
            return palabra;
        }

        /**
         * @param palabra the palabra to set
         */
        public void setPalabra(String palabra) {
            this.palabra = palabra;
        }

        /**
         * @return the contador
         */
        public int getContador() {
            return contador;
        }

        /**
         * @param contador the contador to set
         */
        public void setContador(int contador) {
            this.contador = contador;
        }
    }