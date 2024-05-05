package Chapter2.Excercises;

import java.util.Scanner;

public class DistanceOfTwoPoints {
    public static void main(String[] args) {
        try (// Create a Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt user to enter the x and y coordinates of the first point
            System.out.print("Enter the x and y coordinate of the first point: ");
            double x1 = in.nextDouble();
            double y1 = in.nextDouble();

            // Prompt user to enter the x and y coordinates of the second point
            System.out.print("Enter the x and y coordinate of the second point: ");
            double x2 = in.nextDouble();
            double y2 = in.nextDouble();

            // Calculate the distance
            double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

            // Display results
            System.out.println("The distance between the two points is " + distance);
        }
    }    
}
