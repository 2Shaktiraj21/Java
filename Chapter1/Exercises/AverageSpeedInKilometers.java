public class AverageSpeedInKilometers {
    public static void main(String[] args) {
        double d = 24.0, h = 1.0, m = 40.0, s = 35.0, k = 1.6;
        System.out.printf("Average Speed in Kilometer Per Hour is %.2f", (d * k) / ((h * 3600.0 + m * 60.0 + s) / 3600));
    }
}
