/**
 * 
 */
package fr.lebaronjerome.conception.chapitre5.exercice7;

import java.awt.Component;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JPanel;

/**
 * @author Jerome
 *
 */
public class SwingFacade {
	
	public void appliquerPolice(Panel panneau){
		panneau.setFont(new Font("Arial", Font.BOLD, 12));
	}
	
	public JPanel entourerComposant(Component paramComposantAEntourer){
		JPanel panneau = new JPanel();
		panneau.add(paramComposantAEntourer);
		return panneau;
	}

}
