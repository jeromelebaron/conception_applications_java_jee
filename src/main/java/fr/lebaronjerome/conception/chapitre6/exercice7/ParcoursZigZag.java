/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice7;

/**
 * @author Jerome
 *
 */
public class ParcoursZigZag extends Parcours {

	/**
	 * @param paramTableauEntier
	 */
	public ParcoursZigZag(TableauEntier paramTableauEntier) {
		tableauEntier = paramTableauEntier;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.lebaronjerome.conception.chapitre6.exercice7.Parcours#suivant()
	 */
	@Override
	public void suivant() {
		int[][] tableau = tableauEntier.getTableauEntier();
		for (int localLigne = 0; localLigne < tableau.length; localLigne++) {
			ligneCourante = localLigne;
			if (localLigne % 2 == 0) {
				for (int localColonne = 0; localColonne < tableau[localLigne].length; localColonne++) {
					colonneCourante = localColonne;
					System.out.println(tableau[localLigne][localColonne]);
				}
			} else {
				for (int localColonne = tableau[localLigne].length; localColonne > 0; localColonne--) {
					colonneCourante = localColonne;
					System.out.println(tableau[localLigne][localColonne]);
				}
			}

		}
	}

}
