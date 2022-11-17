package fr.dawan.formation.exercices;

import java.util.Scanner;

public class CalculatriceCorrection {
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);
        
        do {
        
        System.out.println("Entrez votre calcul");
        
        int n1 = scan.nextInt();
        String op = scan.next();
        int n2 = scan.nextInt();
        
        switch(op) {
        case "+":
            System.out.println(n1 + n2);
            break;
        case "-":
            System.out.println(n1 - n2);
            break;
        case "*":
        case "x":
            System.out.println(n1 * n2);
            break;
        case "/":
            System.out.println(n1 / n2);
            break;
        case "%":
            System.out.println(n1 % n2);
            break;
        default:
            System.out.println("Opération invalide");
        }
        
        System.out.println("Recommencer? y: yes, n: no");
    } while(scan.next().toLowerCase().equals("y") || scan.next().toLowerCase().equals ("yes"));
        
        System.out.println("Bye ! ");

    }

}
