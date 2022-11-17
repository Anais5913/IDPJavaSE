package fr.dawan.formation.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableauDeuxDimensions {
    
    static double [][] tableau = {
            {5, 10, 12, 3, 8},
            {18, 20, 13, 15, 19},
            {12, 14, 13, 19},
            {16, 9, 7, 20, 13},
        };
    static double [] moyenneTableau = new double [4];

    static int nbElements=0;
    static double moyenne=0; 

    public static double moyenneNotes() {
        
        for(int i = 0; i < tableau.length; i++) {
        for(int j = 0; j < tableau.length; j++) {
            if (tableau[i][j]!=0) {
                nbElements++;
                moyenne+=tableau[i][j];
                System.out.println(moyenne/nbElements);
          
    
                }
            }
        } 
    
        return moyenne;
}  
    
    public static void main(String[] args) {
        
        List<List<Integer>> groupe = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(30,18,15,17)),
                        new ArrayList<>(Arrays.asList(30,12,15,17))
                        )); // Maniere pour ajouter dans un tableau
        groupe.add(new ArrayList<>(Arrays.asList(0, 10, 20))); // Second maniere de mettre en place
        
    }
}
