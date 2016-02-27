/**
 * 
 */
package fr.lebaronjerome.conception.chapitre4.exercice3.entities;

/**
 * @author Jerome
 *
 */
public abstract class Vehicule {

	private double vitesse = 0;

	private double vitesseMax = 0;

	private double longueur = 0;

	
	
	/**
	 * 
	 */
	public Vehicule() {
	}

	/**
	 * @param paramVitesse
	 * @param paramVitesseMax
	 */
	public Vehicule(double paramLongueur, double paramVitesseMax) {
		longueur = paramLongueur;
		vitesseMax = paramVitesseMax;
	}

	public void accelerer(double paramDeltaV) {

	}

	public void decelerer(double paramDeltaV) {

	}

	/**
	 * @return the vitesse
	 */
	public double getVitesse() {
		return vitesse;
	}

	/**
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicule [vitesse=" + vitesse + ", vitesseMax=" + vitesseMax + ", longueur=" + longueur + "]";
	}

}
