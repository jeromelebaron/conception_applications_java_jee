/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice4;

/**
 * @author Jerome
 *
 */
public class ConvertisseurOctal implements IConvertisseur {

	/* (non-Javadoc)
	 * @see fr.lebaronjerome.conception.chapitre6.exercice4.Convertisseur#convertir(int)
	 */
	@Override
	public void convertir(int paramEntierAConvertir) {
		System.out.println(Integer.toOctalString(paramEntierAConvertir));
	}

}
