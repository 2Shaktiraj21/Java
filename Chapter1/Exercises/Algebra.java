public class Algebra {
    public static void main(String[] args) {
        double a = 3.4, b = 50.2, c = 2.1 , d = 0.55 , e = 44.5 , f = 5.9;
        System.out.printf("The solution of this linear equation is x = %f and y = %f", (e *d - b * f) / (a * d - b *c) , (a * f - e * c) / (a * d - b * c));
    }
}
