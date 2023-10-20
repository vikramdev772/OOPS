import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t Reverse String \n");
        char s[]= {'H','e','l','l','o'};
        System.out.println("\n\t Let s = "+Arrays.toString(s));
        Reverse r=new Reverse();
        r.reverseString(s);
    }    
}



            Reverse String 


	 Let s = [H, e, l, l, o]

	  Reversed String : [o, l, l, e, H]



      