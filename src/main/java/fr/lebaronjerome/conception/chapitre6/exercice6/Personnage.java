/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice6;

/**
 * @author Jerome
 *
 */
public abstract class Personnage {

	protected ITechniqueCombat techniqueCombat;

	public void armer(ITechniqueCombat paramTechniqueCombat) {
		techniqueCombat = paramTechniqueCombat;
	}

	public abstract void combattre();

}
