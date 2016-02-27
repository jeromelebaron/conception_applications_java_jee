/**
 * 
 */
package fr.lebaronjerome.conception.chapitre4.exercice3.factories;

import fr.lebaronjerome.conception.chapitre4.exercice3.entities.Bicyclette;
import fr.lebaronjerome.conception.chapitre4.exercice3.entities.Bus;
import fr.lebaronjerome.conception.chapitre4.exercice3.entities.Pieton;
import fr.lebaronjerome.conception.chapitre4.exercice3.entities.Vehicule;
import fr.lebaronjerome.conception.chapitre4.exercice3.entities.Voiture;

/**
 * @author Jerome
 *
 */
public class FabriqueConcreteVehicule extends FabriqueVehicule {

	
	
	/**
	 * 
	 */
	public FabriqueConcreteVehicule() {
		super();
	}

	/**
	 * @param paramProbaVoiture
	 * @param paramProbaBus
	 * @param paramProbaPieton
	 * @param paramProbaBicyclette
	 */
	public FabriqueConcreteVehicule(double paramProbaVoiture, double paramProbaBus, double paramProbaPieton,
			double paramProbaBicyclette) {
		super(paramProbaVoiture, paramProbaBus, paramProbaPieton, paramProbaBicyclette);
	}

	/**
	 * @see fr.lebaronjerome.conception.chapitre4.exercice3.factories.FabriqueVehicule#creerVehicule()
	 */
	@Override
	public Vehicule creerVehicule() {
		Vehicule vehicule = null;
		double probabilite = Math.random() * 100;
		if (probabilite < probaVoiture) {
			vehicule = new Voiture();
		} else if (probabilite < probaVoiture + probaBus) {
			vehicule = new Bus();
		} else if (probabilite < probaVoiture + probaBus + probaBicyclette) {
			vehicule = new Bicyclette();
		} else {
			vehicule = new Pieton();
		}
		return vehicule;
	}

}
