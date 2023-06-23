
package Polimorfismo;

import java.util.Scanner;
import javax.swing.JOptionPane;


public abstract class OperacionP {
    
    protected int valor1,valor2,resultado;
    Scanner leer = new Scanner(System.in);
    
    public void PedriDatos(){
        JOptionPane.showInputDialog(null,"Dame el primer valor :");
        valor1 = leer.nextInt();
        
        JOptionPane.showInputDialog(null,"Dame el segundo valor :");
        valor2 = leer.nextInt();
    }
    
    public abstract void operaciones ();
    
    public void Mostrarresultado(){
        JOptionPane.showMessageDialog(null,"El resultado es : " + resultado);
     }
    
}
