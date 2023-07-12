



import javax.swing.*;
import java.awt.event.*;

public class FormularioNotas extends JFrame implements ActionListener{
    private JTextField nota1, nota2, nota3;
    private JLabel label1, label2, label3;
    private JButton boton;

    public FormularioNotas() {
        setLayout(null);
        label1 = new JLabel("Nota 1:");
        label1.setBounds(10,10,100,30);
        add(label1);
        nota1 = new JTextField();
        nota1.setBounds(120,10,150,20);
        add(nota1);

        label2 = new JLabel("Nota 2:");
        label2.setBounds(10,50,100,30);
        add(label2);
        nota2 = new JTextField();
        nota2.setBounds(120,50,150,20);
        add(nota2);

        label3 = new JLabel("Nota 3:");
        label3.setBounds(10,90,100,30);
        add(label3);
        nota3 = new JTextField();
        nota3.setBounds(120,90,150,20);
        add(nota3);

        boton = new JButton("Calcular");
        boton.setBounds(10,130,100,30);
        add(boton);
        boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            String n1 = nota1.getText();
            String n2 = nota2.getText();
            String n3 = nota3.getText();
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            int num3 = Integer.parseInt(n3);
            int promedio = (num1 + num2 + num3) / 3;
            setTitle("Promedio: " + promedio);
        }
    }

    public static void main(String[] ar) {
        FormularioNotas formulario1 = new FormularioNotas();
        formulario1.setBounds(0,0,300,200);
        formulario1.setVisible(true);
    }
}