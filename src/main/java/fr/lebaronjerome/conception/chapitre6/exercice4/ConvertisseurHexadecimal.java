/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice4;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Jerome
 *
 */
public class ConvertisseurHexadecimal implements IConvertisseur, Observer {

	/* (non-Javadoc)
	 * @see fr.lebaronjerome.conception.chapitre6.exercice4.IConvertisseur#convertir(int)
	 */
	@Override
	public void convertir(int paramEntierAConvertir) {
		System.out.println(Integer.toHexString(paramEntierAConvertir));
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable paramO, Object paramArg) {
		AConvertir aConvertir = (AConvertir) paramArg;
		convertir(aConvertir.getEntierAConvertir());
	}

}
