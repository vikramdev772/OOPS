
import java.io.*;

class For {
    public static void main(String[] args) {
        // Print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Print even numbers from 1 to 20
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        // Print numbers in reverse order from 10 to 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}