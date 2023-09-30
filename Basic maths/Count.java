
import java.util.*;

public class Count {
    public static void main(String[] args) {
        System.out.println("\n\t Count digits present in number \n");
            int n=567;
            count(n);
    }
    public static int count(int n){
         int c=(int)(Math.log10(n)+1);
         System.out.println("\n\t Count is : "+c);
         return c;

    }
}
                       Count digits present in number


                         Count is : 3



                         