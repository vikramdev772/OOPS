import java.util.Scanner;

public class Digit{
    public static void main(String[] args) {
        System.out.println("\n\t Digit Concept \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Enter a num : ");
        int n=sc.nextInt();
        System.out.println("\n\t Number : "+n);
        count(n);
        
    }
    private static int count(int n){
        int c=0;
        while(n>0){
            int lastDigit = n%10;
            c=c+1;
            n=n/10;
        }
     System.out.println("\n\t number of digits present in a number : "+c);
        return c;

    }

}


            output:

                   Digit Concept


         Enter a num :
        
         7789

         Number : 7789

         number of digits present in a number : 4





