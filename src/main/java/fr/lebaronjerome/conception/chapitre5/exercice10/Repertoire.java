/**
 * 
 */
package fr.lebaronjerome.conception.chapitre5.exercice10;

/**
 * @author Jerome
 *
 */
public class Repertoire implements IRepertoire {

	private String proprietaire;
	
	/* (non-Javadoc)
	 * @see fr.lebaronjerome.conception.chapitre5.exercice10.IRepertoire#lister()
	 */
	@Override
	public void lister() {
	}

	/**
	 * Accessesseur en lecture du champs <code>proprietaire</code>
	 * @return le champs proprietaire
	 */
	public String getProprietaire() {
		return proprietaire;
	}

	/**
	 * Accessesseur en écriture du champs <code>proprietaire</code>
	 * @param paramProprietaire le champs proprietaire à peupler
	 */
	public void setProprietaire(String paramProprietaire) {
		proprietaire = paramProprietaire;
	}

	
}
