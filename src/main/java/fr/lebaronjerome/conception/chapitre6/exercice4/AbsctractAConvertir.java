/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice4;

import java.util.Observable;

/**
 * @author Jerome
 *
 */
public abstract class AbsctractAConvertir extends Observable{

	protected int entierAConvertir;
	
	public abstract void setEntierAConvertir(int paramEntierAConvertir);
	
}
