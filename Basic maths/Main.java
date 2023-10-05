import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      System.out.println("\n\t Consecutive zeros (trailing zeros) \n");
      Scanner sc = new Scanner (System.in);
      int n;
      System.out.println("\n\t Enter a num : "+(n=sc.nextInt()));
      fact(n);
      trailingZeroes(n);
    }
       public static int trailingZeroes(int n) {
          int result=0;
          while(n>0){
              result=result+n/5;
              n=n/5;
  
          }
          System.out.println("\n\t result  : "+result);  
          return result;
      
       }
    public static void fact(int n){
      int f=1;
      for(int i=1;i<=n;i++){
        f*=i;
      }
      System.out.println("\n\t Factorial : "+f);
    }
  }

                        output :
                        
                        
         Consecutive zeros (trailing zeros)

2

         Enter a num : 2

         Factorial : 2

         result  : 0



         