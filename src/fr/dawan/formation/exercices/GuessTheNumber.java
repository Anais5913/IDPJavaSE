package fr.dawan.formation.exercices;

import java.util.Scanner;

public class GuessTheNumber {
    
    private final static int max = 100;
    private final static int min = 0;
    

    public static void main(String[] args) {
        
       Scanner scan = new Scanner (System.in);
       int nombre = (int) (Math.random() * 100)+1;
       int nombreUser, nbSaisis = 0;
       
       System.out.println("Devinez le nombre choisis aléatoirement entre 0 et " +max);
        
       do {
          
           nombreUser = scan.nextInt();
           nbSaisis++;
          
           if(nombreUser < nombre)
               
             System.out.println("Plus grand !");
          
           else if(nombreUser > nombre)
               
             System.out.println("Plus petit !");
           
           
       
       }while (nombreUser != nombre);
       
        System.out.println("Great!");
        System.out.println("Trouvé en " + nbSaisis + " coups");
    
    
        System.out.println("Recommencer? y: yes, n: no");
        while(scan.next().toLowerCase().equals("y") || scan.next().toLowerCase().equals ("yes"));
    
        System.out.println("Bye ! ");
}

}