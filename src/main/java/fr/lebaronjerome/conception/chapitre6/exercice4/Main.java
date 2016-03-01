/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice4;

/**
 * @author Jerome
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AConvertir aConvertir = new AConvertir();
		ConvertisseurHexadecimal convHexa = new ConvertisseurHexadecimal();
		aConvertir.addObserver(convHexa);
		ConvertisseurBinaire convBinaire = new ConvertisseurBinaire();
		aConvertir.addObserver(convBinaire);
		ConvertisseurOctal convOctal = new ConvertisseurOctal();
		aConvertir.addObserver(convOctal);
		
		

	}

}
