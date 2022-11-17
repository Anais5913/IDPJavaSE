package fr.dawan.formation.POO.models;

import fr.dawan.formation.POO.interfaces.EstDomestique;
import fr.dawan.formation.POO.interfaces.Truc;

public final class Chat extends Felin implements EstDomestique, Truc{ // classe qui ne pourras plus hériter par la suite (avec le final)

    public Chat() {
        count ++;
        // TODO Auto-generated constructor stub
    }

    public Chat(String name, String color, int age) {
        super(name, color, age, true, true);
        count++;
        // TODO Auto-generated constructor stub
    }
    
    public void crier () {
        
        System.out.println("Miaou Miaou");
    }

    public void demanderCroquettes () {
        
        System.out.println("Nourris moi, Humaine!");
    }
    
    public void demanderDesCaresses (){
        
        System.out.println("Tu approches ta main, je te bouffe");
        
    }
    
    public void jouerALaBalle() {
        
        System.out.println("Vas chercher la baballe humaine!");
    }

    @Override
    public void faitDesTrucs() {
        // TODO Auto-generated method stub
        
    }
    
    public static int getCount() {
        return count;
        
    }
}
