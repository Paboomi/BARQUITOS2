/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barquitos2;


/**
 *
 * @author Dan
 */

public class Prueba {
   
    public static void main(String[] args) {
      String icono = "/com/mycompany/barquitos/frontend/uwu.png";
        java.net.URL url = Prueba.class.getResource(icono);

        if (url != null) {
            System.out.println("El archivo es accesible");
        } else {
            System.out.println("El archivo no es accesible");
        }
    }
}

