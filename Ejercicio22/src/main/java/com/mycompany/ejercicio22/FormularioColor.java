
package com.mycompany.ejercicio22;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Dimension;

public class FormularioColor extends JFrame implements ActionListener{
    private JTextField colorText;
    private JLabel label1;
    private JButton boton;
    private JPanel panel;

    public FormularioColor() {
        setLayout(null);
        panel = new JPanel();
        panel.setBounds(0,0,300,200);
        add(panel);

        label1 = new JLabel("Color:");
        label1.setBounds(0,10,100,30);
        panel.add(label1);
        colorText = new JTextField();
        panel.add (colorText);
        colorText.setPreferredSize(new Dimension(50, 20));
        

        boton = new JButton("Cambiar Color");
        boton.setBounds(10,50,100,100);
        panel.add(boton);
        boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            String color = colorText.getText().toLowerCase();
            switch(color) {
                case "rojo":
                    panel.setBackground(Color.RED);
                    break;
                case "azul":
                    panel.setBackground(Color.BLUE);
                    break;
                case "verde":
                    panel.setBackground(Color.GREEN);
                    break;
                case "amarillo":
                    panel.setBackground(Color.YELLOW);
                    break;
                case "naranja":
                    panel.setBackground(Color.ORANGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Color no válido. Intente con: rojo, azul, verde, amarillo o naranja.");
            }
        }
    }

    public static void main(String[] ar) {
        FormularioColor formulario1 = new FormularioColor();
        formulario1.setBounds(0,0,300,200);
        formulario1.setVisible(true);
    }
}
