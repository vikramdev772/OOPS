abstract class Parent {
    void eat(){
        System.out.println("\n\t Eating \n");
    }
    abstract void walk();
    // not depended bu animal give's idea not impelementation 
    
}
class Son extends Parent{
    void walk(){
        System.out.println("\n\t Skating  \n");
    }

}
class Dau extends Son{
    void walk(){
        System.out.println("\n\t Runnig \n");
    }
}