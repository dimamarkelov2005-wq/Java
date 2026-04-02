import java.util.*;

public class InputValidationDemo {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        try {
            double x = sc.nextDouble();
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("Input error");
        }
    }
}
