import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("\n\t Prime check \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Enter a num : ");
        int n=sc.nextInt();

        int count =0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if((n/i)!=i){
                    count++;
                }
            }
        }if(count==2) {
            System.out.println("\n\t it is prime \n");
        }else{
            System.out.println("\n\t it not a prime\n");
        }
    }
}


                output :

                         Prime check


         Enter a num :
        
         2

         it is prime


         