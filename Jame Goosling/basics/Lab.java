import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int max=0;
        if(a>b){
            max=a;
        }
        else{
            max=b;
        }
        System.out.println("\n\t Maximum num : "+max);
    }
}
