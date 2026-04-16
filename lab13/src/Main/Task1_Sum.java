import java.util.function.BinaryOperator;
import java.util.Scanner;

public class Task1_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 2 числа:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        BinaryOperator<Integer> sum = (x, y) -> x + y;
        System.out.println("Результат: " + sum.apply(a, b));
    }
}
