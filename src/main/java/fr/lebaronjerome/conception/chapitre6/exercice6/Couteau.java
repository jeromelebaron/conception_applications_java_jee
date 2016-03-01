/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice6;

/**
 * @author Jerome
 *
 */
public class Couteau implements ITechniqueCombat {

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.lebaronjerome.conception.chapitre6.exercice6.ITechniqueCombat#
	 * utiliserArme()
	 */
	@Override
	public void utiliserArme() {
		System.out.println("Je combat au couteau");
	}

}
