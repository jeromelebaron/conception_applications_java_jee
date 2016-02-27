package fr.lebaronjerome.conception.chapitre5.exercice3;

/**
 * 
 */
public class Cesar {

    /**
     * Default constructor
     */
    public Cesar() {
    }

    /**
     * @param caractere  
     * @param decalage 
     * @return
     */
    public static char code(char caractere , int decalage) {
        char caractereEncode = (char) (caractere + decalage);
        return caractereEncode;
    }

    /**
     * @param caractere 
     * @param decalage 
     * @return
     */
    public static char decode(char caractere, int decalage) {
    	char caractereDecode = (char) (caractere - decalage);
        return caractereDecode;
    }

}