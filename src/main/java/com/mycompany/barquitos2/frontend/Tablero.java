/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barquitos2.frontend;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tablero {
    private JPanel pnlTablero;
    private Casilla[][] celdas;
    private int filas;
    private int columnas;
    
    public Tablero(JPanel pnlTablero, int filas, int columnas) {
        this.pnlTablero = pnlTablero;
        this.filas = filas;
        this.columnas = columnas;
        this.pnlTablero.setLayout(new java.awt.GridLayout(filas, columnas));
        celdas = new Casilla[filas][columnas];
    }

    public void mostrarTablero() {
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                if (fila == 0 && columna == 0) {
                    // Esquina superior izquierda vacía
                    JPanel casilla = new JPanel();
                    casilla.setBackground(Color.ORANGE);
                    pnlTablero.add(casilla);
                } else if (fila == 0) { // Agregar letras en la parte superior
                    if (columna <= 10) {
                        JLabel letraLabel = new JLabel(String.valueOf(letras[columna - 1]));
                        letraLabel.setForeground(Color.WHITE);
                        letraLabel.setHorizontalAlignment(JLabel.CENTER);
                        pnlTablero.add(letraLabel);
                    }
                } else if (columna == 0) { // Agregar números a la izquierda
                    if (fila <= 10) {
                        JLabel numeroLabel = new JLabel(String.valueOf(fila - 1));
                        numeroLabel.setForeground(Color.WHITE);
                        numeroLabel.setHorizontalAlignment(JLabel.CENTER);
                        pnlTablero.add(numeroLabel);
                    }
                } else { // Agregar celdas de 10x10
                    pnlTablero.add(celdas[fila - 1][columna - 1] = new Casilla());
                }
            }
        }
    }
    
    public void mostrarBarco(int filaInicio, int columnaInicio, boolean esHorizontal) {
    if (esHorizontal) {
        for (int i = 0; i < 5; i++) {
            if (filaInicio >= 1 && filaInicio <= 10 && columnaInicio + i >= 1 && columnaInicio + i <= 10) {
                celdas[filaInicio - 1][columnaInicio + i - 1].setBackground(Color.RED);
            }
        }
    } else { // Vertical
        for (int i = 0; i < 5; i++) {
            if (filaInicio + i >= 1 && filaInicio + i <= 10 && columnaInicio >= 1 && columnaInicio <= 10) {
                celdas[filaInicio + i - 1][columnaInicio - 1].setBackground(Color.RED);
            }
        }
    }
}


}

//    private Casilla getTablero(int x, int y){
//        return celdas[x][y];
//    }
    
//    private Casilla setTablero(String barco, int x, int y){
//        celdas[x][y];
//    }
