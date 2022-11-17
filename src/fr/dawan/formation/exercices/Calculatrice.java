package fr.dawan.formation.exercices;

import java.util.Scanner;

public class Calculatrice {
    
    static public void menuPrincipal () {
        System.out.println("-----MENU-----");
        System.out.println("1.Additionner");
        System.out.println("2.Soustraire");
        System.out.println("3.Multiplier");
        System.out.println("4.Diviser");
        System.out.println("5.Quitter le menu");
    }

    public static int additionner(int a, int b) {
        
        return a+b;
    }
    
    public static int soustraire (int a, int b) {
        
        return a-b;
    }
    
    public static int multiplier (int a, int b) {
        
        return a*b;
    }
    
    public static int diviser (int a, int b) {
        
        return a/b;
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int a = 0;
        int b = 0;
        int choix = 0;
        
        do { 
        System.out.println("Veuillez saisir un chiffre");
        a = scan.nextInt();

        System.out.println("Veuillez saisir un second chiffre");
        b = scan.nextInt();
        
        menuPrincipal ();
        scan.nextLine();
       
        System.out.println("Faites votre choix");
        choix = scan.nextInt();
              
        if(choix == 1) {
            
            System.out.println(additionner(a, b));
            
        }
        
        else if(choix == 2) {
            
            System.out.println(soustraire(a, b));
        
        }
        
        else if (choix == 3) {
            
            System.out.println(multiplier(a, b));
        }
        
        else if(choix == 4) {
            
            System.out.println(diviser(a, b));
        }
    
    } while (choix==5);
             
        if(choix==5) {
            System.out.println("Vous avez quitté le menu");
            }
        menuPrincipal ();
        scan.nextLine();
       
        System.out.println("Faites votre choix");
        choix = scan.nextInt();
        }
    
 
    }


