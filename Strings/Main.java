import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        // Close the Scanner to prevent resource leaks
        scanner.close();
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        // Convert the string to lowercase to make the comparison case-insensitive
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        // Compare characters from the beginning and end, moving towards the center
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                // Characters don't match, not a palindrome
                return false;
            }
            left++;
            right--;
        }

        // If the loop completes, the string is a palindrome
        return true;
    }
}
