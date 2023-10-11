abstract public class Animal {
    void eat(){
        System.out.println("\n\t Animal is eating \n");
    }
    
}
class Horse extends Animal{
    void walk(){
        System.out.println("\n\t Walks on 4 legs \n");
    }
}
class chicken extends Animal{
    void walk(){
        System.out.println("\n\t Walks on 2 legs \n");
    }
}