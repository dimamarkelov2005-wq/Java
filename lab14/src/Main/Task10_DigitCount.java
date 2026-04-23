import java.util.Scanner;

public class Task10_DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        long n = Math.abs(scanner.nextLong());
        int count = 0;
        do {
            count++;
            n /= 10;
        } while (n > 0);
        System.out.println("Количество цифр: " + count);
    }
}
