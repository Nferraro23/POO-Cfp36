
package Polimorfismo;

import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public abstract class OperacionP {
    
    ImageIcon intro = new ImageIcon("src/imagen/intro.png");
    ImageIcon icon = new ImageIcon("src/imagen/intro2.png");
    
    protected int valor1,valor2,resultado;
    Scanner leer = new Scanner(System.in);
    
    public void PedriDatos(){
        String v1 = (String) JOptionPane.showInputDialog(null, 
                    "Ingrese el primer valor",
                    "CALCULADORA",
                    JOptionPane.QUESTION_MESSAGE,
                    icon,
                    null,
                    "");
      
             String v2 = (String) JOptionPane.showInputDialog(null, 
                    "Ingrese el segundo valor",
                    "CALCULADORA",
                    JOptionPane.QUESTION_MESSAGE,
                    icon,
                    null,
                    "");
             
             valor1 = Integer.parseInt(v1);
             valor2 = Integer.parseInt(v2);
       }
    
    public abstract void operaciones ();
    
    public void Mostrarresultado(){
        JOptionPane.showMessageDialog(null,"El resultado es : " + resultado);
     }
    
}

