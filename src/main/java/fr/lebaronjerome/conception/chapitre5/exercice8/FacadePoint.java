/**
 * 
 */
package fr.lebaronjerome.conception.chapitre5.exercice8;

/**
 * @author Jerome
 *
 */
public class FacadePoint {
	
	private PointCartesien pointCartesien = new PointCartesien();
	
	private PointPolaire pointPolaire = new PointPolaire();

	public void translater() {
		pointCartesien.translater();
	}

	public void pivoter() {
		pointPolaire.pivoter();
	}

}
