import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t Enter a num : ");
        int a=sc.nextInt();
        System.out.println("\n\t Enter b num : ");
        int b=sc.nextInt();
        getSum(a,b);
        
    }
    public static int getSum(int a, int b) {
        while (b != 0) {
           int carry = a & b;
           a = a ^ b;

           
           b = carry << 1;
       }
       System.out.println("\n\t Sum is : "+a);

       return a;
   }
}


                    output:

        Enter a num : 
5

         Enter b num : 
6

         Sum is : 11


         