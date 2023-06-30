
package clase3006;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Clase3006 {

   
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        frame.add(label);

        JButton button1 = new JButton("Button 1");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button 1 pressed");
            }
        });
        frame.add(button1);

        JButton button2 = new JButton("Button 2");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button 2 pressed");
            }
        });
        frame.add(button2);

        JButton button3 = new JButton("Button 3");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button 3 pressed");
            }
        });
        frame.add(button3);

        frame.setVisible(true);
    }    
        
        
        
        
        
        
    }
    

