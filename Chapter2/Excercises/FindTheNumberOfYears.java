package Chapter2.Excercises;

import java.util.Scanner;

public class FindTheNumberOfYears {
    public static void main(String[] args) {
        try (// Create Scanner
        Scanner in = new Scanner(System.in)) {
            // Promt User to enter the number of minutes
            System.out.print("Enter the number of minutes: ");
            long minutes = in.nextLong();

            // Find the number of years
            long numberOfYears = minutes / (365 * 24 * 60);
            long remainingMinutes = minutes % (365 * 24 * 60);

            // Find the number of days
            long numberOfDays = remainingMinutes / (24 * 60);

            // Display results
            System.out.println(minutes + " minutes is approximately " + numberOfYears + " years and " + numberOfDays + " days");
        }
    }
}
