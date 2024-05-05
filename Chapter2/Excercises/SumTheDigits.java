package Chapter2.Excercises;

import java.util.Scanner;

public class SumTheDigits {
    public static void main(String[] args) {
        try (// Create a Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter a number between 0 to 1000
            System.out.print("Enter a integer between 0 to 1000 : ");
            int number = in.nextInt();

            // Find the sum of the digits
            int sum = 0;
            sum = number % 10;
            number = number / 10;
            sum = sum + number % 10;
            number = number / 10;
            sum = sum + number;

            // Display result
            System.out.println("The sum of the digits is " + sum);
        }
    }
}
