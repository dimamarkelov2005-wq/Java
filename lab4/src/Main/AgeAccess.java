import java.util.Scanner;

public class AgeAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18)
            System.out.println("Доступ разрешён");
        else
            System.out.println("Доступ запрещён");

        scanner.close();
    }
}
