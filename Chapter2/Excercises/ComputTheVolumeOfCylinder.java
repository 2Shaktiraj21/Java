package Chapter2.Excercises;

import java.util.Scanner;

public class ComputTheVolumeOfCylinder {
    public static void main(String[] args) {
        try (// Create a Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter the radius and length of Cylinder
            System.out.print("Enter the radius and length of Cylinder: ");
            double radius = in.nextDouble();
            double length = in.nextDouble();

            // Calculate the area of Cylinder
            double area = Math.PI * radius * radius;
            System.out.println("The area is " + area);

            // Calculate the volume of Cylinder
            double volume = area * length;
            System.out.println("The volume is " + volume);
        }
    }
}
