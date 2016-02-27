/**
 * 
 */
package fr.lebaronjerome.conception.chapitre4.exercice7.singleton;

/**
 * @author Jerome
 *
 */
public class AeroportV2 {

	private static AeroportV2 aeroport;

	public static AeroportV2 createAeroport() {
		if (aeroport == null) {
			aeroport = new AeroportV2();
		}
		return aeroport;
	}

	/**
	 * 
	 */
	private AeroportV2() {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
	}

}
