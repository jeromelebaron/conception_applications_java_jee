/**
 * 
 */
package fr.lebaronjerome.conception.chapitre4.exercice7.singleton;

/**
 * @author Jerome
 *
 */
public class AeroportV1 {

	private static AeroportV1 aeroport;

	public static AeroportV1 createAeroport() {
		if (aeroport == null) {
			aeroport = new AeroportV1();
		}
		return aeroport;
	}

	/**
	 * 
	 */
	private AeroportV1() {
	}

}
