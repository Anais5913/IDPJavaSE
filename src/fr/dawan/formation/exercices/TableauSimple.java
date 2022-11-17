package fr.dawan.formation.exercices;

public class TableauSimple {
    
    static int [] notes = {12, 17, 19, 10, 5};
    static int nbElements;
    static double moyenne; 
    
    public static double moyenneNotes() {
        
        for(int i = 0; i < notes.length; i++) {
            if(notes[i]>0 && notes[i]<20) {
                nbElements++;
                moyenne+=notes[i];
            }
        }
        return moyenne/nbElements;    
    }   
    
    public static double mediane() {
        int milieu = notes.length/2;
        if(notes.length%2 == 1) {
            return notes[milieu];
        }else {
            return (notes[milieu-1] + notes[milieu]) / 2.0;
        }
    }
    
    public static void main(String[] args) {
       
        System.out.println("La moyenne est de " +moyenneNotes());
        
        System.out.println("La médiane est " +mediane());
    }

}
