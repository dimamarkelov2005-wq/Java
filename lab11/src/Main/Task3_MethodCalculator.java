import java.util.Scanner;

public class MethodCalculator {

    static double add(double a, double b) {
        return a + b;
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Sum = " + add(a, b));
    }
}
