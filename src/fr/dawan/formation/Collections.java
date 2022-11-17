package fr.dawan.formation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.dawan.formation.Collections;

public class Collections {
    
    static void maMethode(int value) {
        
        value *= 1000;
        System.out.println(value);
        
    }
    

    public static void main(String[] args) {
        
        /*
         *  Les collections : des classes qui permettent de gérer des listes / tableaux
         */

        Integer[] arr = {20, 30, 40};
        Integer [] arr2 = new Integer[arr.length];
        Arrays.setAll(arr2,  i -> arr[i]); // permets de copier tout le tableau dans un autre
        List<Integer> collection = Arrays.asList(arr2);
        
        List<Integer> notes = new ArrayList<>(Arrays.asList(20, 23, 45, 60));
        notes.add(80);
        
        System.out.println("Taille du tableau " +notes.size());
        
        notes.remove(0); // a l'index
        int index = notes.indexOf(60);
        notes.remove(index);
        
        String message = "Voici une note : ";
        
        notes.forEach(note -> {
            
        System.out.println(message + note);
        
        }); // permets d'afficher les notes du tableau
        
        notes.forEach(n -> System.out.println(n)); // atteint une fonction en parametre
        System.out.println("--------------");
        
        notes.forEach(System.out::println);
        System.out.println("--------------");
        
        notes.forEach(Collections::maMethode); // appel la methode pour toutes les notes du tableau 
        System.out.println("--------------");
        
        for(int i = 0; i < notes.size(); i++) { // appel la methode dans un for
            maMethode(notes.get(i));
        }

    }
}
