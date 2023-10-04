
public class Main{
    public static void main(String[] args) {
        System.out.println("\n\t Method overloading & overriding \n");
        int r=sum(10,5);
        System.out.println("\n\t Sum : "+r);
        double o=sum(5,6,1);
        System.out.println("\n\t Sum : "+o);


    }
    private static int sum(int a,int b){
        return a+b;
        
    }
    private static double sum(double a,double b,double c){
        return a+b-c;
    }
}

            output:

            Method overloading & overriding 


	 Sum : 15

	 Sum : 10.0


     