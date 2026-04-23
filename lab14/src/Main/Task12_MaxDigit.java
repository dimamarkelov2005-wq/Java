import java.util.Scanner;

public class Task12_MaxDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = Math.abs(scanner.nextInt());
        int max = 0;
        do {
            int digit = n % 10;
            if (digit > max) max = digit;
            n /= 10;
        } while (n > 0);
        System.out.println("Наибольшая цифра: " + max);
    }
}
