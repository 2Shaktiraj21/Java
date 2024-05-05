package Chapter2.Excercises;

import java.util.Scanner;

public class FindingRunwayLength {
    public static void main(String[] args) {
        try (// Create Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter the speed and acceleration
            System.out.print("Enter the speed and acceleration : ");
            double speed = in.nextDouble();
            double acceleration = in.nextDouble();

            // Calculating the length of runway
            double runwayLength = Math.pow(speed ,2) / (2 * acceleration);

            // Display results
            System.out.printf("The minimum length of the runway for this airplane is %.2f", runwayLength);
        }
    }    
}
