
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        
        /*
         for (intialization; condition;increment/decrement){
            //body
         }
         */

         for (int num = 1; num<=10; num+= 1){
            System.out.print("\n\t"+num);
         }

         for( int n=1; n<=5; n+=2){
            System.out.println("\n\t"+n);
         }

         Scanner in=new Scanner(System.in);
         int numbers = in.nextInt();
         
         for(int i=1;i<=numbers;i++){
            System.out.println("\n\t Hello world! ..printing \n");
         }
    }
    
}
