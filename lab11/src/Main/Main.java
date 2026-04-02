import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== LAB 11 =====");
            System.out.println("1 - Simple Calculator");
            System.out.println("2 - Loop Calculator");
            System.out.println("3 - Method Calculator");
            System.out.println("4 - GUI Calculator");
            System.out.println("5 - Power");
            System.out.println("6 - Square Root");
            System.out.println("7 - Negative Numbers");
            System.out.println("8 - Input Validation");
            System.out.println("9 - Menu Calculator");
            System.out.println("10 - History");
            System.out.println("11 - Clear Screen");
            System.out.println("12 - Percent");
            System.out.println("13 - Scientific Calculator");
            System.out.println("14 - Expression Calculator");
            System.out.println("0 - Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: SimpleCalculator.run(); break;
                case 2: LoopCalculator.run(); break;
                case 3: MethodCalculator.run(); break;
                case 4: GuiCalculator.run(); break;
                case 5: PowerCalculator.run(); break;
                case 6: SqrtCalculator.run(); break;
                case 7: NegativeNumberDemo.run(); break;
                case 8: InputValidationDemo.run(); break;
                case 9: MenuCalculator.run(); break;
                case 10: HistoryCalculator.run(); break;
                case 11: ClearScreenDemo.run(); break;
                case 12: PercentCalculator.run(); break;
                case 13: ScientificCalculator.run(); break;
                case 14: ExpressionCalculator.run(); break;
                case 0: return;
                default: System.out.println("Error!");
            }
        }
    }
}
