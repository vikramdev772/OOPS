
import java.util.Scanner;

public class Ifs {
    public static void main(String[] args) {
        System.out.println("\n\t if else programs");
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t INPUT VALUE : ");
        int s=sc.nextInt();
        // int s = 9;
        if(s<=10)
        {
            s=s+2;
        }
        else{
            s=s+1;
        }
    System.out.println("\n\t "+s+"\n");
    }
}
