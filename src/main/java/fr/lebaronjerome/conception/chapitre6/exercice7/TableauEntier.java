/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice7;

/**
 * @author Jerome
 *
 */
public class TableauEntier {

	private int[][] tableauEntier;

	public int valeurA(int paramPremier, int paramDeuxieme) {
		return tableauEntier[paramPremier][paramDeuxieme];
	}

	/**
	 * @param paramTableauEntier
	 */
	public TableauEntier(int[][] paramTableauEntier) {
		tableauEntier = paramTableauEntier;
	}

	public int getLargeur() {
		return tableauEntier.length;
	}

	public int getHauteur() {
		return tableauEntier[0].length;
	}

	/**
	 * Accessesseur en lecture du champs <code>tableauEntier</code>
	 * 
	 * @return le champs tableauEntier
	 */
	public int[][] getTableauEntier() {
		return tableauEntier;
	}

	/**
	 * Accessesseur en écriture du champs <code>tableauEntier</code>
	 * 
	 * @param paramTableauEntier
	 *            le champs tableauEntier à peupler
	 */
	public void setTableauEntier(int[][] paramTableauEntier) {
		tableauEntier = paramTableauEntier;
	}

}
