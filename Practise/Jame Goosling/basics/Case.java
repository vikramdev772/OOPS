

import java.io.*;
import java.util.Scanner;
public class Case {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);


        System.out.println("\n\t Enter the string : "+in.next().trim());

        // char ch = in.next().trim().charAt(0);
        char ch = in.next().trim().charAt(3);
        System.out.println(ch);

        String word = "   hello world !     ";
        System.out.println(word.trim());
        System.out.println(word.trim().charAt(0));
        
    }
}
