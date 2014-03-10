/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emagic.vista;

import com.emagic.modelo.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class FrmAhorcado extends javax.swing.JFrame {

    private Muñeco muñeco;
    private Palabra palabra;
    private Marcador marcador;

    /**
     * Creates new form FrmAhorcado
     */
    public FrmAhorcado() {
        initComponents();
        ImageIcon img = new javax.swing.ImageIcon(getClass().getResource("/com/emagic/gfx/tux.gif"));
        this.setIconImage(img.getImage());   
        jTextFieldLetra.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelPalabra = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldLetra = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelIntentos = new javax.swing.JLabel();
        jLabelAciertos = new javax.swing.JLabel();
        jLabelFallos = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelMuñeco = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemNuevo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemAcerdaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("El juego del Ahorcado");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Palabra"));

        jLabelPalabra.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelPalabra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPalabra.setText("????");
        jLabelPalabra.setToolTipText("");

        jLabel1.setText("Introduzca una letra:");

        jTextFieldLetra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                averiguaPalabra(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldLetra)
                    .addComponent(jLabelPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jTextFieldLetra, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Marcador"));

        jLabelIntentos.setText("Intentos: 0");

        jLabelAciertos.setText("Aciertos: ");

        jLabelFallos.setText("Fallos: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAciertos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelFallos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelIntentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAciertos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelFallos)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Muñeco"));

        jLabelMuñeco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/emagic/gfx/cabeza.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelMuñeco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelMuñeco)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jMenu1.setText("Juego");

        jMenuItemNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/emagic/gfx/appearance.gif"))); // NOI18N
        jMenuItemNuevo.setText("Nuevo");
        jMenuItemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickNuevo(evt);
            }
        });
        jMenu1.add(jMenuItemNuevo);
        jMenu1.add(jSeparator1);

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/emagic/gfx/down.gif"))); // NOI18N
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickNuevo(evt);
            }
        });
        jMenu1.add(jMenuItemSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItemAcerdaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAcerdaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/emagic/gfx/help.gif"))); // NOI18N
        jMenuItemAcerdaDe.setText("Acerca de ");
        jMenuItemAcerdaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickNuevo(evt);
            }
        });
        jMenu2.add(jMenuItemAcerdaDe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickNuevo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickNuevo
        // Bucle del juego
        if (evt.getSource() == jMenuItemNuevo) { 
            muñeco = new Muñeco(jLabelMuñeco);
            palabra = new Palabra();
            marcador = new Marcador();
            jLabelAciertos.setText("Aciertos");
            jLabelFallos.setText("Fallos");
            jLabelIntentos.setText("Intentos: 0");
            jLabelPalabra.setText(palabra.getGuiones()); // Poner palabra de juego                        
            jTextFieldLetra.setEnabled(true);
            
        } else if (evt.getSource() == jMenuItemSalir) { 
            System.exit(0);
        } else {
           JOptionPane.showMessageDialog(this, "Juego del Ahorcado 1.0 \n Autor: David Pérez Lledo", "Acerca de...", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_clickNuevo
    
    private void averiguaPalabra(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_averiguaPalabra
        
           boolean acierto;
        char letra;
        
        letra = jTextFieldLetra.getText().charAt(0);
        acierto = palabra.pruebaLetra(letra);// Pedir letra
        if (acierto) {// Comprobar letra
            marcador.addAcierto(letra);// Si acierto poner acierto
            jLabelAciertos.setText("Aciertos: " + marcador.getListaAciertos());
            jLabelPalabra.setText(palabra.getGuiones());
        } else {
            marcador.addFallos(letra); // Si fallo poner fallo
            jLabelFallos.setText("Fallos: " + marcador.getListaFallos());
            muñeco.cambiaMuñeco(); // Poner muñeco
        }
        marcador.addIntentos();// Aumentar intento
        jLabelIntentos.setText("Intentos: " + marcador.getIntentos());
        
        // Comprobar  no ahorcado o ganador
        if (muñeco.ahorcado()) {
            JOptionPane.showMessageDialog(this, "Lo siento ha sido ahorcado!!!", "Ahorcado", JOptionPane.ERROR_MESSAGE);
            jTextFieldLetra.setEnabled(false); // Deshabilitamos boton
        }
        if (palabra.ganador()) {
            JOptionPane.showMessageDialog(this, "Felicidades ha ganado el juego del ahorcado!!!", "Ahorcado", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldLetra.setEnabled(false); // Deshabilitamos boton
        }
        jTextFieldLetra.setText("");
    }//GEN-LAST:event_averiguaPalabra

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAhorcado().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAciertos;
    private javax.swing.JLabel jLabelFallos;
    private javax.swing.JLabel jLabelIntentos;
    private javax.swing.JLabel jLabelMuñeco;
    private javax.swing.JLabel jLabelPalabra;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAcerdaDe;
    private javax.swing.JMenuItem jMenuItemNuevo;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextFieldLetra;
    // End of variables declaration//GEN-END:variables
}
