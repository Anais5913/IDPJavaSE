package fr.dawan.formation;

public class Methodes {

    public static void main(String[] args) {
       
        multiply(1);
        multiply(30, 20, 79, 9);
        multiply();
        
       int result = MyMath.sum(2,  3);
       
    }
    
    //public : portée de la méthode (défault protected)
    //int: type de retour. Si pas de retour void. 
    // Des qu'on a un calcul on fait un retour. 
    public int sum(int a, int b) {
        return a+b;
    }
    
    public static int multiply(int ...values) {
        // values = int []
        
        return 0;
    }
    
    public void sayHello() {
        System.out.println("Hello World !");
    }
    
    public boolean checkSomething(int truc) {
        if(truc < 0) {
            System.out.println("Nombre invalide");
            return false;
        }
        return true;
    }
}
