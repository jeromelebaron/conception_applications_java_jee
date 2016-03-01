/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice6;

/**
 * @author Jerome
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ITechniqueCombat techniqueCombatEpee = new Epee();
		ITechniqueCombat techniqueCombatArc = new ArcEtFleche();
		ITechniqueCombat techniqueCombatCouteau = new Couteau();
		
		Personnage chevalier = new Chevalier();
		chevalier.armer(techniqueCombatEpee);
		Personnage roi = new Roi();
		roi.armer(techniqueCombatCouteau);
		Personnage reine = new Reine();
		reine.armer(techniqueCombatArc);
		Personnage troll = new Troll();
		troll.armer(techniqueCombatEpee);
		
		chevalier.combattre();
		roi.combattre();
		reine.combattre();
		troll.combattre();

	}

}
