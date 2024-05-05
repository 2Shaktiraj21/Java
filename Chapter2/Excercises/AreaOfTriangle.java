package Chapter2.Excercises;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        try (// Create a Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter 3 points co-ordinates space seperated of a Triangle
            System.out.print("Enter the co-ordinates of 3 points space seperated of a Triangle like x1 y1 x2 y2 x3 y3: ");

            // Read the co-ordinates
            double x1 = in.nextDouble();
            double y1 = in.nextDouble();
            double x2 = in.nextDouble();
            double y2 = in.nextDouble();
            double x3 = in.nextDouble();
            double y3 = in.nextDouble();

            // Calculate the sides s1, s2, s3
            double s1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            double s2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
            double s3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

            // Calculate the half parementer
            double s = (s1 + s2 + s3) / 2;

            // Calculate the area
            double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));

            // Display results
            System.out.println("The area of the triangle is " + area);
        }   
    }
}
