/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emagic.modelo;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author david
 */
public class Muñeco {
    private JLabel etiqueta;
    private ImageIcon[] muñecos;
    private int fallos;
            
    public Muñeco(JLabel etiqueta) {
        this.etiqueta = etiqueta;
        muñecos = new ImageIcon[6];
        muñecos[0]= new javax.swing.ImageIcon(getClass().getResource("/com/emagic/gfx/cabeza.jpeg"));
        muñecos[1]= new javax.swing.ImageIcon(getClass().getResource("/com/emagic/gfx/tronco.jpeg"));
        muñecos[2]= new javax.swing.ImageIcon(getClass().getResource("/com/emagic/gfx/brazo_derecho.jpeg"));
        muñecos[3]= new javax.swing.ImageIcon(getClass().getResource("/com/emagic/gfx/brazo_izquierdo.jpeg"));
        muñecos[4]= new javax.swing.ImageIcon(getClass().getResource("/com/emagic/gfx/pierna_derecha.jpeg"));
        muñecos[5]= new javax.swing.ImageIcon(getClass().getResource("/com/emagic/gfx/pierna_izquierda.jpeg"));
        fallos = 0;
        this.etiqueta.setIcon(muñecos[fallos]);
    }
    
    public void cambiaMuñeco() {
        this.etiqueta.setIcon(muñecos[++fallos]);
    }

    public boolean ahorcado() {
        if (fallos==5)
            return true;
        else
            return false;
    }
    
    
    
}
