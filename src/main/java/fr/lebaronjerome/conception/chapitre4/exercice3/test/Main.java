/**
 * 
 */
package fr.lebaronjerome.conception.chapitre4.exercice3.test;

import fr.lebaronjerome.conception.chapitre4.exercice3.entities.Vehicule;
import fr.lebaronjerome.conception.chapitre4.exercice3.factories.FabriqueConcreteVehicule;
import fr.lebaronjerome.conception.chapitre4.exercice3.factories.FabriqueVehicule;

/**
 * @author Jerome
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FabriqueVehicule fabriqueVehiculeNormale = new FabriqueConcreteVehicule();
		for (int localI = 0; localI < 10; localI++) {
			Vehicule vehicule = fabriqueVehiculeNormale.creerVehicule();
			System.out.println(vehicule.toString());
		}
		System.out.println("---------------------------");
		FabriqueVehicule fabriqueVehiculeDeterminee = new FabriqueConcreteVehicule(25, 25, 25, 25);
		for (int localI = 0; localI < 10; localI++) {
			Vehicule vehicule = fabriqueVehiculeDeterminee.creerVehicule();
			System.out.println(vehicule.toString());
		}
	}

}
