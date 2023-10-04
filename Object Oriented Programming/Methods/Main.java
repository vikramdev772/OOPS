
public class Main{
    public static void main(String[] args) {
        System.out.println("\n\t Method overloading & overriding \n");
        int r=sum(10,5);
        System.out.println("\n\t Sum : "+r);
        double o=sum(5,6,1);
        System.out.println("\n\t Sum : "+o);
        float f=sum(3.2f,4.5f);
        System.out.println("\n\t Floating values sum : "+f);        

        Animal d= new Dog();
        Animal c= new Cat();

        d.makeSound();
        c.makeSound();
        System.out.println("\n\t Dog name is duke : "+d);
        System.out.println("\n\t Cat name is Tom  : "+c);


    }
    private static int sum(int a,int b){
        return a+b;
        
    }
    private static double sum(double a,double b,double c){
        return a+b-c;
    }

    private static float sum(float x, float y){
        return x+y;
    }
}

    //         output:

    //         Method overloading & overriding 


	//  Sum : 15

	//  Sum : 10.0
    //       Floating values sum : 7.7




