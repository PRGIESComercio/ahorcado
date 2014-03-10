/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emagic.modelo;

/**
 *
 * @author david
 */
public class Fichero {
    private String palabraSeleccionada;

    public Fichero() {
        palabraSeleccionada = "";
    }
    
    /**
     * Devuelve una palabra buscada en un fichero de forma aleatoria
     * @return Palabra aleatoria
     */
    public String damePalabra() {
        return "otorrinolaringologo".toUpperCase();
    }
    
    
}
