package Chapter2.Excercises;

import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        try (// Create Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter the distance
            System.out.print("Enter the distance: ");
            double distance = in.nextDouble();

            // Prompt the user to enter the miles per gallon
            System.out.print("Enter the miles per gallon: ");
            double mpg = in.nextDouble();

            // Prompt the user to enter the price per gallon
            System.out.print("Enter the price per gallon: ");
            double price = in.nextDouble();

            // Calculate the cost
            double cost = distance / mpg * price;

            // Display results
            System.out.println("The cost of driving is $" + cost);
        }
    }
}
