package fr.dawan.formation.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableauSimpleCollectionsCorrection {
    
    static List<Integer> clean(List<Integer> grades_dirty) {
        List<Integer> cleaned = new ArrayList<>();
        for(int g : grades_dirty) {
            if(g >= 0 && g <=20) {
                cleaned.add(g);
            }
        }
        return cleaned;
    }
    
    static double average(List<Integer> grades) {
        
        int sum=0;
        int good_grades=0;
        for(int grade : grades) {
            if(grade >=0 && grade <=20) {
            sum+=grade;
            good_grades++;
        }
    }
        return sum / good_grades;
}
    static double average2(List<Double> grades) {
        
        int sum=0;
        int good_grades=0;
        for(double grade : grades) {
            sum+=grade;
            good_grades++;
        }
        return sum / good_grades;
}

    static double mediane(List<Integer> grades) {
        
        java.util.Collections.sort(grades); // Permets de trier le tableau
        
        if(grades.size() % 2 !=0) {
            int index = (int) Math.floor(grades.size() / 2); // Math.floor permets d'arrondir a l'inférieur
            System.out.println("Index " + index);
            
            return grades.get(index);
        
        }else { // paire
            
            int indexUp = grades.size() / 2;
            int indexDown = indexUp - 1;
            return (indexUp + indexDown) / 2;
        }
    }

    public static void main(String[] args) {
        
        List<Integer> grades = new ArrayList <>(Arrays.asList(-1, 0, 2, 15, 18, 20, 25));
        
        List<Integer> cleaned_grades = clean(grades);
        double moyenne = average(cleaned_grades);
        System.out.println("Moyenne :" +moyenne);
        int mediane = (int) mediane(cleaned_grades);
        System.out.println("Mediane : " +mediane);
        
        List<List<Integer>> groupe = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(30,18,15,17)),
                        new ArrayList<>(Arrays.asList(30,12,15,17))
                        )); // Maniere pour ajouter dans un tableau
        groupe.add(new ArrayList<>(Arrays.asList(0, 10, 20))); // Second maniere de mettre en place
        
        List <Double> all_moyenne = new ArrayList<>(); 
        // clean -> array list d'integer
        groupe.forEach(notes -> {
            List<Integer> cleaned = clean(notes);
            double m = average(cleaned);
            double me =  mediane(cleaned);
            all_moyenne.add(m);
            System.out.println("Moyenne :" +m+",Mediane" +me);
        });
        
        System.out.println("Moyenne de classe" +average2(all_moyenne));
    }

}
