package Chapter2.Excercises;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        try (// Create Scanner
        Scanner in = new Scanner(System.in)) {
            // Ask user to enter the weight in pounds
            System.out.print("Enter the weight in pounds : ");
            double weight = in.nextDouble();

            // Ask user to enter the height in inches
            System.out.print("Enter the height in inches : ");
            double height = in.nextDouble();

            // Calculate BMI
            double BMI = (weight * 0.45359237 / (Math.pow (0.0254 * height , 2)));

            // Display results
            System.out.println("The BMI is " + BMI);
        }
    }
}
