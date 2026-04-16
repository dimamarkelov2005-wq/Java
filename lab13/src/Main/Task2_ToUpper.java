import java.util.function.Function;
import java.util.Scanner;

public class Task2_ToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = sc.nextLine();

        Function<String, String> f = s -> s.toUpperCase();
        System.out.println(f.apply(str));
    }
}
