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
	
	public abstract void suivant();
	
	/* (non-Javadoc)
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return false;
	}

	/* (non-Javadoc)
	 * @see java.util.Iterator#next()
	 */
	@Override
	public Integer next() {
		return null;
	}
}
