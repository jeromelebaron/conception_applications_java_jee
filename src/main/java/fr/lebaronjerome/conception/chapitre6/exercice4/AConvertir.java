/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice4;

import java.util.Observable;

/**
 * @author Jerome
 *
 */
public class AConvertir extends Observable {

	private int entierAConvertir;

	/**
	 * Accessesseur en lecture du champs <code>entierAConvertir</code>
	 * 
	 * @return le champs entierAConvertir
	 */
	public int getEntierAConvertir() {
		return entierAConvertir;
	}

	/**
	 * Accessesseur en écriture du champs <code>entierAConvertir</code>
	 * 
	 * @param paramEntierAConvertir
	 *            le champs entierAConvertir à peupler
	 */
	public void setEntierAConvertir(int paramEntierAConvertir) {
		entierAConvertir = paramEntierAConvertir;
		setChanged();
		notifyObservers();
	}
	
}
