import java.util.Scanner;

public class Task3_SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = Math.abs(scanner.nextInt());
        int sum = 0;
        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);
        System.out.println("Сумма цифр: " + sum);
    }
}
