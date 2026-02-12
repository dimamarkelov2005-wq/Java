import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/':
                if (b != 0)
                    System.out.println(a / b);
                else
                    System.out.println("Ошибка");
                break;
            default:
                System.out.println("Неверная операция");
        }

        scanner.close();
    }
}
