/**
 * 
 */
package fr.lebaronjerome.conception.chapitre5.exercice10;

/**
 * @author Jerome
 *
 */
public class ProxyRepertoire implements IRepertoire {

	private Repertoire repertoire;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.lebaronjerome.conception.chapitre5.exercice10.IRepertoire#lister()
	 */
	@Override
	public void lister() {
		if (System.getProperty("user.name") == repertoire.getProprietaire()) {
			repertoire.lister();
		}
	}

	/**
	 * Accessesseur en lecture du champs <code>repertoire</code>
	 * 
	 * @return le champs repertoire
	 */
	public Repertoire getRepertoire() {
		return repertoire;
	}

	/**
	 * Accessesseur en écriture du champs <code>repertoire</code>
	 * 
	 * @param paramRepertoire
	 *            le champs repertoire à peupler
	 */
	public void setRepertoire(Repertoire paramRepertoire) {
		repertoire = paramRepertoire;
	}

}
