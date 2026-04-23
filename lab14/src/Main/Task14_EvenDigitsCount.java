import java.util.Scanner;

public class Task14_EvenDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = Math.abs(scanner.nextInt());
        int count = 0;
        do {
            if ((n % 10) % 2 == 0) count++;
            n /= 10;
        } while (n > 0);
        System.out.println("Количество чётных цифр: " + count);
    }
}
