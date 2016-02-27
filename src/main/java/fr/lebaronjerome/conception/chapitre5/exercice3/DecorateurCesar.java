package fr.lebaronjerome.conception.chapitre5.exercice3;


import java.io.IOException;
import java.io.OutputStream;

/**
 * 
 */
public class DecorateurCesar {

    /**
     * Default constructor
     */
    public DecorateurCesar() {
    }

    /**
     * 
     */
    private OutputStream outputStream;

    /**
     * @param paramOutputStream
     */
    public DecorateurCesar(OutputStream paramOutputStream) {
    }

    /**
     * @throws IOException 
     * 
     */
    public void encoderFlux(char paramCaractere, int paramDecalage) throws IOException {
    	int aEcrire = Cesar.code(paramCaractere, paramDecalage);
    	outputStream.write(aEcrire);
    }

}