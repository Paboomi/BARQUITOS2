/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barquitos2.frontend;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Casilla extends JLabel {
    String icono;
    Tablero tablero = new Tablero();
    TableroTiros tableroTiros = new TableroTiros();

    public Casilla(String icon, Tablero tablero) {
        super();
        this.icono = icon;
        this.tablero = tablero;
//        setOpaque(true);
//        setBackground(Color.BLACK);
//        setBorder(new LineBorder(Color.PINK, 1));
//        setHorizontalAlignment(SwingConstants.CENTER);
        setIcono();
    }
    
        public Casilla(String icon) {
        super();
        this.icono = icon;
//        setOpaque(true);
//        setBackground(Color.BLACK);
//        setBorder(new LineBorder(Color.PINK, 1));
//        setHorizontalAlignment(SwingConstants.CENTER);
            setIcon(new ImageIcon(getClass().getResource(icon)));
//setIcono();
    }
    
    public void setIcono(){
        setIcon(new ImageIcon(getClass().getResource(icono)));
    }
    
    public void cambiarIcono(String iconoNuevo){
        setIcon(new ImageIcon(getClass().getResource(iconoNuevo)));
    }

}
