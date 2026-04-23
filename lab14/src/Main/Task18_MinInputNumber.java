import java.util.Scanner;

public class Task18_MinInputNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, min = Integer.MAX_VALUE;
        System.out.println("Вводите числа (0 для завершения):");
        do {
            n = scanner.nextInt();
            if (n != 0 && n < min) min = n;
        } while (n != 0);
        System.out.println("Минимальное число: " + (min == Integer.MAX_VALUE ? "не введено" : min));
    }
}
