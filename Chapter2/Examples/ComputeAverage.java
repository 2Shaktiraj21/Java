package Chapter2.Examples;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        try (// Create a Scanner Object
        Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter three numbers
            System.out.println("Enter three numbers: ");
            double number1 = in.nextDouble();
            double number2 = in.nextDouble();
            double number3 = in.nextDouble();

            // Compute the average
            double average = (number1 + number2 + number3) / 3;

            //Display the results
            System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
        }
    }
}
