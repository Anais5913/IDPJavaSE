package fr.dawan.formation.POO;

import java.util.ArrayList;
import java.util.List;

import fr.dawan.formation.POO.interfaces.EstDomestique;
import fr.dawan.formation.POO.models.Animal;
import fr.dawan.formation.POO.models.Chat;
import fr.dawan.formation.POO.models.Felin;
import fr.dawan.formation.POO.models.Chien;

public class Main {

    // La classe permets de creer les objets!
    // l'objet c'est ce qui est créé grâce à une classe. C'est l'instance de la classe. 
    
    public static void main(String[] args) {
        
        Chien chien = new Chien(); 
        chien.setName("Medor");
         
        Chat chat = new Chat("Cactus","tabby", 10);
        System.out.println(chat.getName());
        chat.manger();
        
        chat.crier();
        chien.crier();
        
        Felin felin = new Felin ("Jean Michel", "roux", 103);
        felin.crier();
        chien.demanderDesCaresses();
        chat.demanderCroquettes();
        
        System.out.println(chat.getPelage());
        
        System.out.println(Animal.getCount());
        System.out.println(Chat.getCount());
        System.out.println(Felin.getCount());
        
        chat.switchPelage();
        
        // Polymorphisme 
        Animal cat1 = new Chat();
        Animal felin1 = new Felin();
        
        System.out.println(cat1.getPelage());
        System.out.println(felin1.getPelage());
        cat1.crier();
        
        /*
         * Pas acces aux attributs et méthodes qui ne viennent pas de la class Animal
         */
    
        List<Animal> mes_animaux = new ArrayList<>();
        
        mes_animaux.add(felin1);
        mes_animaux.add(cat1);
        mes_animaux.add(chien); // chien contenu dans la lkiste sera caster en animal
    
        EstDomestique chien2 = new Chien();
        EstDomestique chat2 = new Chat();
        //EstDomestique felin = new Felin();
        chien2.demanderDesCaresses();
        chat2.jouerALaBalle();
        
        //mes_animaux.add(chien2); -> n'est pas un Animal
         /*
          * C'est le typage de la variable qui défini sont type, et pas le constructor utilisé. 
          * Les objets sont des instances de leur classe, mais aussi des classes et interacent dont
          * ils héritent
          */
        
        //Chien chien = new Chien();
        System.out.println("Chien est un animal?" +(chien instanceof Animal));
        System.out.println("Chien est un chien?" +(chien instanceof Chien));
        System.out.println("Chien est un estDomestique?" +(chien instanceof EstDomestique));
    
        //EstDomestique chien2 = new Chien ();
        System.out.println("Chien est un animal?" +(chien2 instanceof Animal));
        System.out.println("Chien est un chien?" +(chien2 instanceof Chien));
        System.out.println("Chien est un estDomestique?" +(chien2 instanceof EstDomestique));
    
    
    
    }
    
}
