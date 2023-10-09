/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barquitos2.frontend;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Dan
 */
public class TableroTiros {
    private JPanel pnlTableroTiro;
    private Casilla[][] celdas;
    private int filas;
    private int columnas;
    
    private String icono = "/com/mycompany/barquitos2/frontend/multimedia/uwu.png";
    

    public TableroTiros(JPanel pnlTableroTiro, int filas, int columnas) {
        this.pnlTableroTiro = pnlTableroTiro;
        this.filas = filas;
        this.columnas = columnas;
       
        this.pnlTableroTiro.setLayout(new java.awt.GridLayout(filas, columnas));
        celdas = new Casilla[filas][columnas];
    }
    
    public TableroTiros(){
        
    }

    public void mostrarTablero() {
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                if (fila == 0 && columna == 0) {
                    // Esquina superior izquierda vacía
                    JPanel casilla = new JPanel();
                    casilla.setBackground(Color.ORANGE);
                    pnlTableroTiro.add(casilla);
                } else if (fila == 0) { // Agregar letras en la parte superior
                    if (columna <= 10) {
                        JLabel letraLabel = new JLabel(String.valueOf(letras[columna - 1]));
                        letraLabel.setForeground(Color.WHITE);
                        letraLabel.setHorizontalAlignment(JLabel.CENTER);
                        pnlTableroTiro.add(letraLabel);
                    }
                } else if (columna == 0) { // Agregar números a la izquierda
                    if (fila <= 10) {
                        JLabel numeroLabel = new JLabel(String.valueOf(fila - 1));
                        numeroLabel.setForeground(Color.WHITE);
                        numeroLabel.setHorizontalAlignment(JLabel.CENTER);
                        pnlTableroTiro.add(numeroLabel);
                    }
                } else { // Agregar celdas de 10x10
                    pnlTableroTiro.add(celdas[fila - 1][columna - 1] = new Casilla(icono));
                }
            }
        }
    }

}
