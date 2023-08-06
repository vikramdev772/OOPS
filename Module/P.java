import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

   
        int factorialTraditional = 1;
        for (int i = 1; i <= number; i++) {
            factorialTraditional *= i;
        }

        System.out.println("Factorial using traditional for loop: " + factorialTraditional);

        
        int[] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int factorialEnhanced = 1;
        for (int num : numbers) {
            factorialEnhanced *= num;
        }

        System.out.println("Factorial using enhanced for loop: " + factorialEnhanced);
    }
}
