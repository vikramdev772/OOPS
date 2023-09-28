
public class Basic {
    public static void main(String[] args) {
        System.out.println("\n\t Object Oriented Programming \n");
        System.out.println(
                "\n\t Oops is core of java programming,\n\t which is used for designing a program that uses\n\t\tObjects & Classes ");
        System.out.println("\n\t it promotes Modularity , Reusability , Maintainability of code \n");       
        System.out.println("\n\t Class is a blueprint which defines some properties and behaviors \n"); 
        System.out.println("\n\t Object are real entities.object is an instance of class. \n"); 
        Animal human = new Animal();//Animal is a class
        human.eat();//human is a object eat is a method
    }
}

class Animal{

    private static void eat(){
        System.out.println("\n\t Animal is eating.. \n");
    }
}

                                output:

                                Object Oriented Programming


         Oops is core of java programming,
         which is used for designing a program that uses
                Objects & Classes

         it promotes Modularity , Reusability , Maintainability of code


         Class is a blueprint which defines some properties and behaviors


         Object are real entities.object is an instance of class.


         Animal is eating..


         