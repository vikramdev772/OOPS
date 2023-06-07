import java.util.Scanner;

public class Mif {
    public static void main(String[] args) {
        System.out.println("\n\t Multiple if else");
        Scanner sc= new Scanner(System.in);
        System.out.println("\n\t Enter a number : ");
        int s =sc.nextInt();
        if (s > 1000){
            s+=200;
        }else if(s >2000){
            s+=100;
        }else{
            System.out.println("\n\t Eroor bro ");
        }
        System.out.println("\n\t"+s+"\n");
    
    }
}
