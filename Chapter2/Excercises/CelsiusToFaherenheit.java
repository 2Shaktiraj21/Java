package Chapter2.Excercises;

import java.util.Scanner;

public class CelsiusToFaherenheit {
    public static void main(String[] args) {
        try (// Create a Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter a degree in Celsius
            System.out.print("Enter a degree in Celsius: ");
            double celsius = in.nextDouble();

            // Convert to Fahrenheit
            double fahrenheit = (9.0 / 5) * celsius + 32;

            // Display results
            System.out.println("Celsius " + celsius + " in Fahrenheit is " + fahrenheit);
        }
    }
}
