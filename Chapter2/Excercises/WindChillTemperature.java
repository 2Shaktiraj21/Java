package Chapter2.Excercises;

import java.util.Scanner;

public class WindChillTemperature {
    public static void main(String[] args) {
        try (// Create a Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter the temperature between -58F and 41F
            System.out.print("Enter the temperature in Faherenheit in between -58F and 41F: ");
            double temperature = in.nextDouble();

            // Prompt the user to enter the wind speed(>= 2) in miles per hour
            System.out.print("Enter the wind speed(>= 2) in miles per hour: ");
            double v = in.nextDouble();

            // Calculate the wind chill index
            double windChillIndex = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(v, 0.16) + 0.4275 * temperature * Math.pow(v, 0.16);

            // Display results
            System.out.println("The wind chill index is " + windChillIndex);
        }
    }
}
