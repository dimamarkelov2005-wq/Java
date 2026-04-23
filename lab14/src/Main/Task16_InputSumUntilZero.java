import java.util.Scanner;

public class Task16_InputSumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Вводите числа (0 для завершения):");
        do {
            n = scanner.nextInt();
            sum += n;
        } while (n != 0);
        System.out.println("Сумма всех введённых чисел: " + sum);
    }
}
