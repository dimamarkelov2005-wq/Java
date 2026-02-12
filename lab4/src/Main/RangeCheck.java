import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num >= 10 && num <= 50)
            System.out.println("В диапазоне");
        else
            System.out.println("Вне диапазона");

        scanner.close();
    }
}
