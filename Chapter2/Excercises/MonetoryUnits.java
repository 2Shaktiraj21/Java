package Chapter2.Excercises;

import java.util.Scanner;

public class MonetoryUnits {
    public static void main(String[] args) {
        try (// Create a Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt user to enter the dollars in amount
            System.out.print("Enter One dollars in amount (like in 11.56 11 is one dollars) : ");
            int numberOfOneDollars = in.nextInt();

            // Prompt user to enter the cents after one dollars
            System.out.print("Enter the cents after one dollars (like 56 is number of cents in $11.56) : ");
            int remainingAmount = in.nextInt();

            // Calculate the amount
            double amount = numberOfOneDollars + (remainingAmount / 100.0);

            // Find the number of quarters in the remaining amount
            int numberOfOneQaurters = remainingAmount / 25;
            remainingAmount %= 25;

            // Find the number of dimes in the remaining amount
            int dimes = remainingAmount / 10;
            remainingAmount %= 10;

            // Find the number of nickels in the remaining amount
            int nickels = remainingAmount / 5;
            remainingAmount %= 5;
            
            // Find the number of pennies in the remaining amount
            int pennies = remainingAmount;

            // Display results
            System.out.println("Your amount " + amount + " consists of " + numberOfOneDollars + " dollars " + numberOfOneQaurters + " quarters " + dimes + " dimes " + nickels + " nickels " + pennies + " pennies ");
        }
    }
}
