/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice7;

/**
 * @author Jerome
 *
 */
public class ParcoursLigne extends Parcours {

	/**
	 * @param paramTableauEntier
	 */
	public ParcoursLigne(TableauEntier paramTableauEntier) {
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
		colonneCourante++;
		if (colonneCourante == tableau[ligneCourante].length && ligneCourante < (tableau.length - 1)) {
			ligneCourante++;
			colonneCourante = 0;
		}
		return valeur;
	}

}
