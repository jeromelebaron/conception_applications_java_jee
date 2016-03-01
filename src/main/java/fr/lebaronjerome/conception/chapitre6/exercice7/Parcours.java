/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice7;

import java.util.Iterator;

/**
 * @author Jerome
 *
 */
public abstract class Parcours implements Iterator<Integer>{
	
	private int colonneCourante;
	
	private int ligneCourante;
	
	protected TableauEntier tableauEntier;
	
	public abstract void suivant();
	
	/* (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return colonneCourante < tableauEntier.getTableauEntier().length;
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	@Override
	public Integer next() {
		return tableauEntier.valeurA(ligneCourante, colonneCourante);
	}

	/**
	 * Accessesseur en lecture du champs <code>tableauEntier</code>
	 * @return le champs tableauEntier
	 */
	public TableauEntier getTableauEntier() {
		return tableauEntier;
	}

	/**
	 * Accessesseur en écriture du champs <code>tableauEntier</code>
	 * @param paramTableauEntier le champs tableauEntier à peupler
	 */
	public void setTableauEntier(TableauEntier paramTableauEntier) {
		tableauEntier = paramTableauEntier;
	}
	
	
}
