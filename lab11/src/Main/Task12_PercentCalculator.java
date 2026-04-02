import java.util.Scanner;

public class PercentCalculator {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println((a/100)*b);
    }
}
