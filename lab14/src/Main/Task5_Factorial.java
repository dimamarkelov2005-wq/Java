import java.util.Scanner;

public class Task5_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        long factorial = 1;
        int i = 1;
        if (number > 0) {
            do {
                factorial *= i;
                i++;
            } while (i <= number);
        }
        System.out.println("Факториал: " + factorial);
    }
}
