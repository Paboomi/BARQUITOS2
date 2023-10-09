/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barquitos2;

/**
 *
 * @author Dan
 */
import java.io.File;

public class Prueba {
   
    public static void main(String[] args) {
        String icono = "/com/mycompany/barquitos2/frontend/uwu.png";
        File archivo = new File(icono);

        if (archivo.canRead()) {
            System.out.println("El archivo es accesible");
        } else {
            System.out.println("El archivo no es accesible");
        }
    }
}

