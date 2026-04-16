import java.util.*;

public class Task4_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();

        list.stream()
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}
