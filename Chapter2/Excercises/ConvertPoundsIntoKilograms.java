package Chapter2.Excercises;

import java.util.Scanner;

public class ConvertPoundsIntoKilograms {
    public static void main(String[] args) {
        try (// Create Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter a number of pounds
            System.out.print("Enter the value for pounds : ");
            double pounds = in.nextDouble();

            // Convert pounds into kilograms
            double kilograms = pounds * 0.454;

            // Display results
            System.out.println(pounds + " pounds is " + kilograms + " kilograms");
        }
    }
}
