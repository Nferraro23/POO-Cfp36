
package lavarropas;

import javax.swing.JOptionPane;

public class ProgramaDeLavado {
    
    
    private int _tipoLavado;

	public ProgramaDeLavado(int tipoLavado) {
		// asigna la variable interna
		_tipoLavado = tipoLavado;
	}

	public void realizarLavado() {
	
		// se muestra el tipo de lavado
		switch (this._tipoLavado)
     	{	    	 
		 	case 1:  
		 		lavado("Lana", "Suave");
			  	break;	    		 
         	case 2: 
		 		lavado("Ropa sucia", "Profundo");
              	break;	                 	 
         	case 3: 
		 		lavado("Lavado ECO", "Normal");
              	break;	                 	 
         	case 4: 
		 		lavado("Ropa de bebé", "Suave");
              	break;
         	default:
         		JOptionPane.showMessageDialog(null,"No existe el programa seleccionado");
         		break;
     	}

		// secado de la ropa
		secado();
	}

	private void lavado (String tipoDeRopa, String tipoDeLavado) {
		JOptionPane.showMessageDialog(null,"El tipo de lavado es " + " " + tipoDeLavado + ", " + tipoDeRopa);
	}

	private void secado() {		
		JOptionPane.showMessageDialog(null,"Se está secando la ropa");
	}
	
    
    
    
}
