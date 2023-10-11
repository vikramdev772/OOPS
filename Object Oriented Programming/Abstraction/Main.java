public class Main{
    public static void main(String[] args) {
        System.out.println("\n\t Abstraction \n");
        Horse h= new Horse();
        h.eat();
        h.walk();
        chicken c=new chicken();
        c.eat();
        c.walk();
        // Animal a=new Animal(); Cannot instantiancce the type animal 
        System.out.println("\n\t Abstract methods \n");
        Son s=new Son();
        Dau d=new Dau();
        s.walk();
        d.walk();

    }
}

        // output:

        
        //  Abstraction 


        //  Animal is eating 


        //  Walks on 4 legs 


        //  Animal is eating 


        //  Walks on 2 legs 




