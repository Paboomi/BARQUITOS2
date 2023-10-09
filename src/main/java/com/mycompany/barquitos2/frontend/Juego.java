/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.barquitos2.frontend;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dan
 */
public class Juego extends javax.swing.JFrame {


    private int filas;
    private int columnas;
    private int filaBarco;
    private int columnaBarco;
    private String orientacion;
    

    public Juego(int filas, int columnas) {

         initComponents();
        BarcoDialog barco = new BarcoDialog(this);
        barco.setVisible(true);
         this.filas = filas;
        this.columnas = columnas;
        setTitle("XDDD");
        setLayout(new GridLayout(1,2));
        add(pnlTablero);
        add(pnlTableroTiros);
        pnlTablero.setLayout(new java.awt.GridLayout(filas, columnas));
        pnlTablero.setBackground(Color.BLACK);
        pnlTableroTiros.setLayout(new java.awt.GridLayout(filas, columnas));
        pnlTableroTiros.setBackground(Color.WHITE);
        pnlTablero.setSize(300,300);
        pnlTablero.setPreferredSize(new Dimension(300,300));
        pnlTableroTiros.setPreferredSize(new Dimension(300,300));
        pnlTableroTiros.setSize(300,300);
        // Mostrar la ventana
        pack(); // Empaquetar la ventana para que los paneles tengan un tamaño inicial adecuado
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Abre la ventana en pantalla completa
         Tablero tablero = new Tablero(pnlTablero, filas, columnas, barco);
       
        TableroTiros tablerotiros = new TableroTiros(pnlTableroTiros, filas, columnas);
   
        tablerotiros.mostrarTablero();
         tablero.mostrarTablero();
        tablero.mostrarBarco();
      

    }                     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTablero = new javax.swing.JPanel();
        pnlTableroTiros = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));
        setSize(new java.awt.Dimension(600, 500));

        pnlTablero.setPreferredSize(new java.awt.Dimension(600, 250));

        javax.swing.GroupLayout pnlTableroLayout = new javax.swing.GroupLayout(pnlTablero);
        pnlTablero.setLayout(pnlTableroLayout);
        pnlTableroLayout.setHorizontalGroup(
            pnlTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlTableroLayout.setVerticalGroup(
            pnlTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        pnlTableroTiros.setPreferredSize(new java.awt.Dimension(600, 250));

        javax.swing.GroupLayout pnlTableroTirosLayout = new javax.swing.GroupLayout(pnlTableroTiros);
        pnlTableroTiros.setLayout(pnlTableroTirosLayout);
        pnlTableroTirosLayout.setHorizontalGroup(
            pnlTableroTirosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pnlTableroTirosLayout.setVerticalGroup(
            pnlTableroTirosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTableroTiros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTablero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTableroTiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlTablero;
    private javax.swing.JPanel pnlTableroTiros;
    // End of variables declaration//GEN-END:variables
    // End of variables declaration                   
   private javax.swing.JPanel pnlTableroSuperior= new JPanel() ;
   private javax.swing.JPanel pnlTableroIzquierda = new JPanel();
}
