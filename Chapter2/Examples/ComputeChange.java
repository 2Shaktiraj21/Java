package Chapter2.Examples;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        try (// Create a Scanner
        Scanner in = new Scanner(System.in)) {
            // Recieve the amount
            System.out.print("Enter an amount in double, for example 11.56: ");
            double amount = in.nextDouble();

            int remainingAmount = (int)(amount * 100);

            // Find the number of one dollars in the remaining amount
            int numberOfOneDollars = remainingAmount / 100;
            remainingAmount %= 100;

            // Find the number of quarters in the remaining amount
            int numberOfOneQaurters = remainingAmount / 25;
            remainingAmount %= 25;

            // Find the number of dimes in the remaining amount
            int numberOfDimes = remainingAmount / 10;
            remainingAmount %= 10;

            // Find the number of nickels in the remaining amount
            int numberOfNickels = remainingAmount / 5;
            remainingAmount %= 5;

            // Find the number of pennies in the remaining amount
            int numberOfPennies = remainingAmount;

            // Display results
            System.out.print("Your amount " + amount + " consists of");
            System.out.print(" " + numberOfOneDollars + " Dollars");
            System.out.print(" " + numberOfOneQaurters + " Qarters");
            System.out.print(" " + numberOfDimes + " Dimes");
            System.out.print(" " + numberOfNickels + " Nickels");
            System.out.print(" " + numberOfPennies + " Pennies");
        }
    }
}
