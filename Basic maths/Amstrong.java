import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        System.out.println("\n\t Amstrong numbers \n");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("\n\t The num : "+n);
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum=sum+(ld*ld*ld);
            n=n/10;
          
    
        }
        System.out.println("\n\t The armstrong num : "+sum);
    }
}