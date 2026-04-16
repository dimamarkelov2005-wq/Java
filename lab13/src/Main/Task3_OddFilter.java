import java.util.*;
public class Task3_OddFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите числа:");
        List<Integer> list = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();

        list.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
    }
}
