package Chapter2.Examples;

public class ShowCurrentTime {
    public static void main(String[] args) {
        // Obtain the total milliseconds since midnight 1 Jan, 1970
        long totalMilliSeconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight 1 Jan, 1970
        long totalSeconds = totalMilliSeconds / 1000 + (3600 * 5 + 1800) ;

        // Compute current second in the minute in hour
        int currentSecond = (int)(totalSeconds % 60);

        // Obtaining the total minutes
        long totalMinutes = totalSeconds / 60;

        // Obtaining current minute in hour
        int currentMinute =(int)(totalMinutes % 60);

        // Obtaining total hours
        long totalHours = totalMinutes / 60;

        // Obtaining current Hour in a day
        int currnetHour = (int)(totalHours % 24);

        // Display results
        System.out.println("Current time is " + currnetHour + " : " + currentMinute + " : " + currentSecond + " GMT (Locale + 5 : 30)");
    }
}
