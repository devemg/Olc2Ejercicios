/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador.util;

import intefaz.Principal;
import java.util.ArrayList;

/**
 *
 * @author Emely
 */
public class ListaPalabras extends ArrayList<Palabra> {

    public ListaPalabras() {
        super();
    }

    /**
     * Metodo que verifica si existe la palabra en la lista
     * @param val nombre de la palabra
     * @return si existe o no existe
     */
    public boolean existe(String val) {
        return this.stream().anyMatch((p) -> (p.getPalabra().equals(val)));
    }

    /**
     *Aumenta en uno el contador de la palabra
     * @param val nombre de la palabra ya existente en la lista
     */
    public void aumentar(String val) {
        for (Palabra p : this) {
            if (p.getPalabra().equals(val)) {
                p.setContador(p.getContador() + 1);
                return;
            }
        }
    }

    /**
     * Metodo que muestra las 10 palabras más repetidas en la lista
     * Método para ejercicio número uno de la tarea
     */
    public void Mostrar10MasPuntuadas() {
        if (!this.isEmpty()) {
            //ordenar segun contador
            ordenar();
            //mostrar 10
            int i = 0;
            for (Palabra p : this) {
                Principal.escribirMensajeEnConsola((i+1)+". "+"Palabra:" + p.getPalabra() + " Apariciones:" + p.getContador());
                if (i > 10) {
                    break;
                }
                i++;
            }
        }
    }

    /**
     * Metodo que ordena las palabras segun su contador de mayor a menor
     * utiliza el metodo de burbuja
     */
    private void ordenar() {
        for (int i = 0; i < this.size() - 1; i++) {
            for (int j = 0; j < this.size() - 1; j++) {
                if (this.get(j).getContador() < this.get(j + 1).getContador()) {
                    Palabra tmp = this.get(j + 1);
                    this.set(j + 1, this.get(j));
                    this.set(j, tmp);
                }
            }
        }
    }

    /**
     * Muestra la palabra con el contador mas grande y con el contador más pequeño
     * Metodo para ejercicio número tres de la tarea
     */
    public void MostrarPalabrasLC() {
        if (!this.isEmpty()) {
            ordenar();
            Principal.escribirMensajeEnConsola("Palabra larga: "+this.get(0).getPalabra());
            Principal.escribirMensajeEnConsola("Palabra corta: "+this.get(this.size()-1).getPalabra());
        }
    }

}
