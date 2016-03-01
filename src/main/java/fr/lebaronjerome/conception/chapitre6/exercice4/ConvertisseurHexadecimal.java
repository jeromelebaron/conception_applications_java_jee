/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice4;

/**
 * @author Jerome
 *
 */
public class ConvertisseurHexadecimal implements IConvertisseur {

	/* (non-Javadoc)
	 * @see fr.lebaronjerome.conception.chapitre6.exercice4.IConvertisseur#convertir(int)
	 */
	@Override
	public void convertir(int paramEntierAConvertir) {
		System.out.println(Integer.toHexString(paramEntierAConvertir));
	}

}
