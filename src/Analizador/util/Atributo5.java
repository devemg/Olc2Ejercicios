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
 private int contadorParentesis;
//0=numero;
//2=operacion
//3=parentesis

    public Atributo5(String valor, int contador) {
        this.valor = valor;
        this.contadorParentesis = contador;
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
     * @return the contadorParentesis
     */
    public int getContador() {
        return contadorParentesis;
    }

    /**
     * @param contador the contadorParentesis to set
     */
    public void setContador(int contador) {
        this.contadorParentesis = contador;
    }
}
