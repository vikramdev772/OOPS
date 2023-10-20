import java.util.*;
class Reverse{
    public void reverseString(char[] s) {
        int i=0 ,e=s.length-1;
        while(i<e){
            char temp = s[e];
            s[e]=s[i];
            s[i]=temp;
            i++;
            e--;
        }
        System.out.println("\n\t  Reversed String : "+Arrays.toString(s));
    }
}




