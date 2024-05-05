package Chapter2.Excercises;

import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {
        try (// Create Scanner
        Scanner in = new Scanner(System.in)) {
            // Prompt the user to enter the subtotal and gratutiy
            System.out.print("Enter the subtotal and gratuity rate: ");
            double subtotal = in.nextDouble();
            double gratuityRate = in.nextDouble();
            
            // Calculate the gratuity
            double gratuity = subtotal * (gratuityRate / 100);
            
            // Calculate the total
            double total = subtotal + gratuity;
            
            // Display results
            System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
        }
    }
}
