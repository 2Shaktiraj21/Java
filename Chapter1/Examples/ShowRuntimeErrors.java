import java.util.Scanner;

public class ShowRuntimeErrors {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a:");
            int a = in.nextInt();
            System.out.println("Enter b:");
            int b = in.nextInt();
            System.out.println("a / b = " + (a / b));
        }
    }
}
