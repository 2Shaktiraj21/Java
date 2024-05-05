package Chapter2.Excercises;

import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
        try (// Create Scanner
        Scanner in = new Scanner(System.in)) {
            // Ask user to enter intial velocity in m/s, final velocity in m/s and time in seconds
            System.out.print("Enter v0, v1 and t: ");
            double v0 = in.nextDouble();
            double v1 = in.nextDouble();
            double t = in.nextDouble();

            // Calculate acceleration
            double a = (v1 - v0) / t;

            // Display results
            System.out.printf("The average acceleration is %.3f", a);
        }
    }
}