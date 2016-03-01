/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice6;

/**
 * @author Jerome
 *
 */
public class Chevalier extends Personnage {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.lebaronjerome.conception.chapitre6.exercice6.Personnage#combattre()
	 */
	@Override
	public void combattre() {
		techniqueCombat.utiliserArme();
	}

}
