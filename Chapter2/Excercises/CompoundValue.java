package Chapter2.Excercises;

import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        try (// Create a Scanner
        Scanner in = new Scanner(System.in)) {
            double ci = 0.05;

            // Calculate monthly interest rate
            double mi = ci / 12;

            // Ask user to enter the monthly savings
            System.out.print("Enter the monthly savings : ");
            double s = in.nextDouble();

            // Calculate the compound value after 6 months
            double c = s + s * mi;
            c = (c + s)*(1 + mi);
            c = (c + s)*(1 + mi);
            c = (c + s)*(1 + mi);
            c = (c + s)*(1 + mi);
            c = (c + s)*(1 + mi);
    
            // Display results
            System.out.println("After 6 months the compound value is : " + c);
        }
    }    
}
