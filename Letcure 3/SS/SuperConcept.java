
package SS;
public class SuperConcept {
    public static void main(String[] args) {
        System.out.println("\n\t Super key word ");
        // SuperClass sp = new SuperClass(10);
        // sp.display();
        // Subclass sb = new Subclass(10, 9);
        // sb.display();
        Subclass sb = new Subclass(10,20);
    }
}

class SuperClass {
    int value;

    SuperClass(int value) {
        this.value = value;
          System.out.println("\n\t Super class Constructor called  ");

    }
    void display(){
        System.out.println("\n\t Super class method ");
    }
}

class Subclass extends SuperClass{
    int extraValue;
    Subclass(int eV,int value){
        super(value);//invoking the super class
        this.extraValue=eV;
        System.out.println("\n\t sub class constructor is called  ");
        System.out.println("\n\t sub class extra :   "+eV);
        System.out.println("\n\t sub class super value  :   "+value);


    }

    void display(){
            // super.display();//Acessing superclass method
            System.out.println("\n\t sub class method ");
    }
}