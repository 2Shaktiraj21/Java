public class PopulationProjection {
    public static void main(String[] args) {
        double CP = 312032486.0, BF = 7.0, DF = 13.0, IF = 45.0, P = 5.0;
        System.out.printf("Population after 5 years = %.0f", CP + P * ( (365 * 24 * 3600) / BF + (365 * 24 * 3600) / DF + (365 * 24 * 3600) / IF));
    }
}
