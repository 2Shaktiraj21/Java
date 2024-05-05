package Chapter2.Examples;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args){
        final double PI = 3.14159; // Declare a Constant

        try (// Create a Scanner Object
        Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter a radius
            System.out.print("Enter a number for radius: ");
            double radius = in.nextDouble();
            
            // Compute area
            double area = radius * radius * PI;

            // Display result
            System.out.println("The area for circle of radius " + radius + " is " + area);
        }
    }
}
