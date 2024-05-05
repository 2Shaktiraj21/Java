package Chapter2.Examples;

import java.util.Scanner;

public class SalesTax {   
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the purcahse amount: ");
            double purcahseAmount = in.nextDouble();

            double tax = purcahseAmount * 0.06;
            System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
        }
    }
}