import java.util.Scanner;

public class  Loop {


    public static void lp(int r,int c){
        for(int i=1;i<=r;i++){
            
            for(int j=1;j<=c;j++){
                if(i==1||i==r || j==1||j==c){
                    System.out.print("\t *");
                }else{
                    System.out.print("\t ");
                }
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        System.out.println("\n\t Loops ");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Enter a num : ");
         
        lp(4, 4);
    }
    
    
}
