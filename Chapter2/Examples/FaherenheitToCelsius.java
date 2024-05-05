package Chapter2.Examples;

import java.util.Scanner;

public class FaherenheitToCelsius {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a degree in Faherenheit: ");
            double Faherenheit = in.nextDouble();

            // Convert to Celsius
            double Celsius = (5.0 / 9) * (Faherenheit - 32);
            // Display results
            System.out.println("Faherenhiet " + Faherenheit + " in Celsius is " + Celsius);
        }
    }
}
