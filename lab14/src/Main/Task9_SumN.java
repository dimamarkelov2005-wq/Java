import java.util.Scanner;

public class Task9_SumN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        int sum = 0, i = 1;
        do {
            sum += i;
            i++;
        } while (i <= n);
        System.out.println("Сумма от 1 до " + n + ": " + sum);
    }
}
