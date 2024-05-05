package Chapter2.Excercises;

import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {
        double CP = 312032486.0, BF = 7.0, DF = 13.0, IF = 45.0;
        try (//Create a Scanner
        Scanner in = new Scanner(System.in)) {
            // Ask user to enter the no of years to be projected
            System.out.print("Enter the no of years to be projected: ");
            int P = in.nextInt();

            // Calculate population after P years
            double PP = CP + P * ((365.0 * 3600.0 * 24.0) / BF - (365.0 * 3600.0 * 24.0) / DF + (365.0 * 3600.0 * 24.0) / IF);

            // Display population after P years
            System.out.printf("Population after 5 years = %.0f", PP);
        }
    }
}
