import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > 0)
            System.out.println("Положительное");
        else if (num < 0)
            System.out.println("Отрицательное");
        else
            System.out.println("Равно нулю");

        scanner.close();
    }
}
