public class ApproximatePi {
    public static void main(String[] args) {
        double sum = 0.0;
        for(int i = 1; i <= 1000000000 ; i++)
        {
            if(i % 2 == 0)
            {
                sum = sum - (1.0 / (2*i - 1));
            }
            else
            {
                sum = sum + (1.0 / (2*i - 1));
            }
        }
        System.out.println("Pi is = "+ 4.0 * sum);
    }
}
