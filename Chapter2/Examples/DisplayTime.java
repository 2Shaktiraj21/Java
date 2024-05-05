package Chapter2.Examples;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Prompt the user for input
            System.out.println("Enter an integer for seconds: ");
            int seconds = in.nextInt();
            int minutes = seconds / 60; // Find minutes in seconds
            int remainingSeconds = seconds % 60; // Seconds remaining
            System.out.println(seconds + " seconds is " + minutes + " minutes and "+ remainingSeconds + " seconds ");
        }
    }
}
