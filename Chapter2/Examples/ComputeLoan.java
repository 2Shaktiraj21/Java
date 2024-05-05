package Chapter2.Examples;

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        try (// Create a Scanner
        Scanner in = new Scanner(System.in)) {
            // Enter annual interest rate in percentage, e.g., 7.25
            System.out.print("Enter annual interest rate, e.g., 7.25: ");
            double annualInterestRate = in.nextDouble();

            // Obtain monthly interest rate
            double monthlyInterestRate = annualInterestRate / 1200;

            // Enter number of years
            System.out.print("Enter number of years as an integer, e.g., 5: ");
            int numberOfYears = in.nextInt();

            // Enter loan amount
            System.out.print("Enter loan amount, e.g., 120000.95: ");
            double loanAmount = in.nextDouble();

            // Calculate monthly payment
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

            // Calculate total payment
            double totalPayment = monthlyPayment * numberOfYears * 12;

            // Display monthly payment and total payment
            System.out.println("The montly payment is $" + (int)(monthlyPayment * 100) / 100.0);
            System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
        }
    }
}
