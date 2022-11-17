package fr.dawan.formation.exercices;

import java.util.Scanner;

public class GuessTheNumberCorrection {
    
    static int user_guess;
    static int previous=-1;
    static int nbSaisis;
    static int pc_number = (int) (Math.random() * 100)+1;
    
    public static void main (String[]args) {
        
        start();
    }
    
    static void start () {
        
       
        System.out.println("Devine le nombre auquel je pense!");
        Scanner scan = new Scanner (System.in);
        
        do {
            System.out.println("(Entrez un nombre entre 0 et 100)");
            user_guess = scan.nextInt();
            nbSaisis++;
            
            
        } while (!compare(user_guess));
        
        System.out.println("Rejouer ? y: yes, n: no");
        String response = scan.next().toLowerCase();
        
        if(response.equals("y") || response.equals("yes")) {
            start();
        } else {
            System.out.println("Bye ! ");
        }
    }
    
    static boolean compare (int user) {
        
        if(user == pc_number) {
            System.out.println("Gagné !");
            System.out.println("Trouvé en " + nbSaisis + " coups");
            return true;
        }
        
        if(user < pc_number) {
            System.out.println("Trop bas !");
        } else {        
            System.out.println("Trop haut ! ");
        }
            hint();
            return false;
    }
   
    static void hint() {
        int diff = Math.abs(pc_number - user_guess);
        if (previous != -1) {
            if(diff < previous) {
                System.out.println("On se rapproche !");
            }
            else if(diff > previous) {
                System.out.println("On s'éloigne");
            }
            if(diff == previous) {
                System.out.println("On tourne en rond !");
            }
        }
        previous = diff;
        
    }
}
