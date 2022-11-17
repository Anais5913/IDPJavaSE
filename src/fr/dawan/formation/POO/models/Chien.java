package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.interfaces.EstDomestique;

public class Chien extends Animal implements EstDomestique {

    @Override
    public void crier() {
       
        System.out.println("Wouaff Wouaff");
        
    }
    
    public void demanderDesCaresses (){
        
        System.out.println("Yeeah");
        
    }
    
    public void jouerALaBalle() {
        
        System.out.println("Oui la baballe");
    }
    
    public void faitDesTrucs () {
        
        
    }
}
