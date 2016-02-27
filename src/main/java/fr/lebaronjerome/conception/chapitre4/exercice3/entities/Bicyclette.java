/**
 * 
 */
package fr.lebaronjerome.conception.chapitre4.exercice3.entities;

/**
 * @author Jerome
 *
 */
public class Bicyclette extends Vehicule {

	/**
	 * 
	 */
	public Bicyclette() {
		super(1.5, 25);
	}

	/**
	 * @param paramLongueur
	 * @param paramVitesseMax
	 */
	public Bicyclette(double paramLongueur, double paramVitesseMax) {
		super(paramLongueur, paramVitesseMax);
	}

}
