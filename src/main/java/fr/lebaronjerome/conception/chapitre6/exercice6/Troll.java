/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice6;

/**
 * @author Jerome
 *
 */
public class Troll extends Personnage {

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
