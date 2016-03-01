/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice6;

/**
 * @author Jerome
 *
 */
public class Reine extends Personnage {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.lebaronjerome.conception.chapitre6.exercice6.Personnage#combattre()
	 */
	@Override
	public void combattre() {
		System.out.println("Je suis reine");
		techniqueCombat.utiliserArme();
	}

}
