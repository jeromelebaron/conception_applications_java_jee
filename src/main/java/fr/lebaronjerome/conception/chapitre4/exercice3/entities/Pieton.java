/**
 * 
 */
package fr.lebaronjerome.conception.chapitre4.exercice3.entities;

/**
 * @author Jerome
 *
 */
public class Pieton extends Vehicule {

	/**
	 * 
	 */
	public Pieton() {
		super(0, 4);
	}

	/**
	 * @param paramLongueur
	 * @param paramVitesseMax
	 */
	public Pieton(double paramLongueur, double paramVitesseMax) {
		super(paramLongueur, paramVitesseMax);
	}

}
