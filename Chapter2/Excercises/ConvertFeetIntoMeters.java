package Chapter2.Excercises;

import java.util.Scanner;

public class ConvertFeetIntoMeters {
    public static void main(String[] args) {
        try (// Create Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter a number of feet
            System.out.print("Enter the value for feet : ");
            double feet = in.nextDouble();

            // Convert feet into meters
            double meters = feet * 0.305;

            // Display results
            System.out.println(feet + " feet is " + meters + " meters");
        }
    }
}
