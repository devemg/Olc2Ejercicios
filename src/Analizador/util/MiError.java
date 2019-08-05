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
public class MiError {
    private String mensaje;
    private TipoError tipo;
    private int linea;
    private int columna;
    private String ubicacion;

    public MiError(String error,TipoError tipo,String ubicacion,int linea,int columna) {
        this.mensaje = error;
        this.tipo = tipo;
        this.linea = linea;
        this.columna = columna;
        this.ubicacion=ubicacion;
    }
    
    @Override
    public String toString() {
        return "Error "+this.tipo+": "+this.mensaje+" en linea "+this.linea+" y columna "+this.columna;
        //+" Ubicacion: "+ubicacion;
    }
    
    

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the tipo
     */
    public TipoError getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoError tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the linea
     */
    public int getLinea() {
        return linea;
    }

    /**
     * @param linea the linea to set
     */
    public void setLinea(int linea) {
        this.linea = linea;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
