package Chapter2.Excercises;

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        try (// Create a Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt user to enter balance and interest rate(annual)
            System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
            double balance = in.nextDouble();
            double annualInterestRate = in.nextDouble();

            // Calculate next monthly interest
            double monthlyintrest = (balance * annualInterestRate) / 1200;

            // Display results
            System.out.println("The interest is " + monthlyintrest);
        }
    }
}
