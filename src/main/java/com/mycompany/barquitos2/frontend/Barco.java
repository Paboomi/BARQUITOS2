/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barquitos2.frontend;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Dan
 */


public class Barco {

    private int longitud;
    private String orientacion;
    private Color color;

    public Barco(int longitud, String orientacion, Color color) {
        this.longitud = longitud;
        this.orientacion = orientacion;
        this.color = color;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}





//public class Nave {
//    private int tamano;
//    private boolean orientacion; // true para vertical, false para horizontal
//    private int fila;
//    private int columna;
//
//    // Constructor
//    public Nave(int tamano, boolean orientacion, int fila, int columna) {
//        this.tamano = tamano;
//        this.orientacion = orientacion;
//        this.fila = fila;
//        this.columna = columna;
//    }
//
//    // Getters y setters
//    // ...
//}
