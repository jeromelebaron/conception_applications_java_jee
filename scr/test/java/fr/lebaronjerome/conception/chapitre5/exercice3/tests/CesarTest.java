/**
 * 
 */
package fr.lebaronjerome.conception.chapitre5.exercice3.tests;

import org.junit.Assert;
import org.junit.Test;

import fr.lebaronjerome.conception.chapitre5.exercice3.Cesar;

/**
 * @author Jerome
 *
 */
public class CesarTest {

	/**
	 * Test method for
	 * {@link fr.lebaronjerome.conception.chapitre5.exercice3.Cesar#code(char, int)}
	 * .
	 */
	@Test
	public void testCode() {
		char caractereAttendu = 'd';
		char caractereGenere = Cesar.code('a', 3);

		Assert.assertEquals("Vérification de la méthode d'encodage", caractereAttendu, caractereGenere);
	}

	/**
	 * Test method for
	 * {@link fr.lebaronjerome.conception.chapitre5.exercice3.Cesar#decode(char, int)}
	 * .
	 */
	@Test
	public void testDecode() {
		char caractereAttendu = 'a';
		char caractereGenere = Cesar.decode('d', 3);

		Assert.assertEquals("Vérification de la méthode de decodage", caractereAttendu, caractereGenere);
	}

}
