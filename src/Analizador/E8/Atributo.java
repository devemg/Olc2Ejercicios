/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador.E8;


/**
 *Atributo utilizado para poder sintetizar más de un valor a la vez
 * @author Emely
 */
public class Atributo {
    private String cadena;
    private char tipo;
    //I = id
    //S = suma
    //M = multiplicacion

    public Atributo(String cadena, char tipo) {
        this.cadena = cadena;
        this.tipo = tipo;
    }

    
    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    /**
     * @return the tipo
     */
    public char getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
}
