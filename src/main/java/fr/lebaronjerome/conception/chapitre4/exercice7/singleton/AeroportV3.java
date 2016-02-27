/**
 * 
 */
package fr.lebaronjerome.conception.chapitre4.exercice7.singleton;

/**
 * @author Jerome
 *
 */
public class AeroportV3 {

	private static AeroportV3 aeroport = new AeroportV3();

	public static AeroportV3 createAeroport() {
		return aeroport;
	}

	/**
	 * 
	 */
	private AeroportV3() {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
	}

}
