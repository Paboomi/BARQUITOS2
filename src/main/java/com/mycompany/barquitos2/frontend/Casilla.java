/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barquitos2.frontend;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Casilla extends JLabel {


    public Casilla() {
        super();
        setOpaque(true);
        setBackground(Color.BLACK);
        setBorder(new LineBorder(Color.PINK, 1));
        setHorizontalAlignment(SwingConstants.CENTER);
    }

}
