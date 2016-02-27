/**
 * 
 */
package fr.lebaronjerome.conception.chapitre4.exercice7.singleton;

/**
 * @author Jerome
 *
 */
public class Avion extends Thread {
	String nom;
	AeroportV3 a;

	public Avion(String s) {
		nom = s;
	}

	public void run() {
		a = AeroportV3.createAeroport();
		System.out.println("Je suis avion " + nom + " sur aeroport " + a);
	}
}
