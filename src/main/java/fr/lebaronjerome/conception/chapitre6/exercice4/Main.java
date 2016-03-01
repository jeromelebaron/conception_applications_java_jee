/**
 * 
 */
package fr.lebaronjerome.conception.chapitre6.exercice4;

import java.util.Scanner;

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
		
		int i = 0;
		while (i<10) {
			Scanner scanner = new Scanner(System.in);
			int entierSaisi = Integer.parseInt(scanner.nextLine());
			aConvertir.setEntierAConvertir(entierSaisi);
			i++;
		}

	}

}
