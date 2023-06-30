
package ejercicio19;

/**
 *
 * @author Alumno
 */
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio19 {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Numero maximo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        JLabel number1Label = new JLabel("Número 1:");
        number1Label.setBounds(50, 50, 80, 25);
        frame.add(number1Label);

        JTextField number1Field = new JTextField();
        number1Field.setBounds(130, 50, 165, 25);
        frame.add(number1Field);

        JLabel number2Label = new JLabel("Número 2:");
        number2Label.setBounds(50, 100, 80, 25);
        frame.add(number2Label);

        JTextField number2Field = new JTextField();
        number2Field.setBounds(130, 100, 165, 25);
        frame.add(number2Field);

        JButton button = new JButton("Calcular");
        button.setBounds(50, 150, 80, 25);
        button.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                
                int num1 = Integer.parseInt(number1Field.getText());
                int num2 = Integer.parseInt(number2Field.getText());
                int max = Math.max(num1, num2);
                
                JOptionPane.showMessageDialog(frame, "El número mayor es: " + max);
            }
        });
        frame.add(button);

        frame.setVisible(true);
        
        frame.setResizable(false);
    }
}