import java.util.Scanner;

public class Task13_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int original = scanner.nextInt();
        int temp = Math.abs(original), reversed = 0;
        do {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        } while (temp > 0);
        System.out.println(Math.abs(original) == reversed ? "Это палиндром" : "Это не палиндром");
    }
}
