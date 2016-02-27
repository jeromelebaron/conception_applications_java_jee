/**
 * 
 */
package fr.lebaronjerome.conception.chapitre4.exercice3.factories;

/**
 * @author Jerome
 *
 */
public abstract class FabriqueVehicule {

	protected double probaVoiture = 80;

	protected double probaBus = 5;

	protected double probaPieton = 10;

	protected double probaBicyclette = 5;

	/**
	 * 
	 */
	public FabriqueVehicule() {
	}

	/**
	 * @param paramProbaVoiture
	 * @param paramProbaBus
	 * @param paramProbaPieton
	 * @param paramProbaBicyclette
	 */
	public FabriqueVehicule(double paramProbaVoiture, double paramProbaBus, double paramProbaPieton,
			double paramProbaBicyclette) {
		probaVoiture = paramProbaVoiture;
		probaBus = paramProbaBus;
		probaPieton = paramProbaPieton;
		probaBicyclette = paramProbaBicyclette;
	}

}
