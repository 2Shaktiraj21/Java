package Chapter2.Excercises;

import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        try (// Create a Scanner
        Scanner in = new Scanner(System.in)) {
            // Promp the user to enter the Time zone offset to GMT
            System.out.print("Enter the time zone offset to GMT: ");
            double offset = in.nextDouble();

            long totalMilliSeconds = System.currentTimeMillis();

            // Find totalSeconds
            long totalSeconds = totalMilliSeconds / 1000 + (int)(offset * 3600);

            // Find Current Second
            long currentSecond = totalSeconds % 60;

            // Find Total Minutes
            long totalMinutes = totalSeconds / 60;

            // Find Current Minute
            long currentMinute = totalMinutes % 60;

            // Find Total Hours
            long totalHours = totalMinutes / 60;

            // Find Current Hour
            long currentHour = totalHours % 24;
            System.out.println("The current time is " + currentHour + " : " + currentMinute + " : " + currentSecond + " GMT ");
        }
    }
}
