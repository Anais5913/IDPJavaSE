package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.enums.Peau;

public class Felin extends Animal {

    private boolean isSociable;
    private boolean hasGriffesRetractiles;
    
    public Felin() {
        
        this.setPelage(Peau.FOURRURE);
        
    }
   
    public Felin(String name, String color, int age) {
        
        super(name, color, age, 4);
        this.setPelage(Peau.FOURRURE);
        
    }
    
    public Felin(String name, String color, int age, boolean sociable, boolean griffes) {
        
        super(name,color,age, 4);
        this.hasGriffesRetractiles = griffes;
        this.isSociable = sociable;
        this.setPelage(Peau.FOURRURE);
    }
    
    @Override
    public void crier () {
        
        System.out.println("Graou Graou");
    }

    public boolean isSociable() {
        return isSociable;
    }

    public void setSociable(boolean isSociable) {
        this.isSociable = isSociable;
    }

    public boolean isHasGriffesRetractiles() {
        return hasGriffesRetractiles;
    }

    public void setHasGriffesRetractiles(boolean hasGriffesRetractiles) {
        this.hasGriffesRetractiles = hasGriffesRetractiles;
    }
    
    
}
