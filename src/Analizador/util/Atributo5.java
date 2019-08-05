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
public class Atributo5 {
 private String valor;
 private int tipo;
//0=numero;
//2=operacion
//3=parentesis

    public Atributo5(String valor, int tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }
 
    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
