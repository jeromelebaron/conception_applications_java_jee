/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice7;

/**
 * @author Jerome
 *
 */
public class ParcoursLigne extends Parcours {

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.lebaronjerome.conception.chapitre6.exercice7.Parcours#suivant()
	 */
	@Override
	public void suivant() {
		int[][] tableau = tableauEntier.getTableauEntier();
		for (int localLigne = 0; localLigne < tableau.length; localLigne++) {
			for (int localColonne = 0; localColonne < tableau[localLigne].length; localColonne++) {
				System.out.println(tableau[localLigne][localColonne]);
			}
		}
	}

}
