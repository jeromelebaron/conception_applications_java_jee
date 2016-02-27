/**
 * 
 */
package fr.lebaronjerome.conception.chapitre5.exercice10;

/**
 * @author Jerome
 *
 */
public class Main {

	public static void main(String[] args) {

		Repertoire repertoireJer = new Repertoire("Jerome");
		IRepertoire proxyRepertoire = new ProxyRepertoire(repertoireJer);
		proxyRepertoire.lister();
		Repertoire repertoireMarjo = new Repertoire("Marjo");
		proxyRepertoire = new ProxyRepertoire(repertoireMarjo);
		proxyRepertoire.lister();

	}

}
