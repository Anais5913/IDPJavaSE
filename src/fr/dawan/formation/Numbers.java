package fr.dawan.formation;

public class Numbers {

    public static void main(String[] args) {
       
        /*
         * Numbers: types primitifs
         * 
         * Nom           Taille         Valeur                  Défaut
         * 
         * 
         * Entiers
         * -byte     8bits/1octet       -128 à 127                  0
         * -short    16bits/2octets     -2(15) à +2(15)             0
         * -int      32bits/4octets     -2(31) à 2(31)-1            0          
         * -long     64bits/8octets     -2(63) à 2(63)-1            0L
         * 
         * Flottants (ou nombres à virgules)
         * -float    32bits/4octets     -1.4*10(-45) à 3.5*10(38)   0.0f
         * -double   64bits/8octets     -4.9*10(-324) à 1.7*10(308) 0.0d
         * 
         */

        byte by = 125;
        byte by2 = (byte) 129; //-127
        System.out.println(by2);
        
        by2 = (byte) 130; // -126
        System.out.println(by2);
        
        int a = 10;
        int b = by; // caste automatique de la valeur de by en integer
        System.out.println(b); //125
        
        //byte b3 = b; //impossible
        
        /*
         * On peut caster sans soucis vers un type plus grand, mais pas le contraire
         * On peut caster un entier en décimal.
         */
        
       double db = b;
       System.out.println(db);
       
       float f = 123.589f;
       int c = (int) f; // obliger de caster pour valider la demande cependant on perds en precision
       System.out.println(c);
       
       /*
        * Opérateurs de calcul:
        * 
        * + addition
        * - soustraction
        * * multiplication
        * / division
        * % modulo
        * 
        * Le résultat d'une opération est considéré comme une valeur
        * => On enregistre non pas l'opération, on enregistre son résultat.
        */
       
       System.out.println(1+1); // 2
       
       int d = 321 + 12 / 78 * 3 - 1;
       
       System.out.println(d); // le résultat
       
       d = (1+1) * 3; // 6
       
       // Les calculs fonctionnent comme sur une calculatrice, avec le mm ordre de priorité
       
       d=10;
       d = d + 1;
       d++; // Incrémentation
       d = d - 1;
       d--; // Décrementation
       
       d = d * 1;
       d *= 1;
       d += 2;
       d -= 2;
       d /= 1;
       d %= 1;
       
       d = 10;
       
       System.out.println(d++); // 10 Affiche d, puis fait d + 1
       System.out.println(d); // 11
       
       System.out.println(++d); // 12 : Incrémente d, puis l'affiche
       
       /*
        * On peut faire des opérations entres les types, cependant
        * -> Il faut caster le résultat vers le type le plus grand et précis
        * 
        * Dans le cas contraire, il faudra caster explicitement, et on prend le risque de perdre en precision
        */
      
       int encoreUnInt = (int) (d+1.5); // Castage explicite
       double encoreUnDouble = d + 1.5; // Castage implicite
       
       int z = 3;
       int y = z;
       z = 2;
       
       System.out.println(y); // 3
       
    }

}
