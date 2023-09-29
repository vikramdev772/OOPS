public class Copy {
    private double price;
    private String name;
    Copy(String n,double value){
        System.out.println("\n\t Copy constructor is called \n");
        this.name=n;
        this.price=value; 
        System.out.println("\n\t Name : "+n);       
        System.out.println("\n\t Price : "+value);
               
    }
    
}
