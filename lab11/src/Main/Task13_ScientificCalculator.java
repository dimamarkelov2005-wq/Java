import java.util.Scanner;

public class ScientificCalculator {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        System.out.println(Math.sin(Math.toRadians(x)));
        System.out.println(Math.cos(Math.toRadians(x)));
        System.out.println(Math.tan(Math.toRadians(x)));
    }
}
