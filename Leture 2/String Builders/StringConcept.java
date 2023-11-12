import java.util.*;
public class StringConcept {
    public static void main(String[] args) {
        System.out.println("\n\t String Builder ");
        StringBuilder sb = new StringBuilder("vikram");
        String str1 = new String("vikram");
        str1="Mark";
        System.out.println(str1);
        // str1="ram";
        // System.out.println("\n\t"+str1);
        // String str2 = new String("vikram");
        // System.out.println("\n\t The String : "+str2);
        // String ans = (str1.equals(sb.toString()))? "true":"false";
        // System.out.println("\n\t "+ans);
        if(str1 == sb.toString()){
            System.out.println("\n\t Equal \n");
        }else{
            System.out.println("\n\t not Equal");
        }
        
    }
}
