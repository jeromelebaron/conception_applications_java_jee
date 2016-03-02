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
	public Integer suivant() {
		int[][] tableau = tableauEntier.getTableauEntier();
		Integer valeur = tableauEntier.valeurA(ligneCourante, colonneCourante);
		if (ligneCourante % 2 != 0) {
			colonneCourante = tableau[ligneCourante].length - 1;
			valeur = tableauEntier.valeurA(ligneCourante, colonneCourante);
			colonneCourante--;
			if (colonneCourante == -1) {
				ligneCourante++;
				colonneCourante = 0;
			}
		} else {
			colonneCourante++;
			if (colonneCourante == tableau[ligneCourante].length && ligneCourante < (tableau.length - 1)) {
				ligneCourante++;
				colonneCourante = 0;
			}
		}
		return valeur;
	}

}
