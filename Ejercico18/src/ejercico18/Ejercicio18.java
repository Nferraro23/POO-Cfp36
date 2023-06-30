/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico18;

import javax.swing.*;
import java.awt.event.*;

public class Ejercicio18 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Saludos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Nombre:");
        nameLabel.setBounds(50, 50, 80, 25);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(130, 50, 165, 25);
        frame.add(nameField);

        JButton button = new JButton("Saludar");
        button.setBounds(50, 100, 80, 25);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                JOptionPane.showMessageDialog(frame, "Hola " + name + "!");
            }
        });
        frame.add(button);

        frame.setVisible(true);
    }
}
