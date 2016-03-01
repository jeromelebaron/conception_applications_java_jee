/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice4;

/**
 * @author Jerome
 *
 */
public class AConvertir extends AbsctractAConvertir {

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
	@Override
	public void setEntierAConvertir(int paramEntierAConvertir) {
		entierAConvertir = paramEntierAConvertir;
		setChanged();
		notifyObservers();
	}

}
