/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice7;

/**
 * @author Jerome
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] tab = {{1, 2, 3},{4, 5, 6},{7, 8, 9},{10, 11, 12}}; 
		TableauEntier tableau = new TableauEntier(tab);
		Parcours p = tableau.iterateurLigne(); 
		System.out.println("Par ligne : ");
		while (p.hasNext()) 
			System.out.print(p.next()+" "); 
		p = tableau.iterateurZigzag(); 
		System.out.println("\nEn zigzag : ");
		while (p.hasNext()) 
			System.out.print(p.next()+" ");
	}

}
