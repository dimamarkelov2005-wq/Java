import java.util.Scanner;

public class RepeatSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);
        System.out.print("Сколько раз вывести?: ");
        int count = scanner.nextInt();

        int i = 0;
        while (i < count) {
            System.out.print(symbol);
            i++;
        }

        scanner.close();
    }
}
