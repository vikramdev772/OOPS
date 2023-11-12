import java.util.Scanner;

public class palindrome {
    
    public static boolean pal(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
          
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Enter the String : ");
        String str=sc.next();
        System.out.println("\n\t The String : "+str);
        boolean r= pal(str);
        System.out.println("\n\t"+r);
        
    }
    
}
