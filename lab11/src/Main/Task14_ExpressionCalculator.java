import java.util.Scanner;
import javax.script.*;

public class ExpressionCalculator {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String expr = sc.nextLine();

        try {
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
            System.out.println(engine.eval(expr));
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
