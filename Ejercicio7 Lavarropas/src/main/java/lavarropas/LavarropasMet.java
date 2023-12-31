
package lavarropas;

import javax.swing.JOptionPane;

public class LavarropasMet {
    
    private int _cantKilos;
	private int _tipoLavado;


	public LavarropasMet (int tipoLavado, int cantKilos) {
		// asigna las variables internas
		_tipoLavado = tipoLavado;
		_cantKilos = cantKilos;
	}

	public void ProcesoDeLavado() {
		// llena el lavarropas con los kilos
		this.llenado();
		
		// realiza el lavado
		ProgramaDeLavado programaDeLavado = new ProgramaDeLavado(this._tipoLavado);
		programaDeLavado.realizarLavado();

		// fin
		finalizado(); 
	}
	private void llenado() {
		JOptionPane.showMessageDialog(null,"Se llenó el lavarropas con " + this._cantKilos + " kilos");
	}

	private void finalizado() {
		JOptionPane.showMessageDialog(null,"Se finalizó el lavado");
	}
    
    
}
