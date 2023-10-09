/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barquitos2.frontend;

/**
 *
 * @author Dan
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarcoDialog extends JDialog {
    private JTextField filaTextField;
    private JTextField columnaTextField;
    private JRadioButton horizontalRadioButton;
    private JRadioButton verticalRadioButton;
    private JButton aceptarButton;
    private boolean aceptado = false;
    private int fila = -1;
    private int columna = -1;
    private boolean orientacionHorizontal = true;

    public BarcoDialog(Frame parent) {
        super(parent, "Posicionar Barco", true);
        initComponents();
    }
    
    public BarcoDialog(){
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel filaLabel = new JLabel("Fila:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(filaLabel, constraints);

        filaTextField = new JTextField(10);
        constraints.gridx = 1;
        panel.add(filaTextField, constraints);

        JLabel columnaLabel = new JLabel("Columna:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(columnaLabel, constraints);

        columnaTextField = new JTextField(10);
        constraints.gridx = 1;
        panel.add(columnaTextField, constraints);

        horizontalRadioButton = new JRadioButton("Horizontal");
        horizontalRadioButton.setSelected(true);
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(horizontalRadioButton, constraints);

        verticalRadioButton = new JRadioButton("Vertical");
        constraints.gridx = 1;
        panel.add(verticalRadioButton, constraints);

        ButtonGroup grupoOrientacion = new ButtonGroup();
        grupoOrientacion.add(horizontalRadioButton);
        grupoOrientacion.add(verticalRadioButton);

        aceptarButton = new JButton("Aceptar");
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.CENTER;
        panel.add(aceptarButton, constraints);

        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEntrada()) {
                    fila = Integer.parseInt(filaTextField.getText());
                    columna = Integer.parseInt(columnaTextField.getText());
                    orientacionHorizontal = horizontalRadioButton.isSelected();
                    aceptado = true;
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(BarcoDialog.this, "Por favor, ingrese valores válidos.");
                }
            }
        });

        add(panel);
        pack();
        setLocationRelativeTo(null);
    }

    private boolean validarEntrada() {
        try {
            int fila = Integer.parseInt(filaTextField.getText());
            int columna = Integer.parseInt(columnaTextField.getText());
            return fila >= 1 && fila <= 10 && columna >= 1 && columna <= 10;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean fueAceptado() {
        return aceptado;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public boolean getOrientacion() {
        return orientacionHorizontal;
    }
}

