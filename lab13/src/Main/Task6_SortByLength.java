import java.util.*;

public class Task6_SortByLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = Arrays.asList(sc.nextLine().split(" "));

        list.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}
