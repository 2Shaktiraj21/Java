package Chapter2.Excercises;

import java.util.Scanner;

public class CalculateFutureInvestmentValue {
    public static void main(String[] args) {
        try (// Create Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt user to enter investment amount
            System.out.print("Enter investment amount: ");
            double investmentAmount = in.nextDouble();

            // Prompt user to enter interest rate in percentage
            System.out.print("Enter annual interest rate in percentage: ");
            double annualInterestRate = in.nextDouble();

            // Prompt user to enter number of years
            System.out.print("Enter number of years: ");
            int numberOfYears = in.nextInt();

            // Calculate future investment value
            double futureInvestmentValue = investmentAmount * Math.pow(1 + (annualInterestRate / 100), numberOfYears);

            // Display results
            System.out.println("Future value is " + futureInvestmentValue);
        }
    }
}
