package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.enums.Peau;

abstract public class Animal { // Classe abstrait qui ne peut pas être instancier
    
    // POJO = Plain Old Java Object -> Classe sans restriction & Bonne pratique, convention d'écriture
    // Java beans, type de POJO -> classe qui contient un constructeur, attributs privées et des getteurs et setteurs, serializable
    /*
     * Public -> utilisable partout
     * Private -> utilisable dans la classe
     * Protected (par default) -> utilisable uniquement dans le package
     */
    
    private int nbLegs, age;
    private String color, name;
    private Peau pelage;
    public static int count = 0;
    
    public Animal() {
        
        count++;
        
    }
    
    public Animal (String name, String color, int age) {
        
        this.name = name;
        this.color = color;
        this.age = age;
        
        count++;
    }
    
    public Animal (String name, String color, int age, int nbLegs) {
        
        this.name = name;
        this.color = color;
        this.age = age;
        this.nbLegs = nbLegs;
        
        count++;
    }
    //Type de pelage;
    //Type d'habitation
    //Cri
    
    public void manger() {
        System.out.println(this.name + " dit Miam Miam");
    }
    
    public abstract void crier(); // abstract car pas complet, une partie ici et le reste dans les sous classe en fonction de leur crie
    
    public int getNbLegs() {
        return nbLegs;
    }

    public void setNbLegs(int nbLegs) {
        this.nbLegs = nbLegs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            
        this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Peau getPelage() {
        return pelage;
    }

    public static int getCount () {
        return count;
    }
    public void setPelage(Peau pelage) {
        this.pelage = pelage;
    
    }
public void switchPelage() {
        
        switch(this.pelage) {
        
        case FOURRURE:
            System.out.println("Perds ses poils partout!");
            break;
        case ECAILLES:
            System.out.println("Pas trés doux!");
            break;
        case CARAPASSES:
            System.out.println("Change de carapasses tous les jours!");
            break;
        default:
            System.out.println("Plus d'idées!");
            break;
        }
}
}

