package fr.dawan.formation;

public class TypeBoolean {

    public static void main(String[] args) {
        
        /* Boolan : true / false
         * Valeur binaire, qui ne peut avoir que deux valeurs possible : vrai ou faux
         * 
         */

        boolean bool = true;
        
        /* Operateurs conditionnels
         *      == égalité
         *      != différence
         *      > < supérieur à / inférieur à
         *      >= <= supérieur ou égal / inférieur ou égal
         *      || OU
         *      && ET
         *      ! Non logique -> retourn  true si uen condition est fausse 
         */
        
        bool = !bool;
        
        bool = 4 < 10; // true
        
        bool = !false; // true        
        bool = !(4 < 10); // false
        
        bool = 10 == 9 || 10 < 20; //true        
        bool = 10 == 9 && 10 < 20; //false
        
        bool = true == !false; //true
        bool = true == !false && !true; //false

        System.out.println(bool);
        
        /******/
       
        String a = "Hello World";
        String b = "Hello ";
        b += "World";
        
        System.out.println(a == b); // false : verifie en mémoire
      
        System.out.println(a.equals(b)); // true : verifie le contenu de la string
        
    }

}
