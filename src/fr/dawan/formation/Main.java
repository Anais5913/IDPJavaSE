package fr.dawan.formation;

public class Main {

   public static void main(String[] args) {
       
        System.out.println("Hello World!"); 
        
        /*
         * Les variables
         * Pour déclarer une variable on utilise: 
         * type nom;
         * 
         * Les types: 
         * int, String, double, boolean, char, short, float...
         * 
         * declarer vs initialiser : 
         */

        String greeting; // Déclarée
        String message= "Hello World"; // Déclarée et initialisée
        
        // name ="toto"; -> erreur, variable non déclarée
        // System.out.println(greeting); -> erreur, variable, non initialisée
        
        /*Régles de nommage:
         * - variables: camelCase, snake_case
         * -> PAS de kebab-case
         * -minuscules
         * -pas de mots réservés (String, ect ....)
         * -Les noms de variables acceptent des lettres, des chiffres, certains caractéres spéciaux(_, & ...)
         * -Les noms de variables peuvent commencer par des lettres, ou des caractères spéciaux (jamais de chiffre)
         */
        
    }

}
