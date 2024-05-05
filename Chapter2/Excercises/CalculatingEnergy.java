package Chapter2.Excercises;

import java.util.Scanner;

public class CalculatingEnergy {
    public static void main(String[] args) {
        try (// Create a Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter the amount of water in kilograms
            System.out.print("Enter the amount of water in kilograms: ");
            double mass = in.nextDouble();

            // Prompt the user to enter the initial temperature of the water
            System.out.print("Enter the initial temperature: ");
            double initialTemperature = in.nextDouble();

            // Prompt the user to enter the final temperature of the water
            System.out.print("Enter the final temperature: ");
            double finalTemperature = in.nextDouble();

            // Calculate the energy
            double energy = mass * (finalTemperature - initialTemperature) * 4184;

            // Display the results
            System.out.println("The energy needed is " + energy + " joules");
        }
    }
}
