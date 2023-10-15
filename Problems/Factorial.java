import java.util.*;

public class Factorial{
    public static void main(String[] args) {
        System.out.println("\n\t  Factorial \n");
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t Enter a num : ");
        int n=sc.nextInt();
        fact(n);

    }
    private static void fact(int n){
        int f=1;
        for(int i=0;i<n;i++){
            f=f*i;
        }
        System.out.println("\n\t "+n+"! is = "+f);
    }
    
}

