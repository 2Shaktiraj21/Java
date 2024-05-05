package Chapter2.Examples;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        try (// Create a Scanner Object
        Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter a radius
            System.out.print("Enter a number for radius : ");
            double radius = in.nextDouble();

            // Compute area
            double area = radius * radius * 3.14159;

            //Display results
            System.out.println("The area of circle of radius "+ radius + " is " + area);
        }
    }
}
