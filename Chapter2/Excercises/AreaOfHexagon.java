package Chapter2.Excercises;

import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args) {
        try (// Create Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter the side
            System.out.print("Enter the length of the side : ");
            double side = in.nextDouble();

            // Calculate the area
            double area = 3 * Math.sqrt(3) * Math.pow(side, 2) / 2;

            // Display results
            System.out.println("The area of the hexagon is " + area);
        }
    }
}
