import java.util.Scanner;

public class LoopCalculator {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        String cont = "yes";

        while (cont.equalsIgnoreCase("yes")) {
            SimpleCalculator.run();
            System.out.print("Continue? ");
            cont = sc.next();
        }
    }
}
