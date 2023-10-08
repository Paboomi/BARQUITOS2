/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.barquitos2.frontend;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Dan
 */
public class ColocarBarcoDialog extends javax.swing.JDialog {

    private JTextField filaTextField;
    private JTextField columnaTextField;
    private JRadioButton horizontalRadioButton;
    private JRadioButton verticalRadioButton;
    private JButton aceptarButton;
    private JPanel tableroPanel;
    private Juego juego;
    private Tablero tablero; 

    private int fila;
    private int columna;

    /**
     * Creates new form ColocarBarcoDialog
     */
    public ColocarBarcoDialog(Juego juego) {
        //super(parent, modal);
        initComponents();
        this.juego = juego;
        setTitle("Colocar Barco");
        setSize(300, 150);
        setLayout(new FlowLayout());

        JLabel filaLabel = new JLabel("Fila:");
        filaTextField = new JTextField(5);
        JLabel columnaLabel = new JLabel("Columna:");
        columnaTextField = new JTextField(5);
        JLabel orientacionLabel = new JLabel("Orientacion:");
        horizontalRadioButton = new JRadioButton("Horizontal");
        verticalRadioButton = new JRadioButton("Vertical");
        ButtonGroup orientacionGroup = new ButtonGroup();
        orientacionGroup.add(horizontalRadioButton);
        orientacionGroup.add(verticalRadioButton);

        aceptarButton = new JButton("Aceptar");

        add(filaLabel);
        add(filaTextField);
        add(columnaLabel);
        add(columnaTextField);
        add(orientacionLabel);
        add(horizontalRadioButton);
        add(verticalRadioButton);
        add(aceptarButton);

        // Crea la cuadrícula de casillas
        tableroPanel = new JPanel(new GridLayout(10, 10));
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                JButton casillaButton = new JButton();
                casillaButton.setBackground(Color.WHITE);
                casillaButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Obtiene la fila y la columna de la casilla seleccionada
                        int fila = Integer.parseInt(filaTextField.getText());
                        int columna = Integer.parseInt(columnaTextField.getText());

                        // Asigna la casilla seleccionada al barco
                        if (horizontalRadioButton.isSelected()) {
                            tableroPanel.getComponent(fila * 10 + columna).setBackground(Color.RED);
                        } else {
                            tableroPanel.getComponent(columna * 10 + fila).setBackground(Color.RED);
                        }
                    }
                });
                tableroPanel.add(casillaButton);
            }
        }

        add(tableroPanel);
    }

    // Agrega métodos para obtener los valores ingresados por el jugador

    private void setFila() {
        fila = Integer.parseInt(filaTextField.getText());
    }

    private void setColumna() {
        columna = Integer.parseInt(columnaTextField.getText());
    }

    public int getFila() {
        return Integer.parseInt(filaTextField.getText());
    }

    public int getColumna() {
        return Integer.parseInt(columnaTextField.getText());
    }
    
//// Dentro del ActionListener del botón "Aceptar"
//aceptarButton.addActionListener(new ActionListener() {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        int fila = Integer.parseInt(filaTextField.getText());
//        int columna = Integer.parseInt(columnaTextField.getText());
//
//        if (horizontalRadioButton.isSelected()) {
//            tablero.mostrarBarco(fila, columna, true);
//        } else {
//            tablero.mostrarBarco(fila, columna, false);
//        }
//    }
//});

private void agregarListener(){
    // Dentro del ActionListener del botón "Aceptar"
aceptarButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int fila = Integer.parseInt(filaTextField.getText());
        int columna = Integer.parseInt(columnaTextField.getText());

        if (horizontalRadioButton.isSelected()) {
            tablero.mostrarBarco(fila, columna, true);
        } else {
            tablero.mostrarBarco(fila, columna, false);
        }
    }
});
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
