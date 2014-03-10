/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emagic.modelo;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Marcador {
    private ArrayList<Character> listaFallos;
    private ArrayList<Character> listaAciertos;
    private int intentos;

    public Marcador() {
        listaFallos = new ArrayList();
        listaAciertos = new ArrayList();
        intentos = 0;
    }

    public String getListaAciertos() {
        return listaAciertos.toString();
    }

    public String getListaFallos() {
        return listaFallos.toString();
    }

    public int getIntentos() {
        return intentos;
    }
    
    public void addAcierto(char c){
        listaAciertos.add(new Character(Character.toUpperCase(c)));
    }
    
    public void addFallos(char c){
        listaFallos.add(new Character(Character.toUpperCase(c)));
    }
    
    public void addIntentos () {
        intentos++;
    }
    
    public int cuentaFallos() {
        return listaFallos.size()-1;
    }
    
    
    
}
